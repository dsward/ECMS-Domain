package pqe.ecms.batchprocess.exception;

public class RetryException extends Exception {
	public RetryException(String message) {
		super(message);
	}

	public RetryException(String message, Exception e) {
		super(message, e);
	}
}
