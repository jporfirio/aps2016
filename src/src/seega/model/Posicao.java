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
    protected int linha, coluna;

    public Jogador informarJogadorOcupante() {
        return jogadorOcupante;
    }

    public Posicao informarPosicao(int posicaoX, int posicaoY) {
        return this;
    }

    public boolean validarRemover() {
        if( (posicaoAcima != null && jogadorOcupante != posicaoAcima.informarJogadorOcupante())
                || (posicaoAbaixo != null && jogadorOcupante != posicaoAbaixo.informarJogadorOcupante())
                || (posicaoEsquerda != null && jogadorOcupante != posicaoEsquerda.informarJogadorOcupante())
                || (posicaoDireita != null && jogadorOcupante != posicaoDireita.informarJogadorOcupante()) ){
            jogadorOcupante.decrementaNumPecas();
            removeJogador();
            return true;
        }
        return false;
    }

    public void removeJogador() {
        jogadorOcupante = null;
        ocupada = false;
    }

    public boolean validarLiberdade() {
        if((posicaoAbaixo != null && !posicaoAbaixo.informaOcupada())
                || (posicaoAcima != null && !posicaoAcima.informaOcupada())
                || (posicaoDireita != null && !posicaoDireita.informaOcupada())
                || (posicaoEsquerda != null && !posicaoEsquerda.informaOcupada())){
            podeMover = true;
            return true;
        }
        podeMover = false;
        return false;
    }

    public boolean validarOcupacao() {
        if((posicaoAcima != null && posicaoAcima.informarJogadorOcupante() != null && jogadorOcupante != posicaoAcima.informarJogadorOcupante()
                && posicaoAbaixo != null && posicaoAbaixo.informarJogadorOcupante() != null && jogadorOcupante != posicaoAbaixo.informarJogadorOcupante())
                || (posicaoDireita != null && posicaoDireita.informarJogadorOcupante() != null && jogadorOcupante != posicaoDireita.informarJogadorOcupante()
                && posicaoEsquerda != null && posicaoEsquerda.informarJogadorOcupante() != null && jogadorOcupante != posicaoEsquerda.informarJogadorOcupante())){
            jogadorOcupante.decrementaNumPecas();
            removeJogador();
            return false;
        }
        return true;
    }

    public boolean informaOcupada() {
        return ocupada;
    }

    public boolean informaCentral() {
        return central;
    }

    public void defineJogador(Jogador jogador) {
        this.jogadorOcupante = jogador;
        this.ocupada = true;
    }

    public boolean informarPodeMover() {
        return podeMover;
    }

    public void setCentral() {
        this.central = true;
    }

    void setLinha(int linha) {
        this.linha = linha;
    }

    void setColuna(int coluna) {
        this.coluna = coluna;
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
    
    

}
