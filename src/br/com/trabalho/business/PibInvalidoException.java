package br.com.trabalho.business;

public class PibInvalidoException extends Exception {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 8513843675676480854L;

	public PibInvalidoException() {
		super("Valor do PIB nao pode ser menor que a populacao!");
	}
}
