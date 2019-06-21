package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("DocumentPublicationInfo")
public class DocumentPublicationInfo extends OXMContent {

    private static final long serialVersionUID = 1L;

    @JsonProperty("Volume")
    private String volume;

    @JsonProperty("Issue")
    private String issue;

    @JsonProperty("Supplement")
    private String supplement;

    @JsonProperty("PublicationType")
    private String publicationType;

    @JsonProperty("PrimaryIssuingAgencies")
    private List<String> primaryIssuingAgencies;

    @JsonProperty("SecondaryIssuingAgencies")
    private List<String> secondaryIssuingAgencies;

    @JsonProperty("Dates")
    private List<DateType> dates;

    @JsonProperty("ISBN")
    private List<String> isbn;

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getSupplement() {
        return supplement;
    }

    public void setSupplement(String supplement) {
        this.supplement = supplement;
    }

    public String getPublicationType() {
        return publicationType;
    }

    public void setPublicationType(String publicationType) {
        this.publicationType = publicationType;
    }

    public void addPrimaryIssuingAgency(String toAdd) {
        if (primaryIssuingAgencies == null) {
            primaryIssuingAgencies = new ArrayList<>();
        }
        primaryIssuingAgencies.add(toAdd);
    }


    public List<String> getPrimaryIssuingAgencies() {
        return primaryIssuingAgencies;
    }

    public void setPrimaryIssuingAgencies(List<String> primaryIssuingAgencies) {
        this.primaryIssuingAgencies = primaryIssuingAgencies;
    }

    public void addSecondaryIssuingAgency(String toAdd) {
        if (secondaryIssuingAgencies == null) {
            secondaryIssuingAgencies = new ArrayList<>();
        }
        secondaryIssuingAgencies.add(toAdd);
    }

    public List<String> getSecondaryIssuingAgencies() {
        return secondaryIssuingAgencies;
    }

    public void setSecondaryIssuingAgencies(List<String> secondaryIssuingAgencies) {
        this.secondaryIssuingAgencies = secondaryIssuingAgencies;
    }

    public List<DateType> getDates() {
        return dates;
    }

    public void setDates(List<DateType> dates) {
        this.dates = dates;
    }

    public void addDate(DateType toAdd) {
        if (dates == null) {
            dates = new ArrayList<>();
        }
        dates.add(toAdd);
    }

    public void addIsbn(String addIsbn) {
        if (isbn == null) {
            isbn = new ArrayList<>();
        }
        isbn.add(addIsbn);
    }

    public List<String> getIsbn() {
        return this.isbn;
    }

    public void setIsbn(List<String> isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "DocumentPublicationInfo{" +
                "volume='" + volume + '\'' +
                ", issue='" + issue + '\'' +
                ", supplement='" + supplement + '\'' +
                ", publicationType='" + publicationType + '\'' +
                ", primaryIssuingAgencies=" + primaryIssuingAgencies +
                ", secondaryIssuingAgencies=" + secondaryIssuingAgencies +
                ", dates=" + dates +
                ", isbn=" + isbn +
                '}';
    }
}
