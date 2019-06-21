package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("Action")
public class Action {

    @JsonProperty("Date")
    private DateType date;

    @JsonProperty("Committee")
    private String committee;

    @JsonProperty("Chamber")
    private String chamber;

    @JsonProperty("Type")
    private String type;

    public DateType getDate() {
        return date;
    }

    public void setDate(DateType date) {
        this.date = date;
    }

    public String getCommittee() {
        return committee;
    }

    public void setCommittee(String committee) {
        this.committee = committee;
    }

    public String getChamber() {
        return chamber;
    }

    public void setChamber(String chamber) {
        this.chamber = chamber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Action{" +
                "date=" + date +
                ", committee='" + committee + '\'' +
                ", chamber='" + chamber + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
