package pqe.ecms.batchprocess.domain;

import java.util.List;

public class DocIdExtractionResult {
	private BatchProcessInfo.ProcessStatus processStatus;
	private List<Long> docIds;

	public BatchProcessInfo.ProcessStatus getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(BatchProcessInfo.ProcessStatus processStatus) {
		this.processStatus = processStatus;
	}

	public List<Long> getDocIds() {
		return docIds;
	}

	public void setDocIds(List<Long> docIds) {
		this.docIds = docIds;
	}
}
