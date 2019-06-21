package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("Title")
public class MR3Title extends OXMContent {

	private static final long serialVersionUID = 1L;

	@JsonProperty("DissertationsNumber")
	private String dissertationsNumber;

	@JsonProperty("Title")
	private String title;

	@JsonProperty("PageCount")
	private String pageCount;

	@JsonProperty("ISBN")
	private List<String> isbn;

	@JsonProperty("DegreeYear")
	private String degreeYear;

	@JsonProperty("DateText")
	private String dateText;

	@JsonProperty("DegreeCode")
	private String degreeCode;

	@JsonProperty("DegreeDescription")
	private String degreeDescription;

	@JsonProperty("Author")
	private String author;

	@JsonProperty("ActionCode")
	private String actionCode;

	public String getDissertationsNumber() {
		return dissertationsNumber;
	}

	public void setDissertationsNumber(String dissertationsNumber) {
		this.dissertationsNumber = dissertationsNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPageCount() {
		return pageCount;
	}

	public void setPageCount(String pageCount) {
		this.pageCount = pageCount;
	}

	public List<String> getIsbn() {
		return isbn;
	}

	public void setIsbn(List<String> isbn) {
		this.isbn = isbn;
	}

	public void addIsbn(String addIsbn) {
		if (isbn == null) {
			isbn = new ArrayList<>();
		}
		isbn.add(addIsbn);
	}

	public String getDegreeYear() {
		return degreeYear;
	}

	public void setDegreeYear(String degreeYear) {
		this.degreeYear = degreeYear;
	}

	public String getDegreeCode() {
		return degreeCode;
	}

	public void setDegreeCode(String degreeCode) {
		this.degreeCode = degreeCode;
	}

	public String getDegreeDescription() {
		return degreeDescription;
	}

	public void setDegreeDescription(String degreeDescription) {
		this.degreeDescription = degreeDescription;
	}

	public String getDateText() {
		return dateText;
	}

	public void setDateText(String dateText) {
		this.dateText = dateText;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getActionCode() {
		return actionCode;
	}

	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

	@Override
	public String toString() {
		return "MR3Title{" +
				"dissertationsNumber='" + dissertationsNumber + '\'' +
				", title='" + title + '\'' +
				", pageCount='" + pageCount + '\'' +
				", isbn=" + isbn +
				", degreeYear='" + degreeYear + '\'' +
				", dateText='" + dateText + '\'' +
				", degreeCode='" + degreeCode + '\'' +
				", degreeDescription='" + degreeDescription + '\'' +
				", author='" + author + '\'' +
				", actionCode='" + actionCode + '\'' +
				'}';
	}
}
