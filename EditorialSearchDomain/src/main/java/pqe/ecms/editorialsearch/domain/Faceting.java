package pqe.ecms.editorialsearch.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Collection;
import java.util.List;

/**
 * @author sburroughs 1/20/2016
 */
@JsonRootName("Faceting")
public class Faceting {

    @JsonProperty("FacetingRequest")
    private FacetingRequest facetingRequest;

    @JsonProperty("FacetingResult")
    private List<FacetingResult> facetingResult;

    public Faceting() {

    }

    private Faceting(Builder builder) {
        this.facetingRequest = builder.facetingRequest;
        this.facetingResult = builder.facetingResult;
    }

    public static Builder newFaceting() {
        return new Builder();
    }

    public FacetingRequest getFacetingRequest() {
        return facetingRequest;
    }

    public List<FacetingResult> getFacetingResult() {
        return facetingResult;
    }

    public static class Builder {

        private FacetingRequest facetingRequest;
        private List<FacetingResult> facetingResult;

        public Builder facetingRequest(FacetingRequest facetingRequest) {
            this.facetingRequest = facetingRequest;
            return this;
        }

        public Builder facetingResult(Collection<FacetingResult> results) {
            if (results != null) {
                for (FacetingResult result : results) {
                    this.facetingResult.add(result);
                }
            }

            return this;
        }

        public Faceting build() {
            return new Faceting(this);
        }

    }

}
