package src.seega.model;

public class Jogador {

	protected String nome;
	protected int numPecas;

	public int informarNumPecas() {
		return numPecas;
	}

	public void decrementaNumPecas() {
		numPecas--;
	}

	public void incrementaNumPecas() {
		numPecas++;
	}
        
        //MÉTODOS NOVOS QUE NÃO CONSTAM NO DIAGRAMA DE CLASSE
        
        public void setNome(String nome) {
            this.nome = nome;
        }
        
        public String getNome() {
            return this.nome;
        }

}