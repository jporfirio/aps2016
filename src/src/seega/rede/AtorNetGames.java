package src.seega.rede;

import br.ufsc.inf.leobr.cliente.Jogada;
import br.ufsc.inf.leobr.cliente.OuvidorProxy;
import br.ufsc.inf.leobr.cliente.Proxy;
import br.ufsc.inf.leobr.cliente.exception.ArquivoMultiplayerException;
import br.ufsc.inf.leobr.cliente.exception.JahConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoJogandoException;
import br.ufsc.inf.leobr.cliente.exception.NaoPossivelConectarException;
import javax.swing.JOptionPane;
import src.seega.model.Lance;
import src.seega.view.AtorJogador;

public class AtorNetGames implements OuvidorProxy {

    protected AtorJogador atorJogador;
	protected Proxy proxy;
	
	public AtorNetGames (AtorJogador interfaceGraf){
		super();
		this.atorJogador = interfaceGraf;
		this.proxy = Proxy.getInstance();
		proxy.addOuvinte(this);	
	}

	public boolean conectar(String servidor, String nome) {
		try {
			proxy.conectar(servidor, nome);
			return true;
		} catch (JahConectadoException e) {            
                        JOptionPane.showMessageDialog(atorJogador.informarJanela(), e.getMessage());
			e.printStackTrace();
			return false;
		} catch (NaoPossivelConectarException e) {                        
                        JOptionPane.showMessageDialog(atorJogador.informarJanela(), e.getMessage());
			e.printStackTrace();
			return false;
		} catch (ArquivoMultiplayerException e) {
                        JOptionPane.showMessageDialog(atorJogador.informarJanela(), e.getMessage());
			e.printStackTrace();
			return false;
		}
	}

	public boolean desconectar() {
		try {
			proxy.desconectar();
			return true;
		} catch (NaoConectadoException e) {
                        JOptionPane.showMessageDialog(atorJogador.informarJanela(), e.getMessage());
			e.printStackTrace();
			return false;
		}
	}

	public void iniciarPartida() {
		try {
			proxy.iniciarPartida(new Integer(2));
		} catch (NaoConectadoException e) {
                        JOptionPane.showMessageDialog(atorJogador.informarJanela(), e.getMessage());
			e.printStackTrace();
		}
	}

	public void enviarJogada(Lance lance) {
		try {
			proxy.enviaJogada(lance);
		} catch (NaoJogandoException e) {
                        JOptionPane.showMessageDialog(atorJogador.informarJanela(), e.getMessage());
			e.printStackTrace();
		}
	}

	public String informarNomeAdversario(String idUsuario) {
		String aux1 = proxy.obterNomeAdversario(new Integer(1));
		String aux2 = proxy.obterNomeAdversario(new Integer(2));;
		if (aux1.equals(idUsuario)){
			return aux2;
		} else {
			return aux1;
		}		
}

	public void receberJogada(Jogada jogada) {
		Lance estado = (Lance) jogada;
		atorJogador.receberJogada(estado);
	}

	public void finalizarPartidaComErro(String message) {
		// TODO Auto-generated method stub
		
	}

	public void receberMensagem(String msg) {
		// TODO Auto-generated method stub
		
	}

	public void tratarConexaoPerdida() {
		// TODO Auto-generated method stub
		
	}

	public void tratarPartidaNaoIniciada(String message) {
		// TODO Auto-generated method stub
		
	}

	public void iniciarNovaPartida(Integer posicao) {
		atorJogador.tratarIniciarPartida(posicao);
	}
	


}