package pqe.ecms.batchprocess.domain;

public class DocIdData {
	Long batchId;
	Long docId;
	private DocumentIdUpdateRequest.DocumentIdStatus documentIdStatus;
	private String message;

	public Long getDocId() {
		return docId;
	}

	public void setDocId(Long docId) {
		this.docId = docId;
	}

	public DocumentIdUpdateRequest.DocumentIdStatus getDocumentIdStatus() {
		return documentIdStatus;
	}

	public void setDocumentIdStatus(DocumentIdUpdateRequest.DocumentIdStatus documentIdStatus) {
		this.documentIdStatus = documentIdStatus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getBatchId() {
		return batchId;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}
}
