package src.seega.view;

import src.seega.model.Tabuleiro;
import src.seega.rede.AtorNetGames;

public class AtorJogador {

    protected Tabuleiro tabuleiro;
    protected AtorNetGames netgames;
    protected IInterface interfaceGrafica;

    public AtorJogador(IInterface interfaceGrafica){
        this.interfaceGrafica = interfaceGrafica;
        netgames = new AtorNetGames(this);
        tabuleiro = new Tabuleiro(netgames);
    }
    
    public int conectar(String servidor) {
        int retorno = netgames.conectar(servidor);
        if(retorno == 1){
            tabuleiro.defineConectado(true);
        } else {
            tabuleiro.defineConectado(false);
        }
        return retorno;
    }

    public void desconectar() {
        netgames.desconectar();
        tabuleiro.defineConectado(false);
    }

    public void iniciarPartida() {
        tabuleiro.iniciarPartida();
        netgames.iniciarPartida();
    }

    public void receberPedra(int x, int y) {
        tabuleiro.receberPedra(x, y);
        interfaceGrafica.atualizarTabuleiro();
    }

    public void receberMovimento(int origemX, int origemY, int destinoX, int destinoY) {
        tabuleiro.receberMovimento(origemX, origemY, destinoX, destinoY);
        interfaceGrafica.atualizarTabuleiro();
    }

    public void receberRemocao(int x, int y) {
        tabuleiro.receberRemocao(x, y);
        interfaceGrafica.atualizarTabuleiro();
    }

    public void receberSolicitacaoInicio() {
        tabuleiro.receberSolicitacaoInicio();
        interfaceGrafica.atualizarTabuleiro();
    }

    public void receberVez() {
        tabuleiro.receberVez();
        interfaceGrafica.atualizarTabuleiro();
    }

    public void notificarFimJogo(boolean vitoriaLocal) {
        interfaceGrafica.notificarFimJogo(vitoriaLocal);
    }

    public int[][] informarEstadoPosicao() {
        return tabuleiro.informarEstadoPosicoes();
    }

    public int informarEstadoJogo() {
        return tabuleiro.informarEstadoJogo();
    }

    public int click(int x, int y) {
        boolean faseInicial = tabuleiro.informarFaseInicial();
        boolean vezJogadorLocal = tabuleiro.informarVezJogadorLocal();
        if(faseInicial && vezJogadorLocal){
            return tabuleiro.colocarPedra(x, y);
        } else if(vezJogadorLocal) {
            boolean bloqueado = tabuleiro.informarJogadorBloqueado();
            if(bloqueado) {
                return tabuleiro.removerPedra(x, y);
            } else {
                return tabuleiro.escolherPosicao(x, y);
            }
        }
        return 1; //não é a vez do jogador local
    }
}
