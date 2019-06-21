package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("DocumentNoc")
public class DocumentNoc extends OXMContent {

    private static final long serialVersionUID = 1L;

    @JsonProperty("Noc")
    private String noc;

    public String getNoc() {
        return noc;
    }

    public void setNoc(String noc) {
        this.noc = noc;
    }

    @Override
    public String toString() {
        return "DocumentNoc{" +
                "noc='" + noc + '\'' +
                '}';
    }
}
