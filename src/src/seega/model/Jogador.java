package src.seega.model;

public class Jogador {

    protected int numPecas = 0;

    public int informarNumPecas() {
        return numPecas;
    }

    public void decrementaNumPecas() {
        numPecas--;
    }

    public void incrementaNumPecas() {
        numPecas++;
    }

}
