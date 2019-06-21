package pqe.ecms.tracking.domain.helper;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

/**
 * Created by Rtabassi on 1/19/2018.
 */
public class CustomDateDeserializer extends StdDeserializer<ZonedDateTime> {

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
