package pqe.ecms.editorialdocument.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.ZonedDateTime;

/**
 * This is the pojo used for the setExportDate editorialstorage endpoint
 */
public class VersionExportDate {
	@JsonSerialize(using = Metadata.CustomDateSerializer.class)
	@JsonDeserialize(using = Metadata.CustomDateDeserializer.class)
	private ZonedDateTime exportDate;



	public ZonedDateTime getExportDate() {
		return exportDate;
	}

	public void setExportDate(ZonedDateTime exportDate) {
		this.exportDate = exportDate;
	}

	@Override
	public String toString() {
		return "VersionExportDate{" +
				", exportDate=" + exportDate +
				'}';
	}
}
