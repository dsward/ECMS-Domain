package pqe.ecms.editorialdocument.domain.externalid;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "ExternalId")
public class ExternalId {

	private List<DocumentIdentifierMetadata> documentIdentifierMetadata;

	@JsonProperty("PlatformDocIds")
	public List<DocumentIdentifierMetadata> getDocumentIdentifierMetadata() {
		return documentIdentifierMetadata;
	}

	public void setDocumentIdentifierMetadata(List<DocumentIdentifierMetadata> documentIdentifierMetadata) {
		this.documentIdentifierMetadata = documentIdentifierMetadata;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		ExternalId that = (ExternalId) o;

		return documentIdentifierMetadata != null ? documentIdentifierMetadata.equals(that.documentIdentifierMetadata) : that.documentIdentifierMetadata == null;
	}

	@Override
	public int hashCode() {
		return documentIdentifierMetadata != null ? documentIdentifierMetadata.hashCode() : 0;
	}

	public static Builder newBuilder() {
		return new Builder();
	}

	public static class Builder {

		List<DocumentIdentifierMetadata> documentIdentifierMetadata;

		public Builder setDocumentIdentifierMetadata(List<DocumentIdentifierMetadata> value) {
			this.documentIdentifierMetadata = new ArrayList<>();
			this.documentIdentifierMetadata.addAll(value);
			return this;
		}

		public Builder addDocumentIdentifierMetadata(DocumentIdentifierMetadata value) {
			this.documentIdentifierMetadata = Optional.ofNullable(documentIdentifierMetadata).orElseGet(ArrayList::new);
			this.documentIdentifierMetadata.add(value);
			return this;
		}

		public ExternalId build() {
			ExternalId result = new ExternalId();
			result.setDocumentIdentifierMetadata(documentIdentifierMetadata);
			return result;
		}
	}
}
