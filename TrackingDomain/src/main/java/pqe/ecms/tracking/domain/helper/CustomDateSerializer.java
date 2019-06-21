package pqe.ecms.tracking.domain.helper;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Rtabassi on 1/19/2018.
 */
public class CustomDateSerializer extends StdSerializer<ZonedDateTime> {

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