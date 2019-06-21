package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import pqe.ecms.editorialdocument.domain.Document;

import java.io.Serializable;


@JsonRootName("DocumentOxms")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentOxms implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("Document")
	private Document document;

	@JsonProperty("Oxms")
	private OXMs oxms;

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public OXMs getOxms() {
		return oxms;
	}

	public void setOxms(OXMs oxmList) {
		this.oxms = oxmList;
	}

}
