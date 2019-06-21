package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.io.Serializable;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName( "Copyright")
public class SingleCopyright implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("CopyrightData")
	private String copyrightData;


	@Override
	public String toString() {
		return "SingleCopyright [copyrightData=" + copyrightData +  "]";
	}

	public String getCopyrightData() {
		return copyrightData;
	}

	public void setCopyrightData(String copyrightData) {
		this.copyrightData = copyrightData;
	}
}
