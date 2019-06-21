package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("Testimony")
public class Testimony extends OXMContent {

    private static final long serialVersionUID = 1L;

    @JsonProperty("DocumentIdentifier")
    private String documentIdentifier;

    @JsonProperty("Date")
    private DateType date;

    @JsonProperty("Header")
    private String header;

    @JsonProperty("Collation")
    private Collation collation;

    @JsonProperty("Abstract")
    private String abstractText;

    @JsonProperty("Participants")
    private List<Contributor> contributors;

    public String getDocumentIdentifier() {
        return documentIdentifier;
    }

    public void setDocumentIdentifier(String documentIdentifier) {
        this.documentIdentifier = documentIdentifier;
    }

    public DateType getDate() {
        return date;
    }

    public void setDate(DateType date) {
        this.date = date;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Collation getCollation() {
        return collation;
    }

    public void setCollation(Collation collation) {
        this.collation = collation;
    }

    public String getAbstractText() {
        return abstractText;
    }

    public void setAbstractText(String abstractText) {
        this.abstractText = abstractText;
    }

    public List<Contributor> getContributors() {
        return contributors;
    }

    public void setContributors(List<Contributor> contributors) {
        this.contributors = contributors;
    }

    public void addContributor(Contributor toAdd) {
        if (contributors == null) {
            contributors = new ArrayList<>();
        }
        contributors.add(toAdd);
    }

    @Override
    public String toString() {
        return "Testimony{" +
                "documentIdentifier='" + documentIdentifier + '\'' +
                ", date=" + date +
                ", header='" + header + '\'' +
                ", collation=" + collation +
                ", abstractText='" + abstractText + '\'' +
                ", contributors=" + contributors +
                '}';
    }
}
