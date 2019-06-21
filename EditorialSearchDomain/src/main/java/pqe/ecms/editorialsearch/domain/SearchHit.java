package pqe.ecms.editorialsearch.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Represents a single field within a search hit document.
 *
 * @author fperez
 */
@JsonRootName("SearchHit")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchHit {

	@JsonProperty("RelevanceValue")
	private String relevanceValue;

	@JsonProperty("HitField")
	private List<HitField> fields = new ArrayList<>();

	/**
	 * For serialization purposes only - not for object creation. Use {@link #newHit()} instead
	 */
	public SearchHit() {

	}

	private SearchHit(Builder builder) {
		this.relevanceValue = builder.relevanceValue;
		this.fields = builder.fields;
	}

	public static Builder newHit() {
		return new Builder();
	}

	public String getRelevanceValue() {
		return relevanceValue;
	}

	public List<HitField> getFields() {
		return fields;
	}

	/**
	 * Builder class
	 */
	public static class Builder {

		private String relevanceValue;
		private List<HitField> fields = new ArrayList<>();

		public Builder relevance(String relevance) {
			this.relevanceValue = relevance;
			return this;
		}

		public Builder fields(Collection<HitField> hitFields) {

			if (hitFields != null) {
				for (HitField hitField : hitFields) {
					this.fields.add(hitField);
				}
			}

			return this;
		}



		public SearchHit build() {
			return new SearchHit(this);
		}

	}

	public void setRelevanceValue(String relevanceValue) {
		this.relevanceValue = relevanceValue;
	}

	public void setFields(List<HitField> fields) {
		this.fields = fields;
	}

}
