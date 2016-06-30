package src.seega.model;

import javax.swing.JOptionPane;
import src.seega.view.AtorJogador;

public class Tabuleiro {

	protected JogadorLocal jogadorLocal;
	protected Jogador jogadorRemoto;
	protected Posicao[][] posicoes = new Posicao[5][5];
	protected boolean faseInicial = true;
	protected boolean partidaEmAndamento;
	protected boolean vezDoJogadorLocal; 
	protected boolean haGanhador;
	protected boolean conectado;

        public boolean informarConectado() {
            return this.conectado;
        }
        
        public boolean informarFaseInicial() {
            return this.faseInicial;
        }
        
       public boolean informarEmAndamento() {
            return this.partidaEmAndamento;
       }
        
         public void estabelecerConectado(boolean valor) {
            this.conectado = valor;
        }
        
         
        //M1 - Verificar se Jogador está bloqueado no tabuleiro
	public boolean verificarJogadorBloqueado(Jogador jogador) {
            return false;
	}

        //M2 - Verificar se há ganhador na partida
	public void verificaGanhador() {
		if (jogadorLocal.informarNumPecas() < 2) {
                    enviaMensagemDerrota(jogadorLocal); 
                    
                    haGanhador = true;
                    partidaEmAndamento = false;
                } else {
                    if (jogadorRemoto.informarNumPecas() < 2) {
                        enviaMensagemVitoria(jogadorLocal);
                    }         
                }
	}

        //M3 - Notificação de derrota
	public void enviaMensagemDerrota(Jogador jogador) {
		JOptionPane.showMessageDialog(null, "Que pena "+jogador.getNome()+"! Você perdeu! :[");
	}
        
        //M4 - Notificação de vitória
	public void enviaMensagemVitoria(Jogador jogador) {
		JOptionPane.showMessageDialog(null, "Parabéns "+jogador.getNome()+"! Você venceu! :D");
	}

	//M5 - Remover Pedra do Tabuleiro
	public void removerPedra(Jogador jogador, int posicaoX, int posicaoY) {
		Posicao posicao = informarPosicao(posicaoX, posicaoY);
                posicao.defineJogador(null);
                posicao.setOcupada(false);
	}

        //M6 - Verificar se o jogador comeu pedra
	public boolean verificarComeuPedra(AtorJogador jogo) {
                boolean comeuPedra = false;
		 for (Posicao[] posicaoArray : posicoes) {
                        for (Posicao posicao : posicaoArray) {
                            if (posicao.informarJogadorOcupante() == jogadorRemoto) {
                                if ((posicao.getPosicaoAbaixo().informarJogadorOcupante() == jogadorLocal && posicao.getPosicaoAcima().informarJogadorOcupante() == jogadorLocal) ||
                                        (posicao.getPosicaoEsquerda().informarJogadorOcupante() == jogadorLocal && posicao.getPosicaoDireita().informarJogadorOcupante() == jogadorLocal)) {
                                    removerPedra(jogadorRemoto, posicao.getLinha(), posicao.getColuna());
                                    jogo.enviarLance(posicao.getLinha(), posicao.getColuna(), false, false, false, true);
                                    jogadorRemoto.decrementaNumPecas();
                                    jogadorLocal.defineComeuVerdadeiro();
                                    comeuPedra=true;
                                }
                            }
                        }
                 }
                 
                 return comeuPedra;
	}

	//M7 - Colocar 2 pedras no tabuleiro por jogador
	public void colocarPedra(Jogador jogador, int posicaoX, int posicaoY) {
		Posicao posicao = informarPosicao(posicaoX, posicaoY);
                posicao.defineJogador(jogador);
                posicao.setOcupada(true);
	}

        //M8 - Passar a vez para o outro jogador
	public void passarVez() {
                vezDoJogadorLocal = false;
	}

        //M9, M10, M11 e M12 - Tirei o conectar, o desconectar, o notificarSucessoConexão e o iniciarPartida daqui e coloquei no AtorJogador!
        
        //Tem a ver com o método click do AtorJogador
        //M13 - Escolher posição da pedra a ser movida e posição desejada para mover
	public void escolherPosicao() {
		throw new UnsupportedOperationException();
	}

        //M14 - Mudar fase do jogo
	public void mudarFase() {
		faseInicial = false;
	}

