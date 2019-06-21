package pqe.ecms.batchprocess.domain;

import java.util.List;

public class SolrResult {
	private List<Long> docIds;
	private String cursor;
	private boolean isDone = false;

	public List<Long> getDocIds() {
		return docIds;
	}

	public void setDocIds(List<Long> docIds) {
		this.docIds = docIds;
	}

	public String getCursor() {
		return cursor;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean done) {
		isDone = done;
	}
}
