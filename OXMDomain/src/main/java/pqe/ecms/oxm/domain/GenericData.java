package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("GenericData")
public class GenericData {

    @JsonProperty("GenericData")
    private String genericData = "";

    @JsonProperty("GenericDataName")
    private String genericDataName = "";

    public String getGenericData() { return genericData;}

    public void setGenericData(String genericData) { this.genericData = genericData; }

    public String getGenericDataName() { return genericDataName;}

    public void setGenericDataName(String genericDataName) { this.genericDataName = genericDataName; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GenericData)) return false;
        GenericData that = (GenericData) o;
        return Objects.equals(getGenericData(), that.getGenericData()) &&
                Objects.equals(getGenericDataName(), that.getGenericDataName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGenericData(), getGenericDataName());
    }

}
