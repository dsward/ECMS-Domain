package pqe.ecms.editorialsearch.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents the search results to be returned as a response to a request.
 *
 * @author fperez
 */
@JsonRootName("SearchResult")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchResult implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("TotalHits")
	private Long totalHits;

	@JsonProperty("SearchHit")
	private List<SearchHit> hits = new ArrayList<>();

	/**
	 * This constructor is only available for serialization purposes - not for object creation.
	 *
	 */
	public SearchResult() {

	}

	public Long getTotalHits() {
		return totalHits;
	}

	public List<SearchHit> getHits() {
		return hits;
	}

	public void setTotalHits(Long totalHits) {
		this.totalHits = totalHits;
	}

	public void setHits(List<SearchHit> hits) {
		this.hits = hits;
	}

	public static Builder newResult() {
		return new Builder();
	}

	public static class Builder {

		private Long totalHits = 0L;
		private List<SearchHit> hits = new ArrayList<>();

		public Builder totalHits(Long value) {
			this.totalHits = value;
			return this;
		}

		public Builder hits(List<SearchHit> value) {
			this.hits = new ArrayList<>();
			this.hits.addAll(value);
			return this;
		}

		public SearchResult build() {
			SearchResult result = new SearchResult();
			result.totalHits = totalHits;
			result.hits = new ArrayList<>();
			result.hits.addAll(this.hits);
			return result;
		}
	}
}
