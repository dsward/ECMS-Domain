package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LitWorkID {
	@JsonIgnore
	private static final long serialVersionUID = 1L;

	@JsonProperty("IDType")
	private String idType;

	@JsonProperty("ID")
	private String id;

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		LitWorkID litWorkID = (LitWorkID) o;
		return Objects.equals(getIdType(), litWorkID.getIdType()) &&
				Objects.equals(getId(), litWorkID.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getIdType(), getId());
	}

	@Override
	public String toString() {
		return "LitWorkID{" +
				"idType='" + idType + '\'' +
				", id='" + id + '\'' +
				'}';
	}
}
