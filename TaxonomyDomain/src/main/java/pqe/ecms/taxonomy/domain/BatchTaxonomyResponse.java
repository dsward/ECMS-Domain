package pqe.ecms.taxonomy.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Pojo to hold all of the Batch Responses from the synaptica search
 * 
 * @author RTabassi
 * 
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class BatchTaxonomyResponse implements Serializable {

	@JsonIgnore
	private static final long serialVersionUID = 1L;
	@JsonProperty("TaxonomyResponse")
	private List<TaxonomyResponse> taxonomyResponses;

	/**
	 * @return the taxonomyResponses
	 */
	public List<TaxonomyResponse> getTaxonomyResponses() {
		return taxonomyResponses;
	}

	/**
	 * @param taxonomyResponses
	 *            the taxonomyResponses to set
	 */
	public void setTaxonomyResponses(List<TaxonomyResponse> taxonomyResponses) {
		this.taxonomyResponses = taxonomyResponses;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BatchTaxonomyResponse [taxonomyResponses=");
		builder.append(taxonomyResponses);
		builder.append("]");
		return builder.toString();
	}

}
