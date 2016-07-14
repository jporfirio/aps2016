package src.seega.rede;

import br.ufsc.inf.leobr.cliente.Jogada;
import br.ufsc.inf.leobr.cliente.OuvidorProxy;
import br.ufsc.inf.leobr.cliente.Proxy;
import br.ufsc.inf.leobr.cliente.exception.ArquivoMultiplayerException;
import br.ufsc.inf.leobr.cliente.exception.JahConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoJogandoException;
import br.ufsc.inf.leobr.cliente.exception.NaoPossivelConectarException;
import src.seega.model.Lance;
import src.seega.model.Tabuleiro;
import src.seega.view.AtorJogador;

public class AtorNetGames implements OuvidorProxy {

    protected String servidor;
    protected AtorJogador jogador;
    protected Proxy proxy;
    protected Tabuleiro tabuleiro;
    
    public AtorNetGames(AtorJogador jogador){
        super();
        this.jogador = jogador;
        this.proxy = Proxy.getInstance();
        proxy.addOuvinte(this);
    }

    public void enviarPedra(int x, int y) {
        Lance lance = new Lance();
        lance.setPrimeiraPedraX(x);
        lance.setPrimeiraPedraY(y);
        lance.setTipoJogada(1); // 1 colocar, 2 mover, 3 remover, 4 passar vez
        enviarJogada(lance);
    }
    
    private void enviarJogada(Lance lance){
        try{
            proxy.enviaJogada(lance);
        } catch (NaoJogandoException e){
            
        }
    }

    public int conectar(String servidor) {
        try {
            proxy.conectar(servidor, "jogador");
            return 1;
        } catch (JahConectadoException | NaoPossivelConectarException | ArquivoMultiplayerException e){
            
        }
        return 2;
    }

    public void desconectar() {
        try {
            proxy.desconectar();
        } catch (NaoConectadoException e) {
            
        }
    }

    public void iniciarPartida() {
        try {
            proxy.iniciarPartida(2);
        } catch (NaoConectadoException e) {
            
        }
    }

    public void enviarMovimento(int origemX, int origemY, int destinoX, int destinoY) {
        Lance lance = new Lance();
        lance.setPrimeiraPedraX(origemX);
        lance.setPrimeiraPedraY(origemY);
        lance.setSegundaPedraX(destinoX);
        lance.setSegundaPedraY(destinoY);
        lance.setTipoJogada(2);
        enviarJogada(lance);
    }

    public void passarVez() {
        Lance lance = new Lance();
        lance.setTipoJogada(4);
        enviarJogada(lance);
    }

    public void receberPedra(int x, int y) {
        jogador.receberPedra(x, y);
    }

    public void receberMovimento(int origemX, int origemY, int destinoX, int destinoY) {
        jogador.receberMovimento(origemX, origemY, destinoX, destinoY);
    }

    public void receberRemocao(int x, int y) {
        jogador.receberRemocao(x, y);
    }

    public void receberSolicitacaoInicio() {
        jogador.receberSolicitacaoInicio();
    }

    public void receberVez() {
        jogador.receberVez();
    }

    public void removerPedra(int x, int y) {
        Lance lance = new Lance();
        lance.setPrimeiraPedraX(x);
        lance.setPrimeiraPedraY(y);
        lance.setTipoJogada(3);
        enviarJogada(lance);
    }

    @Override
    public void receberJogada(Jogada jogada) {
        Lance lance = (Lance) jogada;
        switch(lance.getTipoJogada()){
            case 1: // colocar pedra
                receberPedra(lance.getPrimeiraPedraX(), lance.getPrimeiraPedraY());
                break;
            case 2: // mover pedra
                receberMovimento(lance.getPrimeiraPedraX(), lance.getPrimeiraPedraY(),
                        lance.getSegundaPedraX(), lance.getSegundaPedraY());
                break;
            case 3: // remover pedra
                receberRemocao(lance.getPrimeiraPedraX(), lance.getPrimeiraPedraY());
                break;
            case 4: // passar vez
                receberVez();
                break;
        }
    }
    
    @Override
    public void iniciarNovaPartida(Integer posicao) {
        receberSolicitacaoInicio();
    }

    @Override
    public void finalizarPartidaComErro(String message) {

    }

    @Override
    public void receberMensagem(String msg) {

    }

    @Override
    public void tratarConexaoPerdida() {

    }

    @Override
    public void tratarPartidaNaoIniciada(String message) {
        
    }

}
