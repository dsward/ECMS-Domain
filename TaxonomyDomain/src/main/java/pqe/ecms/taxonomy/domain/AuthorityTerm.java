package pqe.ecms.taxonomy.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * The specific term content pulled from an authority file. This is the javabean representation of an individual response from Synaptica
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class AuthorityTerm implements Serializable {

	@JsonIgnore
	private static final long serialVersionUID = 1L;

	@JsonProperty("Term")
	private String term;

	@JsonProperty("IsPreferredTerm")
	private boolean preferredTerm;

	@JsonProperty("Relationship")
	private AuthorityRelationship relationship;

	@JsonProperty("Subclass")
	private List<String> subclass;

	@JsonProperty("UseFor")
	private List<String> useFor;


	public AuthorityTerm() {
	}

	/**
	 * @return - Term Display Name
	 */
	public String getTerm() {
		return term;
	}

	/**
	 * @param term
	 *            - Term Display Name
	 */
	public void setTerm(String term) {
		this.term = term;
	}


	/**
	 * @return - if the term is a preferred or non preferred term. True if preferred, false if non-preferred.
	 */
	public boolean isPreferredTerm() {
		return preferredTerm;
	}

	/**
	 * @param preferredTerm
	 *            - if the term is a preferred or non preferred term. True if preferred, false if non-preferred.
	 */
	public void setPreferredTerm(boolean preferredTerm) {
		this.preferredTerm = preferredTerm;
	}

	public AuthorityRelationship getRelationship() {
		return relationship;
	}

	public void setRelationship(AuthorityRelationship relationship) {
		this.relationship = relationship;
	}

	public List<String> getSubclass() {
		return subclass;
	}

	public void setSubclass(List<String> subclass) {
		this.subclass = subclass;
	}

	public List<String> getUseFor() {
		return useFor;
	}

	public void setUseFor(List<String> useFor) {
		this.useFor = useFor;
	}
}
