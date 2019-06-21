package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("DocumentParticipant")
public class DocumentParticipant extends OXMContent {

	private static final long serialVersionUID = 1L;


	@JsonProperty("Participants")
	private List<Contributor> participants;

	public List<Contributor> getParticipants() {
		return participants;
	}

	public void setParticipants(List<Contributor> participants) {
		this.participants = participants;
	}

	public void addParticipant(Contributor participant) {
		if (participants == null) {
			participants = new ArrayList<>();
		}
		participants.add(participant);
	}

	@Override
	public String toString() {
		return "DocumentParticipant{" +
				"participants=" + participants +
				'}';
	}
}