        //Tratei isso no receberJogada, tem que verificar
        //M15 - Receber movimento do jogador Remoto, atualizando tabuleiro local
	public void receberMovimento(Posicao origem, Posicao destino) {
		// TODO - implement Tabuleiro.receberMovimento
		throw new UnsupportedOperationException();
	}

        //Tratei isso no receberJogada, tem que verificar
        //M16 - Receber remoção de pedra do jogador remoto, atualizando tabuleiro local
	public void receberRemocaoPedra(Posicao pedra) {
		// TODO - implement Tabuleiro.receberRemocaoPedra
		throw new UnsupportedOperationException();
	}

        //M17 - Receber vez do outro jogador
	public void receberVez() {
            vezDoJogadorLocal = true;              
	}

        //Tratei isso no método tratarIniciarPartida do AtorJogador
        //M18 - Receber solicitação de inicio após o Jogador Remoto iniciar o jogo  
	public void receberSolicitacaoInicio() {
		// TODO - implement Tabuleiro.receberSolicitacaoInicio
		throw new UnsupportedOperationException();
	}
       
        
        
        //MÉTODOS NOVOS QUE NÃO CONSTAM NO DIAGRAMAS DE CLASSE
        
        
        //Instanciar os dois jogadores
        public void criarJogador(String idJogador) {
        if (jogadorLocal == null) {
            jogadorLocal = new JogadorLocal();
            jogadorLocal.setNome(idJogador);
            
        } else {
            jogadorRemoto = new Jogador();
            jogadorRemoto.setNome(idJogador);
        }
    }
        
    //inicializa as posições na instanciação do Tabuleiro
    public void inicializarPosicoes() {
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                posicoes[(linha)][(coluna)] = new Posicao();
                posicoes[(linha)][(coluna)].setLinha(linha);
                posicoes[(linha)][(coluna)].setColuna(coluna);
                
          
            }
        }
        posicoes[2][2].setCentral(true);
        inicializaAdjacentes();
    }
    
    public void inicializaAdjacentes() {
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                if (linha - 1 != -1) {
                    posicoes[(linha)][(coluna)].setPosicaoAcima(posicoes[(linha-1)][(coluna)]);
                } else {
                    posicoes[(linha)][(coluna)].setPosicaoAcima(null);
                }
                
                if (linha +1 != 5) {
                    posicoes[(linha)][(coluna)].setPosicaoAbaixo(posicoes[(linha+1)][(coluna)]);
                } else {
                    posicoes[(linha)][(coluna)].setPosicaoAbaixo(null);
                }
                if (coluna - 1 != -1) {
                    posicoes[(linha)][(coluna)].setPosicaoEsquerda(posicoes[(linha)][(coluna-1)]);
                } else {
                    posicoes[(linha)][(coluna)].setPosicaoEsquerda(null);
                }
                if (coluna + 1 != 5) {
                    posicoes[(linha)][(coluna)].setPosicaoDireita(posicoes[(linha)][(coluna+1)]);
                } else {
                    posicoes[(linha)][(coluna)].setPosicaoDireita(null);
                }
            }
        }
    }
    
    //esvazia as posições a cada nova rodada
     public void esvaziarPosicoes() {
        for (int linha = 1; linha <= 5; linha++) {
            for (int coluna = 1; coluna <=5; coluna++) {
                posicoes[(linha - 1)][(coluna - 1)].esvaziar();
                
            }
        }
     }

   public Posicao informarPosicao(int linha, int coluna) {
       for (Posicao[] posicaoArray : posicoes) {
           for (Posicao posicao : posicaoArray) {
                if (posicao.getLinha() == linha && posicao.getColuna() == coluna) {
                    return posicao;
                }
           }
       }
       return null;
   }

    public Posicao[][] getPosicoes() {
        return posicoes;
    }

    public JogadorLocal getJogadorLocal() {
        return jogadorLocal;
    }

    public Jogador getJogadorRemoto() {
        return jogadorRemoto;
    }

    public boolean isVezDoJogadorLocal() {
        return vezDoJogadorLocal;
    }

    public boolean isHaGanhador() {
        return haGanhador;
    }

    public void estabelecerEmAndamento(boolean valor) {
            this.partidaEmAndamento = valor;
    }
    
    public void setarDaVez(int posicao) {
        if (posicao == 1) {
            vezDoJogadorLocal = true;
        } else {
            vezDoJogadorLocal = false;
        }
    }
   

}