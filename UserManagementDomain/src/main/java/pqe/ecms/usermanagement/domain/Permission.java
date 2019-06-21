package pqe.ecms.usermanagement.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.json.simple.JSONObject;

import java.io.Serializable;

@JsonRootName("permission")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private int id;

    @JsonProperty("permissions")
    private JSONObject permissions;

    @JsonProperty("username")
    private String username;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public JSONObject getPermissions() {
        return permissions;
    }

    public void setPermissions(JSONObject permissions) {
        this.permissions = permissions;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
