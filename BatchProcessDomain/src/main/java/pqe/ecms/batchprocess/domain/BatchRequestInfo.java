package pqe.ecms.batchprocess.domain;

public class BatchRequestInfo {
	private BatchProcessRequest.RequestType requestType = BatchProcessRequest.RequestType.Report;
	private BatchProcessInfo batchProcessInfo;
	private ReportRequestInfo requestInfo;

	public BatchProcessRequest.RequestType getRequestType() {
		return requestType;
	}

	public void setRequestType(BatchProcessRequest.RequestType requestType) {
		this.requestType = requestType;
	}

	public BatchProcessInfo getBatchProcessInfo() {
		return batchProcessInfo;
	}

	public void setBatchProcessInfo(BatchProcessInfo batchProcessInfo) {
		this.batchProcessInfo = batchProcessInfo;
	}

	public ReportRequestInfo getRequestInfo() {
		return requestInfo;
	}

	public void setRequestInfo(ReportRequestInfo requestInfo) {
		this.requestInfo = requestInfo;
	}
}
