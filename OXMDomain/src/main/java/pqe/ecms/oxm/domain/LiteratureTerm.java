package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LiteratureTerm {

	@JsonIgnore
	private static final long serialVersionUID = 1L;

	@JsonProperty("TermVocab")
	private String termVocab;

	@JsonProperty("TermSource")
	private String termSource;

	@JsonProperty("LitAuthor")
	private LitAuthor litAuthor;

	@JsonProperty("LitAuthorWorks")
	private List<LitAuthorWork> litAuthorWorks;

	public String getTermVocab() {
		return termVocab;
	}

	public void setTermVocab(String termVocab) {
		this.termVocab = termVocab;
	}

	public String getTermSource() {
		return termSource;
	}

	public void setTermSource(String termSource) {
		this.termSource = termSource;
	}

	public LitAuthor getLitAuthor() {
		return litAuthor;
	}

	public void setLitAuthor(LitAuthor litAuthor) {
		this.litAuthor = litAuthor;
	}

	public List<LitAuthorWork> getLitAuthorWorks() {
		return litAuthorWorks;
	}

	public void setLitAuthorWorks(List<LitAuthorWork> litAuthorWorks) {
		this.litAuthorWorks = litAuthorWorks;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		LiteratureTerm that = (LiteratureTerm) o;
		return Objects.equals(getTermVocab(), that.getTermVocab()) &&
				Objects.equals(getTermSource(), that.getTermSource()) &&
				Objects.equals(getLitAuthor(), that.getLitAuthor()) &&
				Objects.equals(getLitAuthorWorks(), that.getLitAuthorWorks());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getTermVocab(), getTermSource(), getLitAuthor(), getLitAuthorWorks());
	}

	@Override
	public String toString() {
		return "LiteratureTerm{" +
				"termVocab='" + termVocab + '\'' +
				", termSource='" + termSource + '\'' +
				", litAuthor=" + litAuthor +
				", litAuthorWorks=" + litAuthorWorks +
				'}';
	}
}
