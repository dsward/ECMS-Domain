package pqe.ecms.batchprocess.exception;

public class FatalException extends Exception {
	public FatalException(String message) {
		super(message);
	}

	public FatalException(String message, Exception e) {
		super(message, e);
	}
}
