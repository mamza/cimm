package ca.cimm.apps.dev.exception;

public class FunctionalException extends Throwable {

	private static final long serialVersionUID = 2645181921535593190L;

	public FunctionalException() {
		super();
	}

	public FunctionalException(String message, Throwable cause) {
		super(message, cause);
	}

	public FunctionalException(String message) {
		super(message);
	}

	public FunctionalException(Throwable cause) {
		super(cause);
	}

	
}
