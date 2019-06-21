package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LitAuthorWork {

	@JsonIgnore
	private static final long serialVersionUID = 1L;

	@JsonProperty("LitWorkTitle")
	private LitAuthorWorkTitle litWorkTitle;

	@JsonProperty("LitWorkPreferredForm")
	private LitAuthorWorkTitle litWorkPreferredForm;

	@JsonProperty("LitWorkAltTitle")
	private List<LitAuthorWorkTitle> litWorkAltTitle;

	@JsonProperty("LitWorkPubDate")
	private String litWorkPubDate;

	@JsonProperty("LitWorkNumPubDate")
	private Integer litWorkNumPubDate;

	@JsonProperty("LitWorkGenre")
	private List<String> litWorkGenre;

	@JsonProperty("LitWorkMovement")
	private List<String> litWorkMovement;

	@JsonProperty("LitWorkPeriod")
	private List<String> litWorkPeriod;

	@JsonProperty("LitWorkWeight")
	private Integer litWorkWeight;

	@JsonProperty("LitWorkID")
	private List<LitWorkID> litWorkID;

	public LitAuthorWorkTitle getLitWorkTitle() {
		return litWorkTitle;
	}

	public void setLitWorkTitle(LitAuthorWorkTitle litWorkTitle) {
		this.litWorkTitle = litWorkTitle;
	}

	public LitAuthorWorkTitle getLitWorkPreferredForm() {
		return litWorkPreferredForm;
	}

	public void setLitWorkPreferredForm(LitAuthorWorkTitle litWorkPreferredForm) {
		this.litWorkPreferredForm = litWorkPreferredForm;
	}

	public List<LitAuthorWorkTitle> getLitWorkAltTitle() {
		return litWorkAltTitle;
	}

	public void setLitWorkAltTitle(List<LitAuthorWorkTitle> litWorkAltTitle) {
		this.litWorkAltTitle = litWorkAltTitle;
	}

	public String getLitWorkPubDate() {
		return litWorkPubDate;
	}

	public void setLitWorkPubDate(String litWorkPubDate) {
		this.litWorkPubDate = litWorkPubDate;
	}

	public Integer getLitWorkNumPubDate() {
		return litWorkNumPubDate;
	}

	public void setLitWorkNumPubDate(Integer litWorkNumPubDate) {
		this.litWorkNumPubDate = litWorkNumPubDate;
	}

	public List<String> getLitWorkGenre() {
		return litWorkGenre;
	}

	public void setLitWorkGenre(List<String> litWorkGenre) {
		this.litWorkGenre = litWorkGenre;
	}

	public List<String> getLitWorkMovement() {
		return litWorkMovement;
	}

	public void setLitWorkMovement(List<String> litWorkMovement) {
		this.litWorkMovement = litWorkMovement;
	}

	public List<String> getLitWorkPeriod() {
		return litWorkPeriod;
	}

	public void setLitWorkPeriod(List<String> litWorkPeriod) {
		this.litWorkPeriod = litWorkPeriod;
	}

	public Integer getLitWorkWeight() {
		return litWorkWeight;
	}

	public void setLitWorkWeight(Integer litWorkWeight) {
		this.litWorkWeight = litWorkWeight;
	}

	public List<LitWorkID> getLitWorkID() {
		return litWorkID;
	}

	public void setLitWorkID(List<LitWorkID> litWorkID) {
		this.litWorkID = litWorkID;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		LitAuthorWork that = (LitAuthorWork) o;
		return Objects.equals(getLitWorkTitle(), that.getLitWorkTitle()) &&
				Objects.equals(getLitWorkPreferredForm(), that.getLitWorkPreferredForm()) &&
				Objects.equals(getLitWorkAltTitle(), that.getLitWorkAltTitle()) &&
				Objects.equals(getLitWorkPubDate(), that.getLitWorkPubDate()) &&
				Objects.equals(getLitWorkNumPubDate(), that.getLitWorkNumPubDate()) &&
				Objects.equals(getLitWorkGenre(), that.getLitWorkGenre()) &&
				Objects.equals(getLitWorkMovement(), that.getLitWorkMovement()) &&
				Objects.equals(getLitWorkPeriod(), that.getLitWorkPeriod()) &&
				Objects.equals(getLitWorkWeight(), that.getLitWorkWeight()) &&
				Objects.equals(getLitWorkID(), that.getLitWorkID());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getLitWorkTitle(), getLitWorkPreferredForm(), getLitWorkAltTitle(), getLitWorkPubDate(), getLitWorkNumPubDate(), getLitWorkGenre(), getLitWorkMovement(), getLitWorkPeriod(), getLitWorkWeight(), getLitWorkID());
	}

	@Override
	public String toString() {
		return "LitAuthorWork{" +
				"litWorkTitle=" + litWorkTitle +
				", litWorkPreferredForm=" + litWorkPreferredForm +
				", litWorkAltTitle=" + litWorkAltTitle +
				", litWorkPubDate='" + litWorkPubDate + '\'' +
				", litWorkNumPubDate=" + litWorkNumPubDate +
				", litWorkGenre=" + litWorkGenre +
				", litWorkMovement=" + litWorkMovement +
				", litWorkPeriod=" + litWorkPeriod +
				", litWorkWeight=" + litWorkWeight +
				", litWorkID=" + litWorkID +
				'}';
	}
}
