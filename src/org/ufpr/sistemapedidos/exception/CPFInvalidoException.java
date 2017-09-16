package org.ufpr.sistemapedidos.exception;

public class CPFInvalidoException extends RuntimeException {

	private static final long serialVersionUID = 3806339638263778394L;

	public CPFInvalidoException() {
		super("CPF informado é inválido!");
	}
	
}
