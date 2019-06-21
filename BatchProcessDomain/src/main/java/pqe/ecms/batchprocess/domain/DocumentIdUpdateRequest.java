package pqe.ecms.batchprocess.domain;

public class DocumentIdUpdateRequest {
	public enum DocumentIdStatus {
		PENDING,
		ERROR,
		COMPLETE
	}

	private DocumentIdStatus documentIdStatus;
	private String message;

	public DocumentIdStatus getDocumentIdStatus() {
		return documentIdStatus;
	}

	public void setDocumentIdStatus(DocumentIdStatus documentIdStatus) {
		this.documentIdStatus = documentIdStatus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
