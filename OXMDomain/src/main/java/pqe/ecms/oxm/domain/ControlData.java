package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("ControlData")
public class ControlData extends OXMContent {
	private static final long serialVersionUID = 1L;

	@JsonProperty("Action")
	private String action;

	@JsonProperty("LastUpdateTime")
	private String lastUpdateTime;

	@JsonProperty("CreatedBy")
	private String createdBy;

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		String builder = "ControlData [action=" +
				action +
				", lastUpdateTime=" +
				lastUpdateTime +
				", createdBy=" +
				createdBy +
				"]";
		return builder;
	}

}
