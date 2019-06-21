package pqe.ecms.oxm.domain.bulktext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExtractedText {

	@JsonProperty(value = "Text")
	private String text;

	@JsonProperty(value = "Metadata")
	private Map<String, String> metadata;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Map<String, String> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}

	@Override
	public String toString() {
		return "SingleText{" +
				"text='" + text + '\'' +
				", metadata=" + metadata +
				'}';
	}
}
