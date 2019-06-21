package pqe.ecms.batchprocess.domain;

import java.util.List;

public class ExtractionResponse {
	private BatchRequestInfo batchRequestInfo;
	private List<Long> docIds;

	public BatchRequestInfo getBatchRequestInfo() {
		return batchRequestInfo;
	}

	public void setBatchRequestInfo(BatchRequestInfo batchRequestInfo) {
		this.batchRequestInfo = batchRequestInfo;
	}

	public List<Long> getDocIds() {
		return docIds;
	}

	public void setDocIds(List<Long> docIds) {
		this.docIds = docIds;
	}
}
