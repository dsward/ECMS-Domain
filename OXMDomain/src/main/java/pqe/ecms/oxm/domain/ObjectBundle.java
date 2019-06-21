package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName("ObjectBundle")
public class ObjectBundle extends OXMContent {
	private static final long serialVersionUID = 1L;

	@JsonProperty("ObjectBundleType")
	private String objectBundleType;

	@JsonProperty("ObjectBundleValue")
	private String objectBundleValue;

	public String getObjectBundleType() {
		return objectBundleType;
	}

	public void setObjectBundleType(String objectBundleType) {
		this.objectBundleType = objectBundleType;
	}

	public String getObjectBundleValue() {
		return objectBundleValue;
	}

	public void setObjectBundleValue(String objectBundleValue) {
		this.objectBundleValue = objectBundleValue;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof ObjectBundle)) return false;
		ObjectBundle that = (ObjectBundle) o;
		return Objects.equals(getObjectBundleType(), that.getObjectBundleType()) &&
				Objects.equals(getObjectBundleValue(), that.getObjectBundleValue());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getObjectBundleType(), getObjectBundleValue());
	}

	@Override
	public String toString() {
		return "ObjectBundle{" +
				"objectBundleType=" + objectBundleType +
				", objectBundleValue=" + objectBundleValue +
				'}';
	}

}
