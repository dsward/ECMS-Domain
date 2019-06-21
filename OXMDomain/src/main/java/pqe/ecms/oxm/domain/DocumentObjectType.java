package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;
import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName( "DocumentObjectType")
public class DocumentObjectType extends OXMContent {

	private static final long serialVersionUID = 1L;
	
	@JsonProperty("ObjectTypes")
	private List<SingleObjectType> objectTypes = new ArrayList<>();

	public List<SingleObjectType> getObjectTypes() {
		return objectTypes;
	}

	public void setObjectTypes(List<SingleObjectType> objectTypes) {
		this.objectTypes = objectTypes;
	}
}
