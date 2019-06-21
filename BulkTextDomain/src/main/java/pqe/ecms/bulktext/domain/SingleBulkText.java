package pqe.ecms.bulktext.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SingleBulkText {

	private BulkTextMetadata bulkTextMetadata;
	private String text;
	private String sha;
	private Long bulkTextId;

	@JsonProperty("BulkTextId")
	public Long getBulkTextId() {
		return bulkTextId;
	}

	public void setBulkTextId(Long bulkTextId) {
		this.bulkTextId = bulkTextId;
	}

	@JsonProperty("BulkTextMetadata")
	public BulkTextMetadata getBulkTextMetadata() {
		return bulkTextMetadata;
	}

	public void setBulkTextMetadata(BulkTextMetadata bulkTextMetadata) {
		this.bulkTextMetadata = bulkTextMetadata;
	}

	@JsonProperty("Text")
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@JsonProperty("Sha")
	public String getSha() {
		return sha;
	}

	public void setSha(String sha) {
		this.sha = sha;
	}
}
