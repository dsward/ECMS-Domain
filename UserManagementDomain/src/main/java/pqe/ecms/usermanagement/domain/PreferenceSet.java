package pqe.ecms.usermanagement.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.json.simple.JSONObject;

import java.io.Serializable;

@JsonRootName("preference_set")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PreferenceSet implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private int id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("preferences")
    private JSONObject preference;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JSONObject getPreference() {
        return preference;
    }

    public void setPreference(JSONObject preference) {
        this.preference = preference;
    }
}
