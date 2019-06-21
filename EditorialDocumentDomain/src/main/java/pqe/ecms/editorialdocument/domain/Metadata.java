package pqe.ecms.editorialdocument.domain;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import pqe.ecms.editorialdocument.domain.externalid.ExternalId;

import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "Metadata")
public class Metadata implements Serializable {

	@JsonIgnore
	private static final long serialVersionUID = 1L;
	public boolean exportable;
	public String client;
	@JsonProperty("LegacyPlatform")
	public String legacyPlatform;
	@JsonProperty("LegacyId")
	public String legacyId;
	/**
	 * Timestamp for when the document's import batch's import began, a common value across all documents in the batch
	 */
	@JsonSerialize(using = CustomDateSerializer.class)
	@JsonDeserialize(using = CustomDateDeserializer.class)
	protected ZonedDateTime importDate;
	/**
	 * Timestamp this individual document was first stored
	 */
	@JsonSerialize(using = CustomDateSerializer.class)
	@JsonDeserialize(using = CustomDateDeserializer.class)
	protected ZonedDateTime createdDate;
	/**
	 * Timestamp this document was last updated, when the current version of the document was stored
	 */
	@JsonSerialize(using = CustomDateSerializer.class)
	@JsonDeserialize(using = CustomDateDeserializer.class)
	protected ZonedDateTime lastUpdateDate;
	/**
	 * Timestamp for when this specific version of the document was exported
	 */
	@JsonIgnore //TODO: Find a way to serialize and derserialize the list of ZonedDateTime
	protected List<ZonedDateTime> exportDate;
	/**
	 * Login username of the last updating user
	 */
	protected String lastUpdateUserName;
	/**
	 * the latest version number of the document body
	 */
	protected int version;
	protected int firstExportedVersion;
	protected int recentExportedVersion;
	/**
	 * Timestamp for the first time the document was exported
	 */
	@JsonSerialize(using = CustomDateSerializer.class)
	@JsonDeserialize(using = CustomDateDeserializer.class)
	private ZonedDateTime firstExportDate;
	/**
	 * Timestamp for the recent time the document was exported
	 */
	@JsonSerialize(using = CustomDateSerializer.class)
	@JsonDeserialize(using = CustomDateDeserializer.class)
	private ZonedDateTime recentExportDate;
	@JsonProperty("ExternalIds")
	private ExternalId externalIds;
	@JsonProperty("Status")
	private List<Status> status;

	@JsonProperty("ImportDate")
	public ZonedDateTime getImportDate() {
		return importDate;
	}

	public void setImportDate(ZonedDateTime importDate) {
		this.importDate = importDate;
	}

	@JsonProperty("CreatedDate")
	public ZonedDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(ZonedDateTime createdDate) {
		this.createdDate = createdDate;
	}

