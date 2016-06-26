package src.seega.model;

import javax.swing.JOptionPane;

public class Tabuleiro {

	protected JogadorLocal jogadorLocal;
	protected Jogador jogadorRemoto;
	protected Posicao[][] posicoes = new Posicao[5][5];
	protected boolean faseInicial;
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
		// TODO - implement Tabuleiro.verificaGanhador
		throw new UnsupportedOperationException();
	}

        //M3 e M4 - Notificação de derrota / vitória
	public void enviaMensagemDerrota() {
		JOptionPane.showMessageDialog(null, "Que pena! Você perdeu! :[");

	}

	public void enviaMensagemVitoria() {
		JOptionPane.showMessageDialog(null, "Parabéns! Você venceu! :D");
	}

	//M5 - Remover Pedra do Tabuleiro
	public void removerPedra(int posicaoX, int posicaoY) {
		// TODO - implement Tabuleiro.removerPedra
		throw new UnsupportedOperationException();
	}

        //M6 - Verificar se o jogador comeu pedra
	public void verificarComeuPedra() {
		// TODO - implement Tabuleiro.verificarComeuPedra
		throw new UnsupportedOperationException();
	}

        //ESSE MÉTODO TEM A VER COM O CLICK NO TABULEIRO
	//M7 - Colocar 2 pedras no tabuleiro por jogador
	public void colocarPedra(int posicaoX, int posicaoY) {
		// TODO - implement Tabuleiro.colocarPedra
		throw new UnsupportedOperationException();
	}

        //M8 - Passar a vez para o outro jogador
	public void passarVez() {
            if (vezDoJogadorLocal) {
                vezDoJogadorLocal = false;
            } else {
                vezDoJogadorLocal = true;
            }        
	}

        //M9, M10, M11 e M12 - Tirei o conectar, o desconectar, o notificarSucessoConexão e o iniciarPartida daqui!
       
        //M13 - Escolher posição da pedra a ser movida e posição desejada para mover
	public void escolherPosicao() {
		throw new UnsupportedOperationException();
	}

        //M14 - Mudar fase do jogo
	public void mudarFase() {
		faseInicial = false;
	}

        //M15 - Receber movimento do jogador Remoto, atualizando tabuleiro local
	public void receberMovimento(Posicao origem, Posicao destino) {
		// TODO - implement Tabuleiro.receberMovimento
		throw new UnsupportedOperationException();
	}

        //M16 - Receber remoção de pedra do jogador remoto, atualizando tabuleiro local
	public void receberRemocaoPedra(Posicao pedra) {
		// TODO - implement Tabuleiro.receberRemocaoPedra
		throw new UnsupportedOperationException();
	}

        //M17 - Receber vez do outro jogador
	public void receberVez() {
            vezDoJogadorLocal = true;              
	}

        //M18 - Receber solicitação de inicio após o Jogador Remoto iniciar o jogo
        //Esse é o método TratarIniciarPartida do AtorJogador
	public void receberSolicitacaoInicio() {
		// TODO - implement Tabuleiro.receberSolicitacaoInicio
		throw new UnsupportedOperationException();
	}
       
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
        for (int linha = 1; linha <= 5; linha++) {
            for (int coluna = 1; coluna <= 5; coluna++) {
                posicoes[(linha-1)][(coluna-1)] = new Posicao();
               
            }
        }
        posicoes[2][2].setCentral(true);
    }
    
    //esvazia as posições a cada novo jogo
     public void esvaziarPosicoes() {
        for (int linha = 1; linha <= 5; linha++) {
            for (int coluna = 1; coluna <=5; coluna++) {
                posicoes[(linha - 1)][(coluna - 1)].esvaziar();
                
            }
        }
        
        posicoes[2][2].setCentral(true);
        jogadorLocal = null;
        jogadorRemoto = null;
        partidaEmAndamento = false;
    }

    public String informarEstado() {
        String mensagem = null;
        if (this.informarEmAndamento()) {
            if (vezDoJogadorLocal) {
                if(jogadorLocal.primeiraEscolha) {
                    mensagem = "Vez do jogador " + jogadorLocal.getNome() + " colocar a primeira pedra no tabuleiro.";
                } else {
                    mensagem = "Vez do jogador " + jogadorLocal.getNome() + " colocar a segunda pedra no tabuleiro.";
                }
            } else {
                mensagem = "Vez do jogador remoto!";
            }
        } else {
            mensagem = "Partida não está em andamento!";
            if (haGanhador) {
            if (jogadorRemoto.informarNumPecas() == 0) {
                mensagem = "Jogador "+jogadorLocal.getNome()+" foi o vencedor. Parabéns!";
            } else {
                mensagem = "Jogador "+jogadorRemoto.getNome()+" foi o vencedor. Parabéns!";
            }
            }
        }

        
        return mensagem;
     
    }
    
    public void receberJogada(Lance jogada) {
        int linha = jogada.informarLinha();
        int coluna = jogada.informarColuna();
        boolean isPrimeiraColocacao = jogada.isPrimeiraColocacao();
        boolean isMover = jogada.isMover();
        boolean isRetirada = jogada.isRetirada();
        
        //primeira fase
        if (!isMover && !isRetirada) {
            
            if (isPrimeiraColocacao) {
                
            } else {
                passarVez();
            }
            
        //segunda fase
        } else {
            if (isMover) {
                
            }
            
            if (isRetirada) {
                
            }
            
        }
        
    }

    //GETTERS

   public Posicao[][] informarPosicoes() {
        return posicoes;
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