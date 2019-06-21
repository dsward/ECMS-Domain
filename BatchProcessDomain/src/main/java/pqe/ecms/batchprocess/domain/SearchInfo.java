package pqe.ecms.batchprocess.domain;

import pqe.ecms.editorialsearch.domain.SearchRequest;

public class SearchInfo {
	private Long id;
	private SearchRequest searchRequest;
	private String cursor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SearchRequest getSearchRequest() {
		return searchRequest;
	}

	public void setSearchRequest(SearchRequest searchRequest) {
		this.searchRequest = searchRequest;
	}

	public String getCursor() {
		return cursor;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
	}
}
