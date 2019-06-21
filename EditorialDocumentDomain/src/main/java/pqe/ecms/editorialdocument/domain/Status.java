package pqe.ecms.editorialdocument.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.io.Serializable;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "Status")
public class Status implements Serializable {

	@JsonProperty("Namespace")
	private StatusNamespace namespace;

	@JsonProperty("Type")
	private StatusType type;

	public enum StatusType {
		REJECTED,
		VALID,
		READ_ONLY
	}

	public enum StatusNamespace {
		cis_index_ingest("CIS_INDEX_INGEST"),
		statisticalresearch("STATISTICALRESEARCH"),
		globalschemaingest("GLOBALSCHEMAINGEST"),
		researchtopic("RESEARCHTOPIC");

		private final String value;

		StatusNamespace(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}

	public StatusNamespace getNamespace() {
		return namespace;
	}

	public void setNamespace(StatusNamespace namespace) {
		this.namespace = namespace;
	}

	public StatusType getType() {
		return type;
	}

	public void setType(StatusType type) {
		this.type = type;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Status)) return false;
		Status status = (Status) o;
		return getNamespace() == status.getNamespace() &&
				getType() == status.getType();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getNamespace(), getType());
	}

	@Override
	public String toString() {
		return "Status{" +
				"namespace=" + namespace +
				", type=" + type +
				'}';
	}
}


