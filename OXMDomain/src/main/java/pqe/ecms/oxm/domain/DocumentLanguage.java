package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.List;
import java.util.Objects;

/**
 * Created by PKeerthi on 3/7/2016.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("DocumentLanguage")
public class DocumentLanguage extends OXMContent {

	private static final long serialVersionUID = 1L;
	@JsonProperty("RawLang")
	private List<String> rawlang;

	public List<String> getRawlang() {
		return rawlang;
	}

	public void setRawlang(List<String> rawlang) {
		this.rawlang = rawlang;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RawLang [rawlang=");
		builder.append(rawlang);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof DocumentLanguage)) return false;
		DocumentLanguage that = (DocumentLanguage) o;
		return Objects.equals(getRawlang(), that.getRawlang());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getRawlang());
	}
}
