package pqe.ecms.batchprocess.exception;

public class BatchRetreivalException extends Exception {
	public BatchRetreivalException(String message) {
		super(message);
	}

	public BatchRetreivalException(String message, Exception e) {
		super(message, e);
	}
}
