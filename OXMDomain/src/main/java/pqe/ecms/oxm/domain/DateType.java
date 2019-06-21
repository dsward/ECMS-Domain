package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("Date")
public class DateType {

    @JsonProperty("text")
    private String text;

    @JsonProperty("RangeStart")
    private Integer rangeStart;

    @JsonProperty("RangeEnd")
    private Integer rangeEnd;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("StartDate")
    private Integer startDate;

    @JsonProperty("EndDate")
    private Integer endDate;

    @JsonProperty("NumericDate")
    private Integer numericDate;

    @JsonProperty("RawAlphaDate")
    private String rawAlphaDate;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getRangeStart() {
        return rangeStart;
    }

    public void setRangeStart(Integer rangeStart) {
        this.rangeStart = rangeStart;
    }

    public Integer getRangeEnd() {
        return rangeEnd;
    }

    public void setRangeEnd(Integer rangeEnd) {
        this.rangeEnd = rangeEnd;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getStartDate() {
        return startDate;
    }

    public void setStartDate(Integer startDate) {
        this.startDate = startDate;
    }

    public Integer getEndDate() {
        return endDate;
    }

    public void setEndDate(Integer endDate) {
        this.endDate = endDate;
    }

    public Integer getNumericDate() {
        return numericDate;
    }

    public void setNumericDate(Integer numericDate) {
        this.numericDate = numericDate;
    }

    public String getRawAlphaDate() {
        return rawAlphaDate;
    }

    public void setRawAlphaDate(String rawAlphaDate) {
        this.rawAlphaDate = rawAlphaDate;
    }

    @Override
    public String toString() {
        return "DateType{" +
                "text='" + text + '\'' +
                ", rangeStart=" + rangeStart +
                ", rangeEnd=" + rangeEnd +
                ", type='" + type + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", numericDate=" + numericDate +
                ", rawAlphaDate=" + rawAlphaDate +
                '}';
    }
}
