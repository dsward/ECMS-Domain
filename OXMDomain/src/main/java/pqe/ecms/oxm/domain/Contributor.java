package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import pqe.ecms.oxm.domain.contributor.CongressPerson;
import pqe.ecms.oxm.domain.contributor.Nominated;
import pqe.ecms.oxm.domain.contributor.Role;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("Contributor")
public class Contributor extends OXMContent {

	private static final long serialVersionUID = 1L;


	@JsonProperty("XMLOrder")
	private Integer xmlOrder;

	@JsonProperty("ContribOrder")
	private Integer contribOrder;

	@JsonProperty("LastName")
	private String lastName;

	@JsonProperty("FirstName")
	private String firstName;

	@JsonProperty("MiddleName")
	private String middleName;

	@JsonProperty("Suffix")
	private String suffix;

	@JsonProperty("PersonalTitle")
	private String personalTitle;

	@JsonProperty("ProfessionalTitle")
	private String professionalTitle;

	@JsonProperty("OriginalForm")
	private String originalForm;

	@JsonProperty("Roles")
	private List<Role> roles;

	@JsonProperty("Affiliations")
	private List<String> affiliations;

	@JsonProperty("Representing")
	private List<String> representing;

	@JsonProperty("NominatedFor")
	private List<Nominated> nominated;

	@JsonProperty("CongressPerson")
	private CongressPerson congressPerson;

	@JsonProperty("Text")
	private String text;

	@JsonProperty("Collation")
	private Collation collation;

	@JsonProperty("Wrapped")
	private List<Contributor> wrappedContributors;

	@JsonProperty("Type")
	private String type;

	@JsonProperty("EmailAddress")
	private String emailAddress;

	public Integer getContribOrder() {
		return contribOrder;
	}

	public void setContribOrder(Integer contribOrder) {
		this.contribOrder = contribOrder;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getPersonalTitle() {
		return personalTitle;
	}

	public void setPersonalTitle(String personalTitle) {
		this.personalTitle = personalTitle;
	}

	public String getProfessionalTitle() {
		return professionalTitle;
	}

	public void setProfessionalTitle(String professionalTitle) {
		this.professionalTitle = professionalTitle;
	}

	public String getOriginalForm() {
		return originalForm;
	}

	public void setOriginalForm(String originalForm) {
		this.originalForm = originalForm;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public void addRole(Role toAdd) {
		if (roles == null) {
			roles = new ArrayList<>();
		}
		roles.add(toAdd);
	}

	public List<String> getAffiliations() {
		return affiliations;
	}

	public void setAffiliations(List<String> affiliations) {
		this.affiliations = affiliations;
	}

	public void addAffiliation(String toAdd) {
		if (affiliations == null) {
			affiliations = new ArrayList<>();
		}
		affiliations.add(toAdd);
	}

	public List<String> getRepresenting() {
		return representing;
	}

	public void setRepresenting(List<String> representing) {
		this.representing = representing;
	}

	public void addRepresenting(String toAdd) {
		if (representing == null) {
			representing = new ArrayList<>();
		}
		representing.add(toAdd);
	}

	public List<Nominated> getNominated() {
		return nominated;
	}

	public void setNominated(List<Nominated> nominated) {
		this.nominated = nominated;
	}

	public void addNominated(Nominated toAdd) {
		if (nominated == null) {
			nominated = new ArrayList<>();
		}
		nominated.add(toAdd);
	}

	public CongressPerson getCongressPerson() {
		return congressPerson;
	}

	public void setCongressPerson(CongressPerson congressPerson) {
		this.congressPerson = congressPerson;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Collation getCollation() {
		return collation;
	}

	public void setCollation(Collation collation) {
		this.collation = collation;
	}

	public List<Contributor> getWrappedContributors() {
		return wrappedContributors;
	}

	public void setWrappedContributors(List<Contributor> wrappedContributors) {
		this.wrappedContributors = wrappedContributors;
	}

	public void addWrappedContributor(Contributor toAdd) {
		if (wrappedContributors == null) {
			wrappedContributors = new ArrayList<>();
		}
		wrappedContributors.add(toAdd);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Integer getXmlOrder() {
		return xmlOrder;
	}

	public void setXmlOrder(Integer xmlOrder) {
		this.xmlOrder = xmlOrder;
	}

	@Override
	public String toString() {
		return "Contributor{" +
				"xmlOrder=" + xmlOrder +
				", contribOrder=" + contribOrder +
				", lastName='" + lastName + '\'' +
				", firstName='" + firstName + '\'' +
				", middleName='" + middleName + '\'' +
				", suffix='" + suffix + '\'' +
				", personalTitle='" + personalTitle + '\'' +
				", professionalTitle='" + professionalTitle + '\'' +
				", originalForm='" + originalForm + '\'' +
				", roles=" + roles +
				", affiliations=" + affiliations +
				", representing=" + representing +
				", nominated=" + nominated +
				", congressPerson=" + congressPerson +
				", text='" + text + '\'' +
				", collation=" + collation +
				", wrappedContributors=" + wrappedContributors +
				", type='" + type + '\'' +
				", emailAddress='" + emailAddress + '\'' +
				'}';
	}
}
