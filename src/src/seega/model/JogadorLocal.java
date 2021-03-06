package src.seega.model;

public class JogadorLocal extends Jogador {

	protected boolean primeiraEscolha = true; 
	protected Posicao pedraEscolhida;
	protected boolean jogadorBloqueado;
	protected boolean comeuPedra;

	public void defineDesbloqueado() {
            jogadorBloqueado = false;
	}

	public void defineBloqueado() {
            jogadorBloqueado = true;
	}

	public void defineComeuFalso() {
            comeuPedra = false;
	}

	public void defineComeuVerdadeiro() {
            comeuPedra = true;
	}

	public boolean informaPrimeiraEscolha() {
		return primeiraEscolha;
	}

	public void definePrimeiraEscolhaFalso() {
		primeiraEscolha = false;
	}

	public void definePrimeiraEscolhaVerdadeiro() {
		primeiraEscolha = true;
	}

        
        //MÉTODOS NOVOS QUE NAO ESTÃO NO DIAGRAMA DE CLASSE
        public boolean isJogadorBloqueado() {
            return jogadorBloqueado;
        }
        
        
        

}