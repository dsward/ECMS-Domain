package pqe.ecms.editorialsearch.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.apache.commons.lang3.StringUtils;
import pqe.ecms.domain.exception.BuilderException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * This class is the structure in which search requests are to be submitted to the search endpoint.
 *
 * @author fperez
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName("SearchRequest")
public class SearchRequest {

	static final Integer DEFAULT_OFFSET = 0;
	static final Integer DEFAULT_LIMIT = 15;

	@JsonProperty("Query")
	private String query;

	@JsonProperty("Offset")
	private Integer offset;

	@JsonProperty("Limit")
	private Integer limit;

	@JsonProperty("Sort")
	private List<SortField> sortFields;

	@JsonProperty("ReturnFields")
	private List<String> returnFields;

	@JsonProperty("FacetingRequests")
	private List<FacetingRequest> facetingRequests;

	@JsonProperty("FilterQueries")
	private List<String> filterQueries;

	/**
	 * Only used for serialization purposes - not for regular object creation. <br>
	 * For the proper building of this object use the builder methods instead;
	 */
	public SearchRequest() {
		// added default assignment for serialization purposes
		this.limit = DEFAULT_LIMIT;
		this.offset = DEFAULT_OFFSET;
	}

	/**
	 * Internal constructor that builds the object with the data from the builder.
	 *
	 * @param builder
	 */
	private SearchRequest(Builder builder) {
		this.query = builder.query;
		this.offset = builder.offset;
		this.limit = builder.limit;
		this.sortFields = builder.sortFields;
		this.returnFields = builder.returnFields;
		this.facetingRequests = builder.facetingRequest;
		this.filterQueries = builder.filters;

	}

	/**
	 * @return a new instance of the builder for new requests.
	 */
	public static Builder newRequest() {
		return new Builder();
	}

	/**
	 * @return the query
	 */
	public String getQuery() {
		return query;
	}

	/**
	 * @return the offset
	 */
	public Integer getOffset() {
		return offset;
	}

	/**
	 * @return the limit
	 */
	public Integer getLimit() {
		return limit;
	}

	/**
	 * @return the sortFields
	 */
	public List<SortField> getSortFields() {
		return sortFields;
	}

	/**
	 * @return the returnFields
	 */
	public List<String> getReturnFields() {
		return returnFields;
	}

	// Setters were added because object is already deserialized at the point of retrieval from the BulkEditingEndpoint.
	// We need to ensure certain fields are present.
	public void setReturnFields(List<String> returnFields) {
		this.returnFields = returnFields;
	}

	/**
	 * @return the facetingRequests
	 */
	public List<FacetingRequest> getFacetingRequests() {
		return facetingRequests;
	}

	/**
	 * @return the facetingRequests
	 */
	public List<String> getFilterQueries() {
		return filterQueries;
	}

	@Override
	public String toString() {
		return "SearchRequest{" + "query='" + query + '\'' + ", offset=" + offset + ", limit=" + limit + ", sortFields=" + sortFields + ", returnFields=" + returnFields + ", facetingRequests="
				+ facetingRequests + ", filterQueries=" + filterQueries + '}';
	}

	/**
	 * The builder for search requests.
	 *
	 * @author fperez
	 */
	public static class Builder {
		private String query;
		private Integer offset;
		private Integer limit;
		private List<SortField> sortFields = new ArrayList<>();
		private List<String> returnFields = new ArrayList<>();
		private List<FacetingRequest> facetingRequest = new ArrayList<>();
		private List<String> filters = new ArrayList<>();

		/**
		 * Sets the query to use for searching.
		 *
		 * @param query
		 * @return
		 */
		public Builder query(String query) {
			this.query = query;
			return this;
		}

		/**
		 * Sets the offset at which to start returning documents.
		 *
		 * @param offset
		 * @return
		 */
		public Builder offset(Integer offset) {
			this.offset = offset;
			return this;
		}

		/**
		 * Sets the limit of documents to return.
		 *
		 * @param limit
		 * @return
		 */
		public Builder limit(Integer limit) {
			this.limit = limit;
			return this;
		}

		/**
		 * Sets the sorting criteria for the document search.
		 *
		 * @param sortFields
		 * @return
		 */
		public Builder sort(Collection<SortField> sortFields) {

			if (sortFields != null) {
				for (SortField sortField : sortFields) {
					this.sortFields.add(sortField);
				}
			}

			return this;
		}

		/**
		 * Sets the fields to return in the search results.
		 *
		 * @param fieldNames
		 * @return
		 */
		public Builder returns(Collection<String> fieldNames) {

			if (fieldNames != null) {
				for (String fieldName : fieldNames) {
					returnFields.add(fieldName);
				}
			}
			return this;
		}

		/**
		 * Sets the fields to return for facetting.
		 *
		 * @param facetingRequest
		 * @return
		 */
		public Builder facets(List<FacetingRequest> facetingRequest) {
			this.facetingRequest = facetingRequest;
			return this;
		}

		/**
		 * Each value of the corrosponding filter list shall be a : seperated key value pair to filter results.
		 *
		 * @param filters
		 * @return
		 */
		public Builder filter(List<String> filters) {
			this.filters = filters;
			return this;
		}

		/**
		 * Builds the request
		 *
		 * @return a properly constructed search request object
		 * @throws BuilderException
		 *             - if one of the required values was not provided to the builder.
		 */
		public SearchRequest build() {

			// Setting defaults if values were not provided to the builder
			offset = offset == null ? DEFAULT_OFFSET : offset;
			limit = limit == null ? DEFAULT_LIMIT : limit;

			// Verifying required values
			if (StringUtils.isEmpty(query) || offset == null || limit == null) {
				throw new BuilderException("Missing one or more of required properties for object creation:  query | offset | limit");
			}

			return new SearchRequest(this);
		}
	}
}
