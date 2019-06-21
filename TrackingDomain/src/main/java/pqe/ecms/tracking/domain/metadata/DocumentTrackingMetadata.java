package pqe.ecms.tracking.domain.metadata;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocumentTrackingMetadata {
	private String containingFileUUID;
	private String actionCode;
	private String legacyPlatform;
	private String legacyID;
	private String legacyPubID;
	private Integer version;
	private DocumentEventType documentEventType;

	public String getContainingFileUUID() {
		return containingFileUUID;
	}

	public void setContainingFileUUID(String containingFileUUID) {
		this.containingFileUUID = containingFileUUID;
	}

	public String getActionCode() {
		return actionCode;
	}

	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

	public String getLegacyPlatform() {
		return legacyPlatform;
	}

	public void setLegacyPlatform(String legacyPlatform) {
		this.legacyPlatform = legacyPlatform;
	}

	public String getLegacyID() {
		return legacyID;
	}

	public void setLegacyID(String legacyID) {
		this.legacyID = legacyID;
	}

	public String getLegacyPubID() {
		return legacyPubID;
	}

	public void setLegacyPubID(String legacyPubID) {
		this.legacyPubID = legacyPubID;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public DocumentEventType getDocumentEventType() {
		return documentEventType;
	}

	public void setDocumentEventType(DocumentEventType documentEventType) {
		this.documentEventType = documentEventType;
	}


	@Override
	public String toString() {
		return "DocumentTrackingMetadata{" +
				"containingFileUUID='" + containingFileUUID + '\'' +
				", actionCode='" + actionCode + '\'' +
				", legacyPlatform='" + legacyPlatform + '\'' +
				", legacyID='" + legacyID + '\'' +
				", legacyPubID='" + legacyPubID + '\'' +
				", version=" + version +
				", documentEventType=" + documentEventType +
				'}';
	}
}
