package src.seega.model;

import br.ufsc.inf.leobr.cliente.Jogada;

public class Lance implements Jogada {

    protected int primeiraPedraX;
    protected int primeiraPedraY;
    protected int segundaPedraX;
    protected int segundaPedraY;
    protected int tipoJogada; // 1 colocar, 2 mover, 3 remover, 4 passar vez

    public int getPrimeiraPedraX() {
        return primeiraPedraX;
    }

    public void setPrimeiraPedraX(int primeiraPedraX) {
        this.primeiraPedraX = primeiraPedraX;
    }

    public int getPrimeiraPedraY() {
        return primeiraPedraY;
    }

    public void setPrimeiraPedraY(int primeiraPedraY) {
        this.primeiraPedraY = primeiraPedraY;
    }

    public int getSegundaPedraX() {
        return segundaPedraX;
    }

    public void setSegundaPedraX(int segundaPedraX) {
        this.segundaPedraX = segundaPedraX;
    }

    public int getSegundaPedraY() {
        return segundaPedraY;
    }

    public void setSegundaPedraY(int segundaPedraY) {
        this.segundaPedraY = segundaPedraY;
    }

    public int getTipoJogada() {
        return tipoJogada;
    }

    public void setTipoJogada(int tipoJogada) {
        this.tipoJogada = tipoJogada;
    }

    
    
}
