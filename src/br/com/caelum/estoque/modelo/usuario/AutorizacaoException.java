package br.com.caelum.estoque.modelo.usuario;

import javax.xml.ws.WebFault;

@WebFault(name="AutorizacaoFault")
public class AutorizacaoException extends Exception {

	public AutorizacaoException(String mensagem) {
		super(mensagem);
	}
	
	public String getFaulInfo() {
		return "Token inv�lido";
	}

}
