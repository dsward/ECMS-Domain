package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;
import java.util.List;

/**
 * Oxm for Titles
 *
 * @author rtabassi
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("DocumentTitle")
public class DocumentTitle extends OXMContent {

	private static final long serialVersionUID = 1L;

	@JsonProperty("Title")
	private String title;

	@JsonProperty("TitleLanguage")
	private String titleLanguage;

	@JsonProperty("AlternateTitles")
	private List<Title> alternateTitles = new ArrayList<>();

	@JsonProperty("SubTitle")
	private String subtitle;

	@JsonProperty("SubTitleLanguage")
	private String subtitleLanguage;

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitleLanguage() { return titleLanguage; }

	public void setTitleLanguage(String titleLanguage) { this.titleLanguage = titleLanguage; }

	/**
	 * @return list of Titles
	 */
	public List<Title> getAlternateTitles() {
		return alternateTitles;
	}

	/**
	 * @param alternateTitles The Titles to set
	 */
	public void setAlternateTitles(List<Title> alternateTitles) {
		this.alternateTitles = alternateTitles;
	}

	public void addAlternateTitles(Title toAdd) {
		if (alternateTitles == null) {
			alternateTitles = new ArrayList<>();
		}
		alternateTitles.add(toAdd);
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getSubtitleLanguage() { return subtitleLanguage; }

	public void setSubtitleLanguage(String subtitleLanguage) { this.subtitleLanguage = subtitleLanguage; }

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TitleContent [title=");
		builder.append(title);
		builder.append(", titleLanguage=");
		builder.append(titleLanguage);
		builder.append(", alternateTitles=");
		builder.append(alternateTitles);
		builder.append(", subtitle=");
		builder.append(subtitle);
		builder.append(", subtitleLanguage=");
		builder.append(subtitleLanguage);
		builder.append("]");
		return builder.toString();
	}

}
