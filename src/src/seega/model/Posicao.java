package src.seega.model;

public class Posicao {

	protected Jogador jogadorOcupante;
	protected boolean ocupada;
	protected boolean podeMover;
	protected Posicao posicaoAcima;
	protected Posicao posicaoAbaixo;
	protected Posicao posicaoEsquerda;
	protected Posicao posicaoDireita;
	protected boolean central;
        protected int linha; //NÃO CONSTA NO DIAGRAMA DE CLASSE
        protected int coluna; //NÃO CONSTA NO DIAGRAMA DE CLASSE


	public Jogador informarJogadorOcupante() {
            return jogadorOcupante;
	}

	//Não vejo utilidade para este método aqui, pois o Tabuleiro que terá o Array de Posicoes
	public Posicao informarPosicao(int posicaoX, int posicaoY) {
		// TODO - implement Posicao.informarPosicao
		throw new UnsupportedOperationException();
	}

        //valida se posição pode ser removida. Verificar se a posição escolhida para remoção possui alguma posição adjacente do outro jogador
	public boolean validarRemover() {
		if ((posicaoAcima != null && posicaoAcima.informarJogadorOcupante() != jogadorOcupante) ||
                      (posicaoAbaixo != null && posicaoAbaixo.informarJogadorOcupante() != jogadorOcupante) ||
                        (posicaoEsquerda != null && posicaoEsquerda.informarJogadorOcupante() != jogadorOcupante) || 
                            (posicaoDireita != null && posicaoDireita.informarJogadorOcupante() != jogadorOcupante)) {
                    return true;
                }
        return false; 
	}

        //remove jogador ocupante
	public void removeJogador() {
            jogadorOcupante = null;
	}

        //valida se aquela posição está bloqueada
	public boolean validarBloqueio() {
            if ((posicaoAcima != null && posicaoAcima.informarJogadorOcupante() == null) ||
                   (posicaoAbaixo != null && posicaoAbaixo.informarJogadorOcupante() == null) ||
                    (posicaoDireita != null && posicaoDireita.informarJogadorOcupante() == null) ||
                    (posicaoEsquerda != null && posicaoEsquerda.informarJogadorOcupante() == null)) {
                podeMover = true;
                return false;
            } else {
                podeMover = false;
                return true;
            }
	}

        //retorna se posição pode ser ocupada
	public boolean validarOcupacao() {
            if (!central && !ocupada) {
                return true;
            } else {
                return false;
            }
	}

	public boolean informaOcupada() {
            return ocupada;
	}

	public boolean informaCentral() {
            return central;
	}

	
	public void defineJogador(Jogador jogador) {
            this.jogadorOcupante = jogador;
	}

	public boolean informarPodeMover() {
            return podeMover;
	}

	//TEM A VER COM O CLICK DO ATOR JOGADOR, NAO VEJO UTILIDADE DESSE METODO AQUI
	public void definePosicao(Posicao posicao, int coordenadaX, int coordenadaY) {
		// TODO - implement Posicao.definePosicao
		throw new UnsupportedOperationException();
	}

	public void setCentral(boolean isCentral) {
            this.central = isCentral;
	}

        
        
       //MÉTODOS QUE NÃO CONSTAM NO DIAGRAMA DE CLASSE 
       public void esvaziar() {
            this.jogadorOcupante = null;
            this.ocupada = false;
       }
    
        public int getLinha() {
            return linha;
        }

        public int getColuna() {
            return coluna;
        }

        public void setLinha(int linha) {
            this.linha = linha;
        }

        public void setColuna(int coluna) {
            this.coluna = coluna;
        }
        
        
        
        public Posicao getPosicaoAcima() {
            return posicaoAcima;
        }

        public Posicao getPosicaoAbaixo() {
            return posicaoAbaixo;
        }

        public Posicao getPosicaoEsquerda() {
            return posicaoEsquerda;
        }

        public Posicao getPosicaoDireita() {
            return posicaoDireita;
        }

        public void setPosicaoAcima(Posicao posicaoAcima) {
            this.posicaoAcima = posicaoAcima;
        }

        public void setPosicaoAbaixo(Posicao posicaoAbaixo) {
            this.posicaoAbaixo = posicaoAbaixo;
        }

        public void setPosicaoEsquerda(Posicao posicaoEsquerda) {
            this.posicaoEsquerda = posicaoEsquerda;
        }

        public void setPosicaoDireita(Posicao posicaoDireita) {
            this.posicaoDireita = posicaoDireita;
        }
        
        
        
        public void setOcupada(boolean ocupada) {
            this.ocupada = ocupada;
        }

 
}