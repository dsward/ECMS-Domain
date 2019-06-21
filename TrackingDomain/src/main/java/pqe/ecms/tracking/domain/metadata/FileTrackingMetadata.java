package pqe.ecms.tracking.domain.metadata;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import pqe.ecms.tracking.domain.helper.CustomDateDeserializer;
import pqe.ecms.tracking.domain.helper.CustomDateSerializer;

import java.time.ZonedDateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FileTrackingMetadata {
	private String directory;
	private String filename;
	@JsonSerialize(using = CustomDateSerializer.class)
	@JsonDeserialize(using = CustomDateDeserializer.class)
	private ZonedDateTime mtime;
	private Long size;
	private String containingFileUUID;
	private String fileUUID;
	private FileEventType fileEventType;

	public String getDirectory() {
		return directory;
	}

	public void setDirectory(String directory) {
		this.directory = directory;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public ZonedDateTime getMtime() {
		return mtime;
	}

	public void setMtime(ZonedDateTime mtime) {
		this.mtime = mtime;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public String getContainingFileUUID() {
		return containingFileUUID;
	}

	public void setContainingFileUUID(String containingFileUUID) {
		this.containingFileUUID = containingFileUUID;
	}

	public FileEventType getFileEventType() {
		return fileEventType;
	}

	public void setFileEventType(FileEventType fileEventType) {
		this.fileEventType = fileEventType;
	}

	public String getFileUUID() {
		return fileUUID;
	}

	public void setFileUUID(String fileUUID) {
		this.fileUUID = fileUUID;
	}

	@Override
	public String toString() {
		return "FileTrackingMetadata{" +
				"directory='" + directory + '\'' +
				", filename='" + filename + '\'' +
				", mtime=" + mtime +
				", size=" + size +
				", containingFileUUID='" + containingFileUUID + '\'' +
				", fileUUID='" + fileUUID + '\'' +
				", fileEventType=" + fileEventType +
				'}';
	}
}
