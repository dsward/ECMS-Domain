package pqe.ecms.editorialsearch.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author sburroughs 1/20/2016
 */
@JsonRootName("FacetResult")
public class FacetingResult {

	@JsonProperty("Type")
	private Type type;

	@JsonProperty("FacetName")
	private String facetName;

	@JsonProperty("Facet")
	private List<Facet> facets = new ArrayList<>();

	public FacetingResult() {

	}

	private FacetingResult(Builder builder) {
		this.facetName = builder.facetName;
		this.facets = builder.facets;
		this.type = builder.type;

	}

	public static Builder newFacetingResult() {
		return new Builder();
	}

	public String getFacetName() {
		return facetName;
	}

	public List<Facet> getFacets() {
		return facets;
	}

	public Type getType() {
		return type;
	}

	public enum Type {
		FIELD, QUERY
	}

	public static class Builder {

		private Type type;
		private String facetName;
		private List<Facet> facets = new ArrayList<>();

		public Builder type(Type type) {
			this.type = type;
			return this;
		}

		public Builder facetName(String facetName) {
			this.facetName = facetName;
			return this;
		}

		public Builder facets(Collection<Facet> facets) {
			if (facets != null) {
				for (Facet facet : facets) {
					this.facets.add(facet);
				}
			}

			return this;
		}

		public FacetingResult build() {
			return new FacetingResult(this);
		}

	}

}
