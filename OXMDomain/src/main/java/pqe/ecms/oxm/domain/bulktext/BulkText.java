package pqe.ecms.oxm.domain.bulktext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.List;

/**
 * OXM representing the Bulk Text from a Document
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("BulkText")
public class BulkText {

	@JsonProperty("ExtractedText")
	private List<ExtractedText> extractedText;

	public List<ExtractedText> getExtractedText() {
		return extractedText;
	}

	public void setExtractedText(List<ExtractedText> extractedText) {
		this.extractedText = extractedText;
	}

	@Override
	public String toString() {
		return "BulkText{" +
				"extractedText=" + extractedText +
				'}';
	}
}
