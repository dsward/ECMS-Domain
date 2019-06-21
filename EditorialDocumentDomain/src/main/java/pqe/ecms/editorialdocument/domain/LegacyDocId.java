package pqe.ecms.editorialdocument.domain;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LegacyDocId {

	private static final Pattern LEGACY_DOCID_PATTERN = Pattern.compile("([^_]+)_(.+)");

	public static LegacyDocId of(String textualId) {
		Matcher matcher = LEGACY_DOCID_PATTERN.matcher(textualId);
		if (matcher.matches()) {
			return LegacyDocId.of(matcher.group(1), matcher.group(2));
		}
		throw new IllegalArgumentException();
	}

	public static LegacyDocId of(String platform, String identifier) {
		return new LegacyDocId(platform, identifier);
	}

	private String platform;
	private String identifier;

	private LegacyDocId(String platform, String identifier) {
		this.platform = platform;
		this.identifier = identifier;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		LegacyDocId that = (LegacyDocId) o;
		return Objects.equals(getPlatform(), that.getPlatform()) &&
				Objects.equals(getIdentifier(), that.getIdentifier());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getPlatform(), getIdentifier());
	}

	@Override
	public String toString() {
		return "LegacyDocId{" +
				"platform='" + platform + '\'' +
				", identifier='" + identifier + '\'' +
				'}';
	}
}