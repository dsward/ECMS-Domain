package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("DocumentCopyright")
public class DocumentCopyright extends OXMContent {

	private static final long serialVersionUID = 1L;
	@JsonProperty("Copyrights")
	private List<SingleCopyright> copyrights = new ArrayList<>();


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DocumentCopyright [copyrights=");
		builder.append(copyrights);
		builder.append("]");
		return builder.toString();
	}

	public List<SingleCopyright> getCopyrights() {
		return copyrights;
	}

	public void setCopyrights(List<SingleCopyright> copyrights) {
		this.copyrights = copyrights;
	}
}
