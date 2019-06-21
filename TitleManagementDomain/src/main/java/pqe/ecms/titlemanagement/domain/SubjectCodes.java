package pqe.ecms.titlemanagement.domain;

import java.util.ArrayList;
import java.util.List;

public class SubjectCodes {

	private List<String> subjectCodes = new ArrayList<>();

	public List<String> getSubjectCodes() {
		return subjectCodes;
	}

	public void setSubjectCodes(List<String> subjectCodes) {
		this.subjectCodes = subjectCodes;
	}

	@Override
	public String toString() {
		return "SubjectCodes{" +
				"subjectCodes=" + subjectCodes +
				'}';
	}
}
