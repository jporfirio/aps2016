package src.seega.model;

import src.seega.rede.AtorNetGames;
import src.seega.view.AtorJogador;

public class Tabuleiro {

    protected JogadorLocal jogadorLocal;
    protected Jogador jogadorRemoto;
    protected Posicao[][] posicoes;
    protected boolean faseInicial;
    protected boolean partidaEmAndamento;
    protected boolean vezDoJogadorLocal;
    protected boolean haGanhador;
    protected boolean conectado;
    protected AtorJogador atorJogador;
    protected AtorNetGames atorNetgames;

    public void verificarJogadorBloqueado() {
        jogadorLocal.defineBloqueado();
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(posicoes[i][j].informarJogadorOcupante() == jogadorLocal){
                    if(posicoes[i][j].validarLiberdade()){
                        jogadorLocal.defineDesbloqueado();
                    }
                }
            }
        }
    }

    public void verificaGanhador() {
        if(jogadorLocal.informarNumPecas() <= 1){
            haGanhador = true;
            partidaEmAndamento = false;
            atorJogador.notificarFimJogo(false);
        } else if (jogadorRemoto.informarNumPecas() <= 1){
            haGanhador = true;
            partidaEmAndamento = false;
            atorJogador.notificarFimJogo(true);
        }
    }

    public int removerPedra(int posicaoX, int posicaoY) {
        Posicao posicao = posicoes[posicaoX][posicaoY];
        if(posicao.informarJogadorOcupante() == jogadorRemoto){
            boolean removeu = posicao.validarRemover();
            if(removeu){
                verificaGanhador();
                passarVez();
                return 31; // removida com sucesso
            }
            return 32; // nao desbloqueia
        }
        return 33; // pedra do jogador local
    }

    public void verificarComeuPedra() {
        jogadorLocal.defineComeuFalso();
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(posicoes[i][j].informarJogadorOcupante() == jogadorRemoto){
                    if(!posicoes[i][j].validarOcupacao()){
                        jogadorLocal.defineComeuVerdadeiro();
                    }
                }
            }
        }
    }

    public int colocarPedra(int posicaoX, int posicaoY) {
        Posicao posicao = posicoes[posicaoX][posicaoY];
        boolean ocupada = posicao.informaOcupada();
        boolean central = posicao.informaCentral();
        if(!ocupada && !central){
            posicao.defineJogador(jogadorLocal);
            boolean primeiraEscolha = jogadorLocal.informaPrimeiraEscolha();
            jogadorLocal.incrementaNumPecas();
            atorNetgames.enviarPedra(posicaoX, posicaoY);
            if(primeiraEscolha){
                jogadorLocal.definePrimeiraEscolhaFalso();
                return 11; // colocou a primeira pedra
            } else {
                jogadorLocal.definePrimeiraEscolhaVerdadeiro();
                if(jogadorLocal.informarNumPecas() == 12 && jogadorRemoto.informarNumPecas() == 12){
                    mudarFase();
                    return 14; // colocou a segunda pedra e mudou de fase
                } else {
                    passarVez();
                    return 13; // colocou a segunda pedra e passou a vez
                }
            }
        }
        return 12; // selecionou uma posicao invalida
    }

    public void passarVez() {
        vezDoJogadorLocal = false;
        atorNetgames.passarVez();
    }

    public void iniciarPartida() {
        vezDoJogadorLocal = true;
        jogadorLocal = new JogadorLocal();
    }

    public int escolherPosicao(int x, int y) {
        Posicao posicao = posicoes[x][y];
        boolean primeiraEscolha = jogadorLocal.informaPrimeiraEscolha();
        if(primeiraEscolha){
            if(posicao.informarJogadorOcupante() == jogadorLocal){
                boolean podeMover = posicao.informarPodeMover();
                if(podeMover){
                    jogadorLocal.pedraEscolhida = posicao;
                    jogadorLocal.definePrimeiraEscolhaFalso();
                    return 21; // selecionou origem
                }
                return 23; // selecionou pedra bloqueada
            }
            return 22; // selecionou pedra do adversario
        } else {
            boolean posicaoOcupada = posicao.informaOcupada();
            Posicao origem = jogadorLocal.pedraEscolhida;
            if(!posicaoOcupada 
                    && (posicao.posicaoAcima == origem
                    || posicao.posicaoAbaixo == origem
                    || posicao.posicaoEsquerda == origem
                    || posicao.posicaoDireita == origem)){
                origem.removeJogador();
                posicao.defineJogador(jogadorLocal);
                atorNetgames.enviarMovimento(origem.linha, origem.coluna, x, y);
                jogadorLocal.pedraEscolhida = null;
                jogadorLocal.definePrimeiraEscolhaVerdadeiro();
                verificarComeuPedra();
                if(!jogadorLocal.comeuPedra){
                    passarVez();
                } else {
                    verificaGanhador();
                }
                return 24; // movimento efetuado
            }
            return 25; // destino invalido
        }
    }

    public void mudarFase() {
        faseInicial = false;
        verificarJogadorBloqueado();
    }

    public void receberMovimento(int origemX, int origemY, int destinoX, int destinoY) {
        Posicao origem = posicoes[origemX][origemY];
        Posicao destino = posicoes[destinoX][destinoY];
        origem.removeJogador();
        destino.defineJogador(jogadorRemoto);
    }

    public void receberRemocao(int x, int y) {
        Posicao posicao = posicoes[x][y];
        posicao.removeJogador();
        jogadorLocal.decrementaNumPecas();
        verificaGanhador();
    }

    public void receberVez() {
        vezDoJogadorLocal = true;
        verificarJogadorBloqueado();
    }

    public void receberSolicitacaoInicio() {
        posicoes = new Posicao[5][5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                posicoes[i][j] = new Posicao();
                posicoes[i][j].setLinha(i);
                posicoes[i][j].setColuna(j);
                if(i == 3 && j == 3){
                    posicoes[i][j].setCentral();
                }
            }
        }
        jogadorRemoto = new Jogador();
        if(jogadorLocal == null){
            jogadorLocal = new JogadorLocal();
            vezDoJogadorLocal = false;
        }
    }

    public void defineConectado(boolean estadoConexao) {
        conectado = estadoConexao;
    }

    public int[][] informarEstadoPosicoes() {
        int[][] estadoPosicoes = new int[5][5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(posicoes[i][j].informaOcupada()){
                    if(posicoes[i][j].informarJogadorOcupante() == jogadorLocal){
                        if(posicoes[i][j].informarPodeMover()){
                            estadoPosicoes[i][j] = 11;
                        } else {
                            estadoPosicoes[i][j] = 12;
                        }
                    } else {
                        estadoPosicoes[i][j] = 2;
                    }
                } else {
                    estadoPosicoes[i][j] = 0;
                }
                if(faseInicial && posicoes[i][j].informaCentral()){
                    estadoPosicoes[i][j] = 3;
                }
            }
        }        
        return estadoPosicoes;
    }

    public int informarEstadoJogo() {
        if(partidaEmAndamento){
            if(faseInicial){
                if(vezDoJogadorLocal) return 11;
                else return 12;
            } else {
                if(vezDoJogadorLocal){
                    if(jogadorLocal.informaBloqueado()) return 23;
                    else return 21;
                } else {
                    return 22;
                }
            }
        } else {
            return 0;
        }
    }

    public boolean informarJogadorBloqueado() {
        return jogadorLocal.informaBloqueado();
    }

    public boolean informarFaseInicial() {
        return faseInicial;
    }

    public boolean informarVezJogadorLocal() {
        return vezDoJogadorLocal;
    }

    public void receberPedra(int x, int y) {
        Posicao posicao = posicoes[x][y];
        posicao.defineJogador(jogadorRemoto);
        jogadorRemoto.incrementaNumPecas();
        int numPecasRemoto = jogadorRemoto.informarNumPecas();
        int numPecasLocal = jogadorLocal.informarNumPecas();
        if(numPecasLocal == 12 && numPecasRemoto == 12){
            mudarFase();
        }
    }

}
