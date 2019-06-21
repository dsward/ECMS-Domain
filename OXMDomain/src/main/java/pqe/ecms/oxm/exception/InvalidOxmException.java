package pqe.ecms.oxm.exception;

public class InvalidOxmException extends Exception {

	public InvalidOxmException() {
	}

	public InvalidOxmException(String message) {
		super(message);
	}

	public InvalidOxmException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidOxmException(Throwable cause) {
		super(cause);
	}

	public InvalidOxmException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
