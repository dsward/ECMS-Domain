package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LiteratureTerms {

	@JsonIgnore
	private static final long serialVersionUID = 1L;

	@JsonProperty("Terms")
	private List<LiteratureTerm> literatureTerms = new ArrayList<>();

	public List<LiteratureTerm> getLiteratureTerms() {
		return literatureTerms;
	}

	public void setLiteratureTerms(List<LiteratureTerm> literatureTerms) {
		this.literatureTerms = literatureTerms;
	}
}
