package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentFlexTerms extends HashMap<String, List<FlexTerm>> {

	@JsonIgnore
	private static final long serialVersionUID = 1L;

	public void addDocumentFlexTerm(String flexTermName, FlexTerm term) {
		putIfAbsent(flexTermName, new ArrayList<>());
		get(flexTermName).add(term);
	}
}
