package pqe.ecms.tracking.domain.message;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import pqe.ecms.tracking.domain.helper.CustomDateDeserializer;
import pqe.ecms.tracking.domain.helper.CustomDateSerializer;

import java.time.ZonedDateTime;
import java.util.Objects;

public class TrackedExport {
	private String legacyPlatform;
	private String legacyId;
	private Integer version;
	@JsonSerialize(using = CustomDateSerializer.class)
	@JsonDeserialize(using = CustomDateDeserializer.class)
	private ZonedDateTime exportDate;

	public String getLegacyPlatform() {
		return legacyPlatform;
	}

	public void setLegacyPlatform(String legacyPlatform) {
		this.legacyPlatform = legacyPlatform;
	}

	public String getLegacyId() {
		return legacyId;
	}

	public void setLegacyId(String legacyId) {
		this.legacyId = legacyId;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public ZonedDateTime getExportDate() {
		return exportDate;
	}

	public void setExportDate(ZonedDateTime exportDate) {
		this.exportDate = exportDate;
	}

	@Override
	public String toString() {
		return "TrackedExport{" +
				"legacyPlatform='" + legacyPlatform + '\'' +
				", legacyId='" + legacyId + '\'' +
				", version=" + version +
				", exportDate=" + exportDate +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		TrackedExport that = (TrackedExport) o;
		return Objects.equals(legacyPlatform, that.legacyPlatform) &&
				Objects.equals(legacyId, that.legacyId) &&
				Objects.equals(version, that.version) &&
				Objects.equals(exportDate, that.exportDate);
	}

	@Override
	public int hashCode() {

		return Objects.hash(legacyPlatform, legacyId, version, exportDate);
	}
}
