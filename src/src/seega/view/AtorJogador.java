package src.seega.view;

import javax.swing.JOptionPane;
import src.seega.model.Jogador;
import src.seega.model.JogadorLocal;
import src.seega.model.Lance;
import src.seega.model.Posicao;
import src.seega.model.Tabuleiro;
import src.seega.rede.AtorNetGames;

/**
 *
 * @author Felipe
 */
public class AtorJogador {
    
    protected String idUsuario;
    protected AtorNetGames rede;
    protected Tabuleiro tabuleiro;
    protected Interface janela;

    public AtorJogador(Interface janela) {
        super();
        rede = new AtorNetGames(this);
        this.janela = janela;
        tabuleiro = new Tabuleiro();
        tabuleiro.inicializarPosicoes();
    }

    public int conectar() {
        boolean conectado = tabuleiro.informarConectado();
        if (!conectado) {
            String servidor = this.obterDadosConexao();
            boolean exito = rede.conectar(servidor, idUsuario);
            if (exito) {
                tabuleiro.estabelecerConectado(true);
                return 0;
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    public Interface informarJanela() {
        return janela;
    }

    public String obterDadosConexao() {
        idUsuario = janela.obterIdJogador();
        String servidor = janela.obterIdServidor();
        return servidor;
    }

    public int desconectar() {
        boolean conectado = tabuleiro.informarConectado();
        if (conectado) {
            boolean exito = rede.desconectar();
            if (exito) {
                tabuleiro.estabelecerConectado(false);
                return 3;
            } else {
                return 5;

            }
        } else {
            return 4;
        }
    }
        
    public int iniciarPartida() {
        boolean conectado = tabuleiro.informarConectado();
        boolean emAndamento = tabuleiro.informarEmAndamento();
        
        if (!emAndamento && conectado) {
            rede.iniciarPartida();
            return 6;
        }
        if (!conectado) {
            return 7;
        }
        return 13;
    }
    

//evento de click numa posição do tabuleiro
    public int click(int linha, int coluna) {
        int resultado = 0;
        boolean emAndamento = tabuleiro.informarEmAndamento();
        boolean faseInicial = tabuleiro.informarFaseInicial();
        boolean haGanhador = tabuleiro.isHaGanhador();
        Posicao posicao = tabuleiro.informarPosicao(linha, coluna);
        boolean ocupada = tabuleiro.informarPosicao(linha, coluna).isOcupada();
        boolean central = tabuleiro.informarPosicao(linha, coluna).isCentral();
        JogadorLocal jogadorLocal = tabuleiro.getJogadorLocal();
        Jogador jogadorRemoto = tabuleiro.getJogadorRemoto();
        boolean primeiraEscolha;
        
        
        //colocar pedra
        if (emAndamento && faseInicial) {
            if (tabuleiro.isVezDoJogadorLocal()){
                if (!central && !ocupada) {
                    posicao.defineJogador(jogadorLocal);
                    
                    primeiraEscolha = jogadorLocal.informaPrimeiraEscolha();
                    
                    enviarLance(linha, coluna, false, primeiraEscolha, false);
                    
                    if (primeiraEscolha) {
                        
                        jogadorLocal.definePrimeiraEscolhaFalso();
                        tabuleiro.informarEstado();
                    } else {
                        jogadorLocal.definePrimeiraEscolhaVerdadeiro();
                        int jogLocal = jogadorLocal.informarNumPecas();
                        int jogRemoto = jogadorRemoto.informarNumPecas();
                        
                        if (jogLocal==12 && jogRemoto ==12) {
                            tabuleiro.mudarFase();
                        } else {
                            tabuleiro.passarVez();
                        }
                    }
                }
            
                
            } else {
                
                //aqui a vez é do jogador Remoto
                tabuleiro.informarEstado();
            } 
         
        //segunda fase
        } else if (emAndamento && !faseInicial) {
            
            if (jogadorLocal.informarNumPecas() == 0 || jogadorRemoto.informarNumPecas() == 0) {
                haGanhador = true;
            } 
        } else {
            JOptionPane.showMessageDialog(null, "Jogo não está em andamento");
            resultado = 11;
        }

        return resultado;
    }

    public void enviarLance(int linha, int coluna, boolean isRetirada, boolean isPrimeiraColocacao, boolean isMover) { 
        Lance jogada = new Lance(linha, coluna, isRetirada, isPrimeiraColocacao, isMover);
        rede.enviarJogada(jogada);
    }


    //indica que a partida foi aceita
    public void tratarIniciarPartida(int posicao) {
        tabuleiro.esvaziarPosicoes();
        tabuleiro.criarJogador(idUsuario);
        String idJogador = rede.informarNomeAdversario(idUsuario);
        tabuleiro.criarJogador(idJogador);
        tabuleiro.estabelecerEmAndamento(true);
        
        //aqui ele seta o jogador local como da vez
        tabuleiro.setarDaVez(posicao);
        tabuleiro.informarEstado();

    }

    public void receberJogada(Lance jogada) {
        tabuleiro.receberJogada(jogada);
    }
}
