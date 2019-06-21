package pqe.ecms.editorialdocument.domain.externalid;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

/**
 * This contains the sql metadata related to external ids for the given document
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocumentIdentifierMetadata {

	@JsonIgnore
	private long id;

	private String identifierPlatform;

	private String identifierValue;

	private Date identifierDate = new Date();

	public String getIdentifierPlatform() {
		return identifierPlatform;
	}

	public void setIdentifierPlatform(String identifierPlatform) {
		this.identifierPlatform = identifierPlatform;
	}

	public String getIdentifierValue() {
		return identifierValue;
	}

	public void setIdentifierValue(String identifierValue) {
		this.identifierValue = identifierValue;
	}

	public Date getIdentifierDate() {
		return identifierDate;
	}

	public void setIdentifierDate(Date identifierDate) {
		this.identifierDate = identifierDate;
	}

	@Override
	public String toString() {
		return "DocumentIdentifierMetadata{" +
				"id=" + id +
				", identifierPlatform='" + identifierPlatform + '\'' +
				", identifierValue='" + identifierValue + '\'' +
				", identifierDate=" + identifierDate +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;

		DocumentIdentifierMetadata that = (DocumentIdentifierMetadata) o;
		if (!this.getIdentifierPlatform().equals(that.getIdentifierPlatform())) {
			return false;
		}
		return this.getIdentifierValue().equals(that.getIdentifierValue());
	}


	@Override
	public int hashCode() {
		return ((this.getIdentifierValue() + this.getIdentifierPlatform()).hashCode());
	}

	public static Builder newBuilder() {
		return new Builder();
	}

	public static class Builder {

		private String identifierPlatform;
		private String identifierValue;
		private Date identifierDate = new Date();

		public Builder identifierPlatform(String identifierPlatform) {
			this.identifierPlatform = identifierPlatform;
			return this;
		}

		public Builder identifierValue(String identifierValue) {
			this.identifierValue = identifierValue;
			return this;
		}

		public Builder identifierDate(Date identifierDate) {
			this.identifierDate = identifierDate;
			return this;
		}

		public DocumentIdentifierMetadata build() {
			DocumentIdentifierMetadata result = new DocumentIdentifierMetadata();
			result.setIdentifierPlatform(identifierPlatform);
			result.setIdentifierValue(identifierValue);
			result.setIdentifierDate(identifierDate);
			return result;
		}

	}
}
