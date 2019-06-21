package pqe.ecms.taxonomy.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Pojo to hold relivant data from a single search of a batch
 * 
 * @author RTabassi
 * 
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class TaxonomyResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("search")
	private String search;

	@JsonProperty("vocab")
	private String vocab;

	/**
	 * @return the vocab
	 */
	public String getVocab() {
		return vocab;
	}

	/**
	 * @param vocab
	 *            the vocab to set
	 */
	public void setVocab(String vocab) {
		this.vocab = vocab;
	}

	@JsonProperty("response")
	private String response;
	@JsonProperty("authoritySearchResult")
	private AuthoritySearchResult authoritySearchResult;

	/**
	 * @return the search
	 */
	public String getSearch() {
		return search;
	}

	/**
	 * @return the response
	 */
	public String getResponse() {
		return response;
	}

	/**
	 * @return the authoritySearchResult
	 */
	public AuthoritySearchResult getAuthoritySearchResult() {
		return authoritySearchResult;
	}

	/**
	 * @param search
	 *            the search to set
	 */
	public void setSearch(String search) {
		this.search = search;
	}

	/**
	 * @param response
	 *            the response to set
	 */
	public void setResponse(String response) {
		this.response = response;
	}

	/**
	 * @param authoritySearchResult
	 *            the authoritySearchResult to set
	 */
	public void setAuthoritySearchResult(AuthoritySearchResult authoritySearchResult) {
		this.authoritySearchResult = authoritySearchResult;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TaxonomyResponse [search=");
		builder.append(search);
		builder.append(", vocab=");
		builder.append(vocab);
		builder.append(", response=");
		builder.append(response);
		builder.append(", authoritySearchResult=");
		builder.append(authoritySearchResult);
		builder.append("]");
		return builder.toString();
	}

}
