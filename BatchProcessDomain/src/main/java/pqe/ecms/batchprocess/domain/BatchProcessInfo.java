package pqe.ecms.batchprocess.domain;

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

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class BatchProcessInfo {


	public enum ProcessStatus {
		ACTIVE,
		PENDING,
		NO_DOCUMENTS_LEFT,
		READY_FOR_DELIVERY,
		IN_PROGRESS,
		PAUSED,
		ERROR,
		DELIVERED,
		COMPLETE
	}

	private Long reportId;
	private BatchProcessRequest.SetType setType = BatchProcessRequest.SetType.DOCSET;
	private Long docSetId;
	private Long searchId;

	@JsonSerialize(using = CustomDateSerializer.class)
	@JsonDeserialize(using = CustomDateDeserializer.class)
	private ZonedDateTime lastActivityDate;
	@JsonSerialize(using = CustomDateSerializer.class)
	@JsonDeserialize(using = CustomDateDeserializer.class)
	private ZonedDateTime createdDate;
	private ProcessStatus processStatus;
	private Boolean completed = false;

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

	public Boolean getCompleted() {
		return completed;
	}

	public Long getReportId() {
		return reportId;
	}

	public void setReportId(Long reportId) {
		this.reportId = reportId;
	}

	public BatchProcessRequest.SetType getSetType() {
		return setType;
	}

	public void setSetType(BatchProcessRequest.SetType setType) {
		this.setType = setType;
	}

	public Long getDocSetId() {
		return docSetId;
	}

	public void setDocSetId(Long docSetId) {
		this.docSetId = docSetId;
	}

	public Long getSearchId() {
		return searchId;
	}

	public void setSearchId(Long searchId) {
		this.searchId = searchId;
	}


	public ZonedDateTime getLastActivityDate() {
		return lastActivityDate;
	}

	public void setLastActivityDate(ZonedDateTime lastActivityDate) {
		this.lastActivityDate = lastActivityDate;
	}

	public ProcessStatus getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(ProcessStatus processStatus) {
		this.processStatus = processStatus;
	}

	public ZonedDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(ZonedDateTime createdDate) {
		this.createdDate = createdDate;
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
