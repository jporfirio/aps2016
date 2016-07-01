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
        return 9;
    }
    

//evento de click numa posição do tabuleiro
    public int click(int linha, int coluna) {
        int resultado = 0;
        boolean emAndamento = tabuleiro.informarEmAndamento();
        boolean faseInicial = tabuleiro.informarFaseInicial();
        boolean haGanhador = tabuleiro.isHaGanhador();
        Posicao posicao = tabuleiro.informarPosicao(linha, coluna);
        boolean ocupada = tabuleiro.informarPosicao(linha, coluna).informaOcupada();
        boolean central = tabuleiro.informarPosicao(linha, coluna).informaCentral();
        JogadorLocal jogadorLocal = tabuleiro.getJogadorLocal();
        Jogador jogadorRemoto = tabuleiro.getJogadorRemoto();
        boolean primeiraEscolha;
        
        if (tabuleiro.isVezDoJogadorLocal()) {
            //colocar pedra
            if (emAndamento && faseInicial) {
                    if (!central && !ocupada) {
                        tabuleiro.colocarPedra(jogadorLocal, linha, coluna);
                        janela.atualizarTabuleiro(tabuleiro);
                        primeiraEscolha = jogadorLocal.informaPrimeiraEscolha();
                        enviarLance(linha, coluna, false, primeiraEscolha, false, false);
                        jogadorLocal.incrementaNumPecas();
                        resultado = 1;
                        if (primeiraEscolha) {
                            jogadorLocal.definePrimeiraEscolhaFalso();
                        } else {
                            jogadorLocal.definePrimeiraEscolhaVerdadeiro();
                            
                            
                            int jogLocal = jogadorLocal.informarNumPecas();
                            int jogRemoto = jogadorRemoto.informarNumPecas();
                            
                            if (jogLocal==12 && jogRemoto ==12) {
                                tabuleiro.mudarFase();                              
                                janela.atualizarTabuleiro(tabuleiro);
                                resultado=11;
                                verificaBloqueio();
                                jogadorLocal.definePrimeiraEscolhaVerdadeiro();
                                if (jogadorLocal.isJogadorBloqueado()) {
                                    resultado=13;
                                }
                            } else {
                                tabuleiro.passarVez();
                                janela.atualizarTabuleiro(tabuleiro);
                            }
                        }
                    } else if (central) {
                        resultado = 3;
                    } else {
                        resultado = 2;
                    }

            //segunda fase
            } else if (emAndamento && !faseInicial) {                                               
                verificaBloqueio();          
                if (jogadorLocal.isJogadorBloqueado()) {
                    if (posicao.informarJogadorOcupante() instanceof JogadorLocal) {
                        resultado=12;
                    } else {
                        
                        if (posicao.validarRemover()) {
                            tabuleiro.removerPedra(jogadorRemoto, linha, coluna);
                            janela.atualizarTabuleiro(tabuleiro);
                            jogadorRemoto.decrementaNumPecas();
                            jogadorLocal.defineDesbloqueado();
                            tabuleiro.passarVez();
                            enviarLance(linha, coluna, true, false, false, false);

                        }
                    }                
                } else {
                     primeiraEscolha = jogadorLocal.informaPrimeiraEscolha();
                     
                     if (primeiraEscolha) {
                         
                         if (posicao.informarJogadorOcupante() instanceof JogadorLocal) {
                             posicao.validarBloqueio();
                             if (posicao.informarPodeMover()) {
                                 tabuleiro.removerPedra(jogadorLocal, linha, coluna);
                                 jogadorLocal.definePrimeiraEscolhaFalso();
                                 enviarLance(linha, coluna, false, true, true, false);
                             }
                         } else {
                             resultado=5;
                         }

                     } else {
                         
                         if (posicao.informarJogadorOcupante() == null) {
                             tabuleiro.colocarPedra(jogadorLocal, linha, coluna);
                             janela.atualizarTabuleiro(tabuleiro);
                             jogadorLocal.definePrimeiraEscolhaVerdadeiro();
                             enviarLance(linha, coluna, false, false, true, false);
                             
                             if (tabuleiro.verificarComeuPedra(this)) {
                                 janela.atualizarTabuleiro(tabuleiro);
                             } else {
                                 tabuleiro.passarVez();
                                 tabuleiro.verificaGanhador();
                             }
                         } else {
                             resultado=2;
                         }                    
                     }               
                }               
                if (jogadorLocal.informarNumPecas() == 0 || jogadorRemoto.informarNumPecas() == 0) {
                    haGanhador = true;
                    resultado = 8;
                } 
            } else {
                resultado = 7;
            }
        } else {
            resultado = 9;
        }
        return resultado;
    }

    public void enviarLance(int linha, int coluna, boolean isRetirada, boolean isPrimeiraColocacao, boolean isMover, boolean isComer) { 
        Lance jogada = new Lance(linha, coluna, isRetirada, isPrimeiraColocacao, isMover, isComer);
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

    }

    public void receberJogada(Lance jogada) {
        int linha = jogada.informarLinha();
        int coluna = jogada.informarColuna();
        Posicao posicao = tabuleiro.informarPosicao(linha, coluna);
        boolean isPrimeiraColocacao = jogada.isPrimeiraColocacao();
        boolean isMover = jogada.isMover();
        boolean isRetirada = jogada.isRetirada();
        boolean isComer = jogada.isComer();
    
        //primeira fase
        if (!isMover && !isRetirada) {
                tabuleiro.colocarPedra(tabuleiro.getJogadorRemoto(), linha, coluna);
                tabuleiro.getJogadorRemoto().incrementaNumPecas();
                janela.atualizarTabuleiro(tabuleiro);
                
                if (!isPrimeiraColocacao) {
                    tabuleiro.receberVez();
                } else {
                    tabuleiro.passarVez();
                }
                if (tabuleiro.getJogadorLocal().informarNumPecas()==12 && tabuleiro.getJogadorRemoto().informarNumPecas()==12) {
                    tabuleiro.mudarFase();
                    janela.atualizarTabuleiro(tabuleiro);
                 }         
            
        //segunda fase
        } else {
            if (isMover && isPrimeiraColocacao) { //primeira colocação do mover           
                tabuleiro.removerPedra(tabuleiro.getJogadorRemoto(), linha, coluna);
                tabuleiro.passarVez();               
            } else if (isMover && !isPrimeiraColocacao) { //segunda colocação do mover            
                tabuleiro.colocarPedra(tabuleiro.getJogadorRemoto(), linha, coluna);
                janela.atualizarTabuleiro(tabuleiro);
                tabuleiro.receberVez();              
            } else if (!isMover && isRetirada) { //remover pedra
                tabuleiro.removerPedra(tabuleiro.getJogadorLocal(), linha, coluna);
                tabuleiro.getJogadorLocal().decrementaNumPecas();
                janela.atualizarTabuleiro(tabuleiro);
                tabuleiro.receberVez();              
            } else if (isComer) { //comer pedra
                tabuleiro.removerPedra(tabuleiro.getJogadorLocal(), linha, coluna);
                tabuleiro.getJogadorLocal().decrementaNumPecas();
                janela.atualizarTabuleiro(tabuleiro);
                tabuleiro.passarVez();
                tabuleiro.verificaGanhador();
            }         
        }
    }
 
    public boolean verificaBloqueio() {
        JogadorLocal jogadorLocal = tabuleiro.getJogadorLocal();    
        for (Posicao[] posicaoArray : tabuleiro.getPosicoes()) {
                    for (Posicao posicaoTabuleiro : posicaoArray) {
                        if (posicaoTabuleiro.informarJogadorOcupante() == jogadorLocal &&
                                !posicaoTabuleiro.validarBloqueio()) {
                            jogadorLocal.defineDesbloqueado();
                            return false;
                            
                        } 
                    }
       }
        jogadorLocal.defineBloqueado();
        return true;
    }
}
