package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("DocumentAsfa")
public class DocumentAsfa extends OXMContent {
	@JsonProperty("AsfaInputCenter")
	private String inputCenter = "";

	@JsonProperty("ConfCitation")
	private String confCitation = "";

	@JsonProperty("SupplementalData")
	private String supplementalData = "";

	public String getConfCitation() {
		return confCitation;
	}

	public void setConfCitation(String confCitation) {
		this.confCitation = confCitation;
	}

	public String getSupplementalData() {
		return supplementalData;
	}

	public void setSupplementalData(String supplementalData) {
		this.supplementalData = supplementalData;
	}

	public String getInputCenter() {
		return inputCenter;
	}

	public void setInputCenter(String inputCenter) {
		this.inputCenter = inputCenter;
	}

}
