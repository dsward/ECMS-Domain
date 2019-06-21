package pqe.ecms.tracking.domain.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import pqe.ecms.tracking.domain.helper.CustomDateDeserializer;
import pqe.ecms.tracking.domain.helper.CustomDateSerializer;
import pqe.ecms.tracking.domain.metadata.DocumentTrackingMetadata;
import pqe.ecms.tracking.domain.metadata.FileTrackingMetadata;

import java.time.ZonedDateTime;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseTrackingEvent {
	private TrackingMetadataType trackingMetadataType;
	private SystemTracked systemTracked;
	private String processIdentifier;
	private String hostName;
	@JsonSerialize(using = CustomDateSerializer.class)
	@JsonDeserialize(using = CustomDateDeserializer.class)
	private ZonedDateTime eventTimestamp;
	private Long processSequence;
	private FileTrackingMetadata fileTrackingMetadata;
	private DocumentTrackingMetadata documentTrackingMetadata;


	public TrackingMetadataType getTrackingMetadataType() {
		return trackingMetadataType;
	}

	public void setTrackingMetadataType(TrackingMetadataType trackingMetadataType) {
		this.trackingMetadataType = trackingMetadataType;
	}

	public SystemTracked getSystemTracked() {
		return systemTracked;
	}

	public void setSystemTracked(SystemTracked systemTracked) {
		this.systemTracked = systemTracked;
	}

	public String getProcessIdentifier() {
		return processIdentifier;
	}

	public void setProcessIdentifier(String processIdentifier) {
		this.processIdentifier = processIdentifier;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public ZonedDateTime getEventTimestamp() {
		return eventTimestamp;
	}

	public void setEventTimestamp(ZonedDateTime eventTimestamp) {
		this.eventTimestamp = eventTimestamp;
	}

	public Long getProcessSequence() {
		return processSequence;
	}

	public void setProcessSequence(Long processSequence) {
		this.processSequence = processSequence;
	}

	public FileTrackingMetadata getFileTrackingMetadata() {
		return fileTrackingMetadata;
	}

	public void setFileTrackingMetadata(FileTrackingMetadata fileTrackingMetadata) {
		this.fileTrackingMetadata = fileTrackingMetadata;
	}

	public DocumentTrackingMetadata getDocumentTrackingMetadata() {
		return documentTrackingMetadata;
	}

	public void setDocumentTrackingMetadata(DocumentTrackingMetadata documentTrackingMetadata) {
		this.documentTrackingMetadata = documentTrackingMetadata;
	}


	@Override
	public String toString() {
		return "BaseTrackingEvent{" +
				"trackingMetadataType=" + trackingMetadataType +
				", systemTracked=" + systemTracked +
				", processIdentifier='" + processIdentifier + '\'' +
				", hostName='" + hostName + '\'' +
				", eventTimestamp=" + eventTimestamp +
				", processSequence=" + processSequence +
				", fileTrackingMetadata=" + fileTrackingMetadata +
				", documentTrackingMetadata=" + documentTrackingMetadata +
				'}';
	}
}
