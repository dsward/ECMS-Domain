package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName("DocumentObjectBundles")
public class DocumentObjectBundles {
	private static final long serialVersionUID = 1L;

	@JsonProperty("ObjectBundles")
	private List<ObjectBundle> objectBundles;

	public List<ObjectBundle> getObjectBundles() {
		return objectBundles;
	}

	public void setObjectBundles(List<ObjectBundle> objectBundles) {
		this.objectBundles = objectBundles;
	}

	public void addObjectBundle(ObjectBundle objectBundle) {
		if (objectBundles == null) {
			objectBundles = new ArrayList<>();
		}
		objectBundles.add(objectBundle);
	}

	@Override
	public String toString() {
		return "DocumentObjectBundles{" +
				"objectBundles=" + objectBundles +
				'}';
	}

}
