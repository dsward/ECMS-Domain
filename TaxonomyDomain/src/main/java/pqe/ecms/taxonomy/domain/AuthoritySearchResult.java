package pqe.ecms.taxonomy.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Wrapper for {@link AuthorityTerm} that were created through a Synaptica search.
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class AuthoritySearchResult implements Serializable {
    @JsonIgnore
    private static final long serialVersionUID = 1L;
    @JsonProperty("AuthorityTerms")
    private List<AuthorityTerm> authorityTerms;

    public AuthoritySearchResult() {
    }

    /**
     * @return - Terms associated with a vocabulary search
     */
    public List<AuthorityTerm> getAuthorityTerms() {
        return authorityTerms;
    }

    /**
     * @param authorityTerms - Terms associated with a vocabulary search
     */
    public void setAuthorityTerms(List<AuthorityTerm> authorityTerms) {
        this.authorityTerms = authorityTerms;
    }
}
