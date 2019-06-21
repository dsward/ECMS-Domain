package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * OXM representing the Full Text from a Document
 *
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName( "DocumentFullText")
public class DocumentFullText extends OXMContent {

	private static final long serialVersionUID = 1L;

	@JsonProperty("FullText")
	private String fullText;

	@JsonProperty("HiddenText")
	private String hiddenText;

	public String getFullText() {
		return fullText;
	}

	public void setFullText(String fullText) {
		this.fullText = fullText;
	}

	public String getHiddenText() {
		return hiddenText;
	}

	public void setHiddenText(String hiddenText) {
		this.hiddenText = hiddenText;
	}

	/*
		 * (non-Javadoc)
		 *
		 * @see java.lang.Object#toString()
		 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DocumentFullText [FullText=");
		builder.append(fullText);
		builder.append(", HiddenText = ");
		builder.append(hiddenText);
		builder.append("]");
		return builder.toString();
	}

}
