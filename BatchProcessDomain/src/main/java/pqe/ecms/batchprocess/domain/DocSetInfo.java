package pqe.ecms.batchprocess.domain;

import java.util.List;

public class DocSetInfo {
	private Long id;
	private List<Long> docIds;
	private Integer lastIdSeen;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Long> getDocIds() {
		return docIds;
	}

	public void setDocIds(List<Long> docIds) {
		this.docIds = docIds;
	}

	public Integer getLastIdSeen() {
		return lastIdSeen;
	}

	public void setLastIdSeen(Integer lastIdSeen) {
		this.lastIdSeen = lastIdSeen;
	}
}
