package pqe.ecms.taxonomy.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author sburroughs 11/12/2015
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class AuthorityRelationship {

	@JsonProperty("PreferredDisplay")
	private String preferredDisplay;

	@JsonProperty("CodeName")
	private String codeName;

	@JsonProperty("NAICCodes")
	private List<String> naicCodes;

	/**
	 * @return the naicCodes
	 */
	public List<String> getNaicCodes() {
		return naicCodes;
	}

	/**
	 * @param naicCodes
	 *            the naicCodes to set
	 */
	public void setNaicCodes(List<String> naicCodes) {
		this.naicCodes = naicCodes;
	}

	public String getPreferredDisplay() {
		return preferredDisplay;
	}

	public void setPreferredDisplay(String preferredTermDisplay) {
		this.preferredDisplay = preferredTermDisplay;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

}
