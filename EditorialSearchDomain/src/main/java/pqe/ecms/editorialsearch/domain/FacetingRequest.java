package pqe.ecms.editorialsearch.domain;

import java.util.List;

/**
 * @author sburroughs 1/21/2016
 */
public class FacetingRequest {

	private String fieldName;

	private List<String> values;

	private Type type;

	private List<String> modifiers;

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public List<String> getValues() {
		return values;
	}

	public void setValues(List<String> values) {
		this.values = values;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public List<String> getModifiers() {
		return modifiers;
	}

	public void setModifiers(List<String> modifiers) {
		this.modifiers = modifiers;
	}

	@Override
	public String toString() {
		return "FacetingRequest{" +
				"fieldName='" + fieldName + '\'' +
				", values=" + values +
				", type=" + type +
				", modifiers=" + modifiers +
				'}';
	}

	/**
	 *
	 */
	public enum Type {
		FIELD, QUERY
	}
}
