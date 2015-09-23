package ca.cimm.apps.dev.exception;

public class TechnicalException extends Throwable{

	private static final long serialVersionUID = -6648014665417393310L;

	public TechnicalException() {
		super();
	}

	public TechnicalException(String message, Throwable cause) {
		super(message, cause);
	}

	public TechnicalException(String message) {
		super(message);
	}

	public TechnicalException(Throwable cause) {
		super(cause);
	}

	
}
