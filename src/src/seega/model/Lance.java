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
    protected boolean isPrimeiraColocacao;

    public Lance(int linha, int coluna, boolean retirada, boolean primeiraColocacao) {
        this.linha = linha;
        this.coluna = coluna;
        this.isRetirada = isRetirada;
        this.isPrimeiraColocacao = isPrimeiraColocacao;    
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
    
    public boolean isPrimeiraColocacao() {
        return this.isPrimeiraColocacao;
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public boolean isIsRetirada() {
        return isRetirada;
    }

    public boolean isIsPrimeiraColocacao() {
        return isPrimeiraColocacao;
    }
    
    
    
}
