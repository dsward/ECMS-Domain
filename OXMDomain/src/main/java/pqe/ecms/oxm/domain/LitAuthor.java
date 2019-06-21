package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LitAuthor {

	@JsonIgnore
	private static final long serialVersionUID = 1L;

	@JsonProperty("LitAuthorName")
	private String litAuthorName;

	@JsonProperty("LitAuthorPreferredForm")
	private String litAuthorPreferredForm;

	@JsonProperty("LitAuthorAltName")
	private List<String> litAuthorAltName;

	@JsonProperty("LitAuthorID")
	private String litAuthorID;

	@JsonProperty("LitAuthorBirthDate")
	private String litAuthorBirthDate;

	@JsonProperty("LitAuthorNumBirthDate")
	private Integer litAuthorNumBirthDate;

	@JsonProperty("LitAuthorDeathDate")
	private String litAuthorDeathDate;

	@JsonProperty("LitAuthorNumDeathDate")
	private Integer litAuthorNumDeathDate;

	@JsonProperty("LitAuthorGender")
	private List<String> litAuthorGender;

	@JsonProperty("LitAuthorNationality")
	private List<String> litAuthorNationality;

	@JsonProperty("LitAuthorLitPeriod")
	private List<String> litAuthorLitPeriod;

	@JsonProperty("LitAuthorLitMovement")
	private List<String> litAuthorLitMovement;

	@JsonProperty("LitAuthorEthnicity")
	private List<String> litAuthorEthnicity;

	@JsonProperty("LitAuthorWeight")
	private Integer litAuthorWeight;

	public String getLitAuthorName() {
		return litAuthorName;
	}

	public void setLitAuthorName(String litAuthorName) {
		this.litAuthorName = litAuthorName;
	}

	public String getLitAuthorPreferredForm() {
		return litAuthorPreferredForm;
	}

	public void setLitAuthorPreferredForm(String litAuthorPreferredForm) {
		this.litAuthorPreferredForm = litAuthorPreferredForm;
	}

	public List<String> getLitAuthorAltName() {
		return litAuthorAltName;
	}

	public void setLitAuthorAltName(List<String> litAuthorAltName) {
		this.litAuthorAltName = litAuthorAltName;
	}

	public String getLitAuthorID() {
		return litAuthorID;
	}

	public void setLitAuthorID(String litAuthorID) {
		this.litAuthorID = litAuthorID;
	}

	public String getLitAuthorBirthDate() {
		return litAuthorBirthDate;
	}

	public void setLitAuthorBirthDate(String litAuthorBirthDate) {
		this.litAuthorBirthDate = litAuthorBirthDate;
	}

	public Integer getLitAuthorNumBirthDate() {
		return litAuthorNumBirthDate;
	}

	public void setLitAuthorNumBirthDate(Integer litAuthorNumBirthDate) {
		this.litAuthorNumBirthDate = litAuthorNumBirthDate;
	}

	public String getLitAuthorDeathDate() {
		return litAuthorDeathDate;
	}

	public void setLitAuthorDeathDate(String litAuthorDeathDate) {
		this.litAuthorDeathDate = litAuthorDeathDate;
	}

	public Integer getLitAuthorNumDeathDate() {
		return litAuthorNumDeathDate;
	}

	public void setLitAuthorNumDeathDate(Integer litAuthorNumDeathDate) {
		this.litAuthorNumDeathDate = litAuthorNumDeathDate;
	}

	public List<String> getLitAuthorGender() {
		return litAuthorGender;
	}

	public void setLitAuthorGender(List<String> litAuthorGender) {
		this.litAuthorGender = litAuthorGender;
	}

	public List<String> getLitAuthorNationality() {
		return litAuthorNationality;
	}

	public void setLitAuthorNationality(List<String> litAuthorNationality) {
		this.litAuthorNationality = litAuthorNationality;
	}

	public List<String> getLitAuthorLitPeriod() {
		return litAuthorLitPeriod;
	}

	public void setLitAuthorLitPeriod(List<String> litAuthorLitPeriod) {
		this.litAuthorLitPeriod = litAuthorLitPeriod;
	}

	public List<String> getLitAuthorLitMovement() {
		return litAuthorLitMovement;
	}

	public void setLitAuthorLitMovement(List<String> litAuthorLitMovement) {
		this.litAuthorLitMovement = litAuthorLitMovement;
	}

	public List<String> getLitAuthorEthnicity() {
		return litAuthorEthnicity;
	}

	public void setLitAuthorEthnicity(List<String> litAuthorEthnicity) {
		this.litAuthorEthnicity = litAuthorEthnicity;
	}

	public Integer getLitAuthorWeight() {
		return litAuthorWeight;
	}

	public void setLitAuthorWeight(Integer litAuthorWeight) {
		this.litAuthorWeight = litAuthorWeight;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		LitAuthor litAuthor = (LitAuthor) o;
		return getLitAuthorName().equals(litAuthor.getLitAuthorName()) &&
				Objects.equals(getLitAuthorPreferredForm(), litAuthor.getLitAuthorPreferredForm()) &&
				Objects.equals(getLitAuthorAltName(), litAuthor.getLitAuthorAltName()) &&
				Objects.equals(getLitAuthorID(), litAuthor.getLitAuthorID()) &&
				Objects.equals(getLitAuthorBirthDate(), litAuthor.getLitAuthorBirthDate()) &&
				Objects.equals(getLitAuthorNumBirthDate(), litAuthor.getLitAuthorNumBirthDate()) &&
				Objects.equals(getLitAuthorDeathDate(), litAuthor.getLitAuthorDeathDate()) &&
				Objects.equals(getLitAuthorNumDeathDate(), litAuthor.getLitAuthorNumDeathDate()) &&
				Objects.equals(getLitAuthorGender(), litAuthor.getLitAuthorGender()) &&
				Objects.equals(getLitAuthorNationality(), litAuthor.getLitAuthorNationality()) &&
				Objects.equals(getLitAuthorLitPeriod(), litAuthor.getLitAuthorLitPeriod()) &&
				Objects.equals(getLitAuthorLitMovement(), litAuthor.getLitAuthorLitMovement()) &&
				Objects.equals(getLitAuthorEthnicity(), litAuthor.getLitAuthorEthnicity()) &&
				Objects.equals(getLitAuthorWeight(), litAuthor.getLitAuthorWeight());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getLitAuthorName(), getLitAuthorPreferredForm(), getLitAuthorAltName(), getLitAuthorID(), getLitAuthorBirthDate(), getLitAuthorNumBirthDate(), getLitAuthorDeathDate(), getLitAuthorNumDeathDate(), getLitAuthorGender(), getLitAuthorNationality(), getLitAuthorLitPeriod(), getLitAuthorLitMovement(), getLitAuthorEthnicity(), getLitAuthorWeight());
	}

	@Override
	public String toString() {
		return "LitAuthor{" +
				"litAuthorName='" + litAuthorName + '\'' +
				", litAuthorPreferredForm=" + litAuthorPreferredForm +
				", litAuthorAltName=" + litAuthorAltName +
				", litAuthorID='" + litAuthorID + '\'' +
				", litAuthorBirthDate='" + litAuthorBirthDate + '\'' +
				", litAuthorNumBirthDate=" + litAuthorNumBirthDate +
				", litAuthorDeathDate='" + litAuthorDeathDate + '\'' +
				", litAuthorNumDeathDate=" + litAuthorNumDeathDate +
				", litAuthorGender=" + litAuthorGender +
				", litAuthorNationality=" + litAuthorNationality +
				", litAuthorLitPeriod=" + litAuthorLitPeriod +
				", litAuthorLitMovement=" + litAuthorLitMovement +
				", litAuthorEthnicity=" + litAuthorEthnicity +
				", litAuthorWeight=" + litAuthorWeight +
				'}';
	}
}
