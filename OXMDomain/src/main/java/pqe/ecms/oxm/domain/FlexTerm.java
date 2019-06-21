package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlexTerm implements Serializable {

	@JsonIgnore
	private static final long serialVersionUID = 1L;

	@JsonIgnore
	private String name;
	private String value;
	private String source;
	private Boolean modifiable = true;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Boolean getModifiable() {
		return modifiable;
	}

	public void setModifiable(Boolean modifiable) {
		this.modifiable = modifiable;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof FlexTerm)) return false;
		FlexTerm that = (FlexTerm) o;
		return Objects.equals(getValue(), that.getValue()) &&
				Objects.equals(getModifiable(), that.getModifiable());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getValue(), getModifiable());
	}

	public static class Builder {
		private String value;
		private String source;

		public Builder value(String value) {
			this.value = value;
			return this;
		}

		public Builder source(String source) {
			this.source = source;
			return this;
		}


		public FlexTerm build() {
			FlexTerm result = new FlexTerm();
			result.value = value;
			result.source = source;

			return result;
		}

	}

}
