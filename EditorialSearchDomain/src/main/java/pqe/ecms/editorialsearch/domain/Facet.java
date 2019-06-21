package pqe.ecms.editorialsearch.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;


/**
 * @author sburroughs 1/20/2016
 */
@JsonRootName("Facet")
public class Facet {

    @JsonProperty("key")
    private String key;

    @JsonProperty("count")
    private long count;

    public Facet() {

    }

    private Facet(Builder builder) {
        this.key = builder.key;
        this.count = builder.count;
    }

    public static Builder newFacet() {
        return new Builder();
    }

    public String getKey() {
        return key;
    }

    public long getCount() {
        return count;
    }

    public static class Builder {
        private String key;
        private long count;

        public Builder key(String key) {
            this.key = key;
            return this;
        }

        public Builder count(long count) {
            this.count = count;
            return this;
        }

        public Facet build() {
            return new Facet(this);
        }

    }

}
