package pqe.ecms.batchprocess.exception;

public class BatchCreationException extends Exception {
	public BatchCreationException(String message) {
		super(message);
	}

	public BatchCreationException(String message, Exception e) {
		super(message, e);
	}
}
