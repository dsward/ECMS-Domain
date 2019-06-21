package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("Collation")
public class Collation {

    @JsonProperty("text")
    private String text;

    @JsonProperty("Maps")
    private Boolean maps;

    @JsonProperty("Illustrations")
    private Boolean illustrations;

    @JsonProperty("Tables")
    private Boolean tables;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getMaps() {
        return maps;
    }

    public void setMaps(Boolean maps) {
        this.maps = maps;
    }

    public Boolean getIllustrations() {
        return illustrations;
    }

    public void setIllustrations(Boolean illustrations) {
        this.illustrations = illustrations;
    }

    public Boolean getTables() {
        return tables;
    }

    public void setTables(Boolean tables) {
        this.tables = tables;
    }

    @Override
    public String toString() {
        return "Collation{" +
                "text='" + text + '\'' +
                ", maps=" + maps +
                ", illustrations=" + illustrations +
                ", tables=" + tables +
                '}';
    }
}
