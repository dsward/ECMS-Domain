package pqe.ecms.taxonomy.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by wmillman on 10/24/2016.
 */

public class AuthorityTerms {
	@JsonProperty("AuthorityTerms")
	private List<AuthorityTerm> AuthorityTerms;

	public List<AuthorityTerm> getAuthorityTerms() {
		return AuthorityTerms;
	}

	public void setAuthorityTerms(List<AuthorityTerm> authorityTerms) {
		AuthorityTerms = authorityTerms;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AuthorityTerms [AuthorityTerms=");
		builder.append(AuthorityTerms);
		builder.append("]");
		return builder.toString();
	}
}
