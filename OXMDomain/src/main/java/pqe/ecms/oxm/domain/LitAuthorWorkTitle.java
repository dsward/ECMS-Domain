package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.io.Serializable;
import java.util.Objects;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("Title")
public class LitAuthorWorkTitle implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("Title")
	private String title;

	@JsonProperty("TitleLanguage")
	private String language;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLanguage() { return language; }

	public void setLanguage(String language) { this.language = language; }

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		LitAuthorWorkTitle that = (LitAuthorWorkTitle) o;
		return Objects.equals(getTitle(), that.getTitle()) &&
				Objects.equals(getLanguage(), that.getLanguage());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getTitle(), getLanguage());
	}
}
