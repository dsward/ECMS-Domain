package pqe.ecms.editorialdocument.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;


@JsonRootName(value = "Body")
public class Body {

    protected String schema; // The name of this document's schema, e.g. "globalschema"

    protected String version; // The version of this document's schema, e.g. "5"

    protected String contents; // contents of Body tag

    @JsonProperty("schema")
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("value")
    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "Body{" +
                "schema='" + schema + '\'' +
                ", version='" + version + '\'' +
                ", contents='" + contents + '\'' +
                '}';
    }
}
