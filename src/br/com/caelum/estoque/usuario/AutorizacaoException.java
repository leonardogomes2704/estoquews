package br.com.caelum.estoque.usuario;

import javax.xml.ws.WebFault;

@WebFault(name="AutorizaçãoFaut")
public class AutorizacaoException extends Exception {
	


	public AutorizacaoException(String mensagem) {
		super(mensagem);
	}
	
	public String getFaultInfo() {
		return "Token Inválido";
	}

}