	@JsonProperty("LastUpdateDate")
	public ZonedDateTime getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(ZonedDateTime lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	@JsonIgnore //TODO: Find a way to serialize and derserialize the list of ZonedDateTime
	public List<ZonedDateTime> getExportDate() {
		return exportDate;
	}

	public void setExportDate(List<ZonedDateTime> exportDate) {
		this.exportDate = exportDate;
	}

	@JsonProperty("FirstExportDate")
	public ZonedDateTime getFirstExportDate() {
		return firstExportDate;
	}

	public void setFirstExportDate(ZonedDateTime exportDate) {
		this.firstExportDate = exportDate;
	}

	@JsonProperty("RecentExportDate")
	public ZonedDateTime getRecentExportDate() {
		return recentExportDate;
	}

	public void setRecentExportDate(ZonedDateTime recentExportDate) {
		this.recentExportDate = recentExportDate;
	}

	/**
	 * @return the lastUpdateUserName
	 */

	@JsonProperty("LastUpdateUserName")
	public String getLastUpdateUserName() {
		return lastUpdateUserName;
	}

	/**
	 * @param lastUpdateUserName the lastUpdateUserName to set
	 */
	public void setLastUpdateUserName(String lastUpdateUserName) {
		this.lastUpdateUserName = lastUpdateUserName;
	}

	@JsonProperty("Version")
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@JsonProperty("FirstExportedVersion")
	public int getFirstExportedVersion() {
		return firstExportedVersion;
	}

	public void setFirstExportedVersion(int firstExportedVersion) {
		this.firstExportedVersion = firstExportedVersion;
	}

	@JsonProperty("RecentExportedVersion")
	public int getRecentExportedVersion() {
		return recentExportedVersion;
	}

	public void setRecentExportedVersion(int recentExportedVersion) {
		this.recentExportedVersion = recentExportedVersion;
	}

	@JsonProperty("ExternalIds")
	public ExternalId getExternalIds() {
		return externalIds;
	}

	public void setExternalIds(ExternalId externalIds) {
		this.externalIds = externalIds;
	}

	@JsonProperty("Status")
	public List<Status> getStatus() {
		return status;
	}

	public void setStatus(List<Status> status) {
		this.status = status;
	}

	@JsonProperty("Exportable")
	public boolean isExportable() {
		return exportable;
	}

	public void setExportable(boolean exportable) {
		this.exportable = exportable;
	}

	@JsonProperty("Client")
	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

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

	@Override
	public String toString() {
		return "Metadata{" +
				"importDate=" + importDate +
				", createdDate=" + createdDate +
				", lastUpdateDate=" + lastUpdateDate +
				", exportDate=" + exportDate +
				", firstExportDate=" + firstExportDate +
				", recentExportDate=" + recentExportDate +
				", lastUpdateUserName='" + lastUpdateUserName + '\'' +
				", externalIds=" + externalIds +
				", version=" + version +
				", firstExportedVersion=" + firstExportedVersion +
				", recentExportedVersion=" + recentExportedVersion +
				", exportable=" + exportable +
				", client='" + client + '\'' +
				", legacyPlatform='" + legacyPlatform + '\'' +
				", legacyId='" + legacyId + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Metadata metadata = (Metadata) o;
		return getVersion() == metadata.getVersion() &&
				isExportable() == metadata.isExportable() &&
				Objects.equals(getImportDate(), metadata.getImportDate()) &&
				Objects.equals(getCreatedDate(), metadata.getCreatedDate()) &&
				Objects.equals(getLastUpdateDate(), metadata.getLastUpdateDate()) &&
				Objects.equals(getExportDate(), metadata.getExportDate()) &&
				Objects.equals(getLastUpdateUserName(), metadata.getLastUpdateUserName()) &&
				Objects.equals(getExternalIds(), metadata.getExternalIds()) &&
				Objects.equals(getClient(), metadata.getClient()) &&
				Objects.equals(getLegacyPlatform(), metadata.getLegacyPlatform()) &&
				Objects.equals(getLegacyId(), metadata.getLegacyId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getImportDate(), getCreatedDate(), getExportDate(), getLastUpdateDate(), getLastUpdateUserName(), getExternalIds(), getVersion(), isExportable(), getClient(), getLegacyPlatform(), getLegacyId());
	}

	public static class CustomDateSerializer extends StdSerializer<ZonedDateTime> {

		private static final DateTimeFormatter FORMATTER_WITH_MS = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

		protected CustomDateSerializer() {
			super(ZonedDateTime.class);
		}

		protected CustomDateSerializer(Class<ZonedDateTime> t) {
			super(t);
		}

		protected CustomDateSerializer(JavaType type) {
			super(type);
		}

		protected CustomDateSerializer(Class<?> t, boolean dummy) {
			super(t, dummy);
		}

		@Override
		public void serialize(ZonedDateTime value, JsonGenerator gen, SerializerProvider arg2) throws IOException, JsonProcessingException {
			gen.writeString(value.format(FORMATTER_WITH_MS));
		}
	}

	public static class CustomDateDeserializer extends StdDeserializer<ZonedDateTime> {

		private static final DateTimeFormatter FORMATTER_WITHOUT_MS = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
		private static final DateTimeFormatter FORMATTER_WITH_MS1 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.S'Z'");
		private static final DateTimeFormatter FORMATTER_WITH_MS2 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SS'Z'");
		private static final DateTimeFormatter FORMATTER_WITH_MS3 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

		private static final Pattern WITH_MS3_PATTERN = Pattern.compile("[.][0-9]{3}Z$");
		private static final Pattern WITH_MS2_PATTERN = Pattern.compile("[.][0-9]{2}Z$");
		private static final Pattern WITH_MS1_PATTERN = Pattern.compile("[.][0-9]{1}Z$");

		protected CustomDateDeserializer() {
			super(ZonedDateTime.class);
		}

		protected CustomDateDeserializer(Class<?> vc) {
			super(vc);
		}

		protected CustomDateDeserializer(JavaType valueType) {
			super(valueType);
		}

		protected CustomDateDeserializer(StdDeserializer<?> src) {
			super(src);
		}

		@Override
		public ZonedDateTime deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
			String asText = p.getText();
			if (WITH_MS3_PATTERN.matcher(asText).find()) {
				return LocalDateTime.parse(asText, FORMATTER_WITH_MS3).atZone(ZoneId.of("UTC"));
			} else if (WITH_MS2_PATTERN.matcher(asText).find()) {
				return LocalDateTime.parse(asText, FORMATTER_WITH_MS2).atZone(ZoneId.of("UTC"));
			} else if (WITH_MS1_PATTERN.matcher(asText).find()) {
				return LocalDateTime.parse(asText, FORMATTER_WITH_MS1).atZone(ZoneId.of("UTC"));
			} else {
				return LocalDateTime.parse(asText, FORMATTER_WITHOUT_MS).atZone(ZoneId.of("UTC"));
			}
		}
	}
}
