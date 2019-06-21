package pqe.ecms.batchprocess.exception;

public class NoWorkToDoException extends Exception {
	public NoWorkToDoException(String message) {
		super(message);
	}

	public NoWorkToDoException(String message, Exception e) {
		super(message, e);
	}
}
