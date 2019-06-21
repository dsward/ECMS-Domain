package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Objects;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName( "ObjectType")
public class SingleObjectType {
	
	@JsonProperty("ObjectType")
	private String objectType;
	
	@JsonProperty("ObjectTypeOrigin")
	private String objectTypeOrigin;

	public String getObjectType() {
		return objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public String getObjectTypeOrigin() {
		return objectTypeOrigin;
	}

	public void setObjectTypeOrigin(String objectTypeOrigin) {
		this.objectTypeOrigin = objectTypeOrigin;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof SingleObjectType)) return false;
		SingleObjectType that = (SingleObjectType) o;
		return Objects.equals(getObjectType(), that.getObjectType()) &&
				Objects.equals(getObjectTypeOrigin(), that.getObjectTypeOrigin());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getObjectType(), getObjectTypeOrigin());
	}
}
