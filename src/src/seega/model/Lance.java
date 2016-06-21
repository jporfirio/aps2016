/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.seega.model;

import br.ufsc.inf.leobr.cliente.Jogada;

/**
 *
 * @author Felipe & Jeann
 */
public class Lance implements Jogada {
    protected int linha;
    protected int coluna;
    protected boolean isRetirada;
    
    public void assumir(int linha, int coluna, boolean isRetirada) {
        this.linha = linha;
        this.coluna = coluna;
        this.isRetirada = isRetirada;
    }
    
    public int informarLinha() {
        return this.linha;
    }

    public int informarColuna() {
        return this.coluna;
    }
    
    public boolean isRetirada() {
        return this.isRetirada;
    }
}
