package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;
import java.util.List;

/**
 * Oxm for Abstracts
 *
 * @author rtabassi
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("DocumentAbstract")
public class DocumentAbstract extends OXMContent {

    private static final long serialVersionUID = 1L;

    @JsonProperty("Abstracts")
    private List<SingleAbstract> abstracts = new ArrayList<>();

    /**
     * @return the abstracts
     */
    public List<SingleAbstract> getAbstracts() {
        return abstracts;
    }

    /**
     * @param abstracts the abstracts to set
     */
    public void setAbstracts(List<SingleAbstract> abstracts) {
        this.abstracts = abstracts;
    }

    public void addAbstracts(SingleAbstract toAdd) {
        if (abstracts == null) {
            abstracts = new ArrayList<>();
        }
        abstracts.add(toAdd);
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("AbstractContent [abstracts=");
        builder.append(abstracts);
        builder.append("]");
        return builder.toString();
    }

}
