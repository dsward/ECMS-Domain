package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("DocumentLinks")
public class DocumentLinks implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("OtherLinks")
	private List<OtherLink> otherLinks = new ArrayList<>();

	public List<OtherLink> getOtherLinks() {
		return otherLinks;
	}

	public void setOtherLinks(List<OtherLink> otherLinks) {
		this.otherLinks = otherLinks;
	}




}
