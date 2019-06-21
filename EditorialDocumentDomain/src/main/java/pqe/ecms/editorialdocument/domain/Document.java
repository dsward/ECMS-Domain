/**
 *
 */

package pqe.ecms.editorialdocument.domain;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "Document")
public class Document implements Serializable {
	@JsonIgnore
	private static final long serialVersionUID = 1L;

	protected Long documentId;

	protected Metadata metadata;


	protected Body body;

	public Document() {
		// TODO Auto-generated constructor stub
	}

	@JsonProperty("DocumentId")
	public Long getDocumentId() {
		return documentId;
	}

	public void setDocumentId(Long documentId) {
		this.documentId = documentId;
	}

	/**
	 * @return the metadata
	 */
	@JsonProperty("Metadata")
	public Metadata getMetadata() {
		return metadata;
	}

	/**
	 * @param metadata the metadata to set
	 */
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	/**
	 * @return the version
	 */


	@JsonProperty("Body")
	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Document{" +
				"documentId=" + documentId +
				", metadata=" + metadata +
				", body=" + body +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Document document = (Document) o;
		return Objects.equals(getDocumentId(), document.getDocumentId()) &&
				Objects.equals(getMetadata(), document.getMetadata()) &&
				Objects.equals(getBody(), document.getBody());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getDocumentId(), getMetadata(), getBody());
	}
}
