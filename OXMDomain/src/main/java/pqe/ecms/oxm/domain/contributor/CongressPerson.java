package pqe.ecms.oxm.domain.contributor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("CongressPerson")
public class CongressPerson {

    @JsonProperty("Type")
    private String type;

    @JsonProperty("PartyAffiliation")
    private String partyAffiliation;

    @JsonProperty("State")
    private String state;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPartyAffiliation() {
        return partyAffiliation;
    }

    public void setPartyAffiliation(String partyAffiliation) {
        this.partyAffiliation = partyAffiliation;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "CongressPerson{" +
                "type=" + type +
                ", partyAffiliation=" + partyAffiliation +
                ", state=" + state +
                '}';
    }
}
