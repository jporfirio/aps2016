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
        if(jogadorOcupante != posicaoAcima.informarJogadorOcupante()
                || jogadorOcupante != posicaoAbaixo.informarJogadorOcupante()
                || jogadorOcupante != posicaoEsquerda.informarJogadorOcupante()
                || jogadorOcupante != posicaoDireita.informarJogadorOcupante()){
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
        if(!posicaoAbaixo.informaOcupada()
                || !posicaoAcima.informaOcupada()
                || !posicaoDireita.informaOcupada()
                || !posicaoEsquerda.informaOcupada()){
            podeMover = true;
            return true;
        }
        podeMover = false;
        return false;
    }

    public boolean validarOcupacao() {
        if((jogadorOcupante != posicaoAcima.informarJogadorOcupante()
                && jogadorOcupante != posicaoAbaixo.informarJogadorOcupante())
                || (jogadorOcupante != posicaoDireita.informarJogadorOcupante()
                && jogadorOcupante != posicaoEsquerda.informarJogadorOcupante())){
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

}
