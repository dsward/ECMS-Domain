package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("DocumentGenericData")
public class DocumentGenericData {

    @JsonProperty("GenericDatas")
    private List<GenericData> genericDatas = new ArrayList<>();

    /**
     * @return the abstracts
     */
    public List<GenericData> getGenericDatas() {
        return genericDatas;
    }

    /**
     * @param genericDatas the abstracts to set
     */
    public void setGenericDatas(List<GenericData> genericDatas) {
        this.genericDatas = genericDatas;
    }

    public void addGenericData(GenericData toAdd) {
        if (genericDatas == null) {
            genericDatas = new ArrayList<>();
        }
        genericDatas.add(toAdd);
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("GenericData [GenericDatas=");
        builder.append(genericDatas);
        builder.append("]");
        return builder.toString();
    }

}
