package br.com.trabalho.business;

public class UsuarioCadastradoException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1446171197911995347L;

	public UsuarioCadastradoException() {
		super("Usu�rio j� est� cadastrado para o cpf informado!");
	}
}
