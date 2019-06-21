package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("DocumentControlStructure")
public class DocumentControlStructure extends OXMContent {

	@JsonIgnore
	private static final long serialVersionUID = 1L;

	@JsonProperty("Platform")
	private String platform;

	@JsonProperty("PublicationID")
	private String publicationID;

	@JsonProperty("GroupID")
	private String groupID;

	@JsonProperty("AlphaPublicationDate")
	private String alphaPublicationDate;

	@JsonProperty("NumericPublicationDate")
	private String numericPublicationDate;

	@JsonProperty("StartDate")
	private String startDate;

	@JsonProperty("EndDate")
	private String endDate;

	@JsonProperty("Volume")
	private String volume;

	@JsonProperty("Issue")
	private String issue;

	@JsonProperty("Part")
	private String part;

	@JsonProperty("Supplement")
	private String supplement;

	@JsonProperty("Section")
	private String section;

	@JsonProperty("NonStandardCitation")
	private String nonStandardCitation;

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getPublicationID() {
		return publicationID;
	}

	public void setPublicationID(String publicationID) {
		this.publicationID = publicationID;
	}

	public String getGroupID() {
		return groupID;
	}

	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}

	public String getAlphaPublicationDate() {
		return alphaPublicationDate;
	}

	public void setAlphaPublicationDate(String alphaPublicationDate) {
		this.alphaPublicationDate = alphaPublicationDate;
	}

	public String getNumericPublicationDate() {
		return numericPublicationDate;
	}

	public void setNumericPublicationDate(String numericPublicationDate) {
		this.numericPublicationDate = numericPublicationDate;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public String getSupplement() {
		return supplement;
	}

	public void setSupplement(String supplement) {
		this.supplement = supplement;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getNonStandardCitation() {
		return nonStandardCitation;
	}

	public void setNonStandardCitation(String nonStandardCitation) {
		this.nonStandardCitation = nonStandardCitation;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DocumentControlStructure [platform=");
		builder.append(platform);
		builder.append(", publicationID=");
		builder.append(publicationID);
		builder.append(", groupID=");
		builder.append(groupID);
		builder.append(", alphaPublicationDate=");
		builder.append(alphaPublicationDate);
		builder.append(", numericPublicationDate=");
		builder.append(numericPublicationDate);
		builder.append(", startDate=");
		builder.append(startDate);
		builder.append(", endDate=");
		builder.append(endDate);
		builder.append(", volume=");
		builder.append(volume);
		builder.append(", issue=");
		builder.append(issue);
		builder.append(", part=");
		builder.append(part);
		builder.append(", supplement=");
		builder.append(supplement);
		builder.append(", section=");
		builder.append(section);
		builder.append(", nonStandardCitation=");
		builder.append(nonStandardCitation);
		builder.append("]");
		return builder.toString();
	}
}
