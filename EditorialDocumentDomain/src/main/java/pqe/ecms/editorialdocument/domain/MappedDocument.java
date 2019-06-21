package pqe.ecms.editorialdocument.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * This is the outcome of a mapper operation on a document.<br>
 * It includes all fields as mapped by the mapper. Each field could have multiple values. The values are backed by a Set to ensure that <br>
 * they are all unique.
 */
@JsonRootName("MappedDocument")
public class MappedDocument {

	@JsonProperty("SourceDocumentId")
	private Long sourceDocumentId;

	@JsonProperty("Fields")
	private Map<String, LinkedHashSet<String>> fields = new ConcurrentHashMap<>();

	public void setDocument(MappedDocument doc) {
		this.sourceDocumentId = doc.sourceDocumentId;
		this.fields = doc.fields;
	}

	/**
	 * Adds an occurrence to a field.
	 *
	 * @param fieldName The name of the field for which to add the value.
	 * @param value     The value to add to the field.
	 */
	public void addField(String fieldName, String value) {
		initFieldIfNeeded(fieldName);
		fields.get(fieldName).add(value);
	}

	/**
	 * Associates a set of values with a field.
	 *
	 * @param fieldName The field name
	 * @param values    The values to add to the field.
	 */
	public void addField(String fieldName, Collection<String> values) {
		initFieldIfNeeded(fieldName);
		fields.get(fieldName).addAll(values);
	}

	public void removeField(String fieldName) {
		String fieldNameDot = fieldName + ".";

		fields.keySet().stream()
				.filter(key -> key.equals(fieldName) || key.startsWith(fieldNameDot))
				.collect(Collectors.toList())
				.forEach(key -> fields.remove(key));
	}

	/**
	 * Checks whether the field is already present in this document with associated values.
	 *
	 * @param fieldName The field name to check
	 * @return true if the field is present in the document. false otherwise.
	 */
	public boolean containsField(String fieldName) {
		return fields.containsKey(fieldName);
	}

	/**
	 * Returns the values associated with a given field.
	 *
	 * @param fieldName The name of the field for which to get its values.
	 * @return the values associated with the field, or an empty list if
	 */
	public List<String> getFieldValues(String fieldName) {
		List<String> values = new ArrayList<>();
		if (containsField(fieldName)) {
			values.addAll(fields.get(fieldName));
		}

		return values;
	}

	/**
	 * Returns the value associated with a field. If a field has multiple values, only one of the occurrences will be returned.
	 *
	 * @param fieldName The field name for which to get the value.
	 * @return The value associated with the field.
	 */
	public String getFieldValue(String fieldName) {
		if (containsField(fieldName)) {
			return fields.get(fieldName).iterator().next();
		} else {
			return null;
		}
	}

	/**
	 * Returns a collection of the fields that are present in the document.
	 *
	 * @return The fields as present in the document.
	 */
	public Collection<String> fieldSet() {
		return fields.keySet();
	}

	/**
	 * @return the source document id
	 */
	public Long getSourceDocumentId() {
		return sourceDocumentId;
	}

	/**
	 * @param sourceDocumentId the source document id to set
	 */
	public void setSourceDocumentId(Long sourceDocumentId) {
		this.sourceDocumentId = sourceDocumentId;
	}

	/**
	 * Internal method to check whether a field is present. If not, then it initializes the field by setting the collection object.
	 *
	 * @param fieldName The field name to initialize, if needed.
	 */
	private void initFieldIfNeeded(String fieldName) {
		fields.putIfAbsent(fieldName, new LinkedHashSet<>());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MappedDocument [\n\tfields=\n");
		for (String field : fields.keySet()) {
			builder.append("FIELD: <").append(field).append(">\n");
			builder.append("VALUES: <").append(fields.get(field)).append(">\n");
		}
		builder.append("\n]");
		return builder.toString();
	}

}