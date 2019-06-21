package pqe.ecms.editorialsearch.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 * Represents a field within a search hit document.
 *
 * @author fperez
 */
@JsonRootName("HitField")
public class HitField {

	@JsonProperty("FieldName")
	private String fieldName;

	@JsonProperty("Text")
	private List<String> values = new ArrayList<>();

	/**
	 * Only used for serialization purposes - not for standard object creation. Use {@link #newField()} instead.
	 */
	public HitField() {

	}

	private HitField(Builder builder) {
		this.fieldName = builder.fieldName;
		this.values = builder.values;
	}

	public static Builder newField() {
		return new Builder();
	}

	public String getFieldName() {
		return fieldName;
	}

	public List<String> getValues() {
		return values;
	}

	/**
	 * Builder class
	 */
	public static class Builder {
		private String fieldName;
		private List<String> values = new ArrayList<>();

		public Builder fieldName(String fieldName) {
			this.fieldName = fieldName;
			return this;
		}

		public <T> Builder values(Collection<T> values) {
			if (values != null) {
				for (T value : values) {
					this.values.add(value.toString().trim());
				}
			}

			return this;
		}

		public HitField build() {
			return new HitField(this);
		}

	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public void setValues(List<String> values) {
		this.values = values;
	}

}
