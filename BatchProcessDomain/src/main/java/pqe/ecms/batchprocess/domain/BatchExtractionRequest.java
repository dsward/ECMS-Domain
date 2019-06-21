package pqe.ecms.batchprocess.domain;

public class BatchExtractionRequest {
	private BatchProcessRequest.RequestType requestType;

	public BatchProcessRequest.RequestType getRequestType() {
		return requestType;
	}

	public void setRequestType(BatchProcessRequest.RequestType requestType) {
		this.requestType = requestType;
	}


}
