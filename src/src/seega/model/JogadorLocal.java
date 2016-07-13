package src.seega.model;

public class JogadorLocal extends Jogador {

    protected boolean primeiraEscolha;
    protected Posicao pedraEscolhida;
    protected boolean jogadorBloqueado;
    protected boolean comeuPedra;

    public void defineDesbloqueado() {
        this.jogadorBloqueado = false;
    }

    public void defineBloqueado() {
        this.jogadorBloqueado = true;
    }

    public void defineComeuFalso() {
        this.comeuPedra = false;
    }

    public void defineComeuVerdadeiro() {
        this.comeuPedra = true;
    }

    public boolean informaPrimeiraEscolha() {
        return this.primeiraEscolha;
    }

    public void definePrimeiraEscolhaFalso() {
        this.primeiraEscolha = false;
    }

    public void definePrimeiraEscolhaVerdadeiro() {
        this.primeiraEscolha = true;
    }

    public boolean informaBloqueado() {
        return this.jogadorBloqueado;
    }

}
