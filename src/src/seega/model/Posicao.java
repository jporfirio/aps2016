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
        protected int linha;
        protected int coluna;


	public Jogador informarJogadorOcupante() {
            return jogadorOcupante;
	}

	//Não vejo utilidade para este método aqui, pois o Tabuleiro que terá o Array de Posicoes
	public Posicao informarPosicao(int posicaoX, int posicaoY) {
		// TODO - implement Posicao.informarPosicao
		throw new UnsupportedOperationException();
	}

        //valida se posição pode ser removida com os outros atributos
	public boolean validarRemover() {
		// TODO - implement Posicao.validarRemover
		throw new UnsupportedOperationException();
	}

        //remove jogador ocupante
	public void removeJogador() {
            jogadorOcupante = null;
	}

        //valida se aquela posição está bloqueada
	public boolean validarBloqueio() {
		// TODO - implement Posicao.validarBloqueio
		throw new UnsupportedOperationException();
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

	/**
	 * 
	 * @param posicao
	 * @param coordenadaX
	 * @param coordenadaY
	 */
	public void definePosicao(Posicao posicao, int coordenadaX, int coordenadaY) {
		// TODO - implement Posicao.definePosicao
		throw new UnsupportedOperationException();
	}

	public void setCentral(boolean isCentral) {
            this.central = isCentral;
	}

        
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
        
        public void setOcupada(boolean ocupada) {
            this.ocupada = ocupada;
        }

 
}