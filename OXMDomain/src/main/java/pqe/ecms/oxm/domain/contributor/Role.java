package pqe.ecms.oxm.domain.contributor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("PersonalRole")
public class Role {

    @JsonProperty("text")
    private String text;

    @JsonProperty("Former")
    private Boolean former;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getFormer() {
        return former;
    }

    public void setFormer(Boolean former) {
        this.former = former;
    }

    @Override
    public String toString() {
        return "Role{" +
                "text='" + text + '\'' +
                ", former=" + former +
                '}';
    }
}
