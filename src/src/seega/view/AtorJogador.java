package src.seega.view;

import src.seega.model.Jogador;
import src.seega.model.JogadorLocal;
import src.seega.model.Lance;
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
    protected InterfaceSeega janela;

    public AtorJogador(InterfaceSeega janela) {
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

    public InterfaceSeega informarJanela() {
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
        boolean primeiraEscolha;
        if (tabuleiro.isVezDoJogadorLocal()){
            JogadorLocal jogadorLocal = tabuleiro.getJogadorLocal();
            primeiraEscolha = jogadorLocal.informaPrimeiraEscolha();            
        } else {
            Jogador jogadorRemoto = tabuleiro.getJogadorRemoto();
        }
        if (emAndamento) {
            
            //CRIAR CLICK NA CLASSE TABULEIRO RETORNANDO RESULTADO DA JOGADA
            
//            resultado = tabuleiro.click(linha, coluna);
//            if ((resultado == 10) || (resultado == 9)) {
//                this.enviarJogada(linha, coluna);
//            }
        }
        else {
            resultado = 11;
        }
        return resultado;
    }

    public void enviarLance(int linha, int coluna) {
        //ENVIAR LANCE AO NETGAMES
        
     //   Lance jogada = tabuleiro.informarJogada(linha, coluna);
     //   rede.enviarJogada(jogada);
    }


    public void tratarIniciarPartida(int posicao) {
        tabuleiro.esvaziarPosicoes();
        tabuleiro.criarJogador(idUsuario);
        String idJogador = rede.informarNomeAdversario(idUsuario);
        tabuleiro.criarJogador(idJogador);
    }

    public void receberJogada(Lance jogada) {
//      tabuleiro.receberJogada(jogada);
    }
}
