package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IndexingTerm implements Serializable {

    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private String vocab; // Should this be here since its a helper for streaming
    private String value;
    private String source;
    private List<String> naic;
    private String expansion;
    private String status;
    private Boolean modifiable = true;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public List<String> getNaic() {
        return naic;
    }

    public void setNaic(List<String> naic) {
        this.naic = naic;
    }

    public void addNaic(String naic) {
        if (null == this.naic)
            this.naic = new ArrayList<>();
        this.naic.add(naic);
    }

    public String getExpansion() {
        return expansion;
    }

    public void setExpansion(String expansion) {
        this.expansion = expansion;
    }

    public String getVocab() {
        return vocab;
    }

    public void setVocab(String vocab) {
        this.vocab = vocab;
    }

    public Boolean getModifiable() {
        return modifiable;
    }

    public void setModifiable(Boolean modifiable) {
        this.modifiable = modifiable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IndexingTerm)) return false;
        IndexingTerm that = (IndexingTerm) o;
        return Objects.equals(getValue(), that.getValue()) &&
                Objects.equals(getExpansion(), that.getExpansion()) &&
                Objects.equals(getModifiable(), that.getModifiable());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getValue(), getExpansion(), getModifiable());
    }

    public static Builder newTerm() {
        return new Builder();
    }

    public static class Builder {
        private String vocab; // Should this be here since its a helper for streaming
        private String value;
        private String source;
        private List<String> naic;
        private String expansion;
        private String status;

        public Builder vocab(String vocab) {
            this.vocab = vocab;
            return this;
        }

        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public Builder source(String source) {
            this.source = source;
            return this;
        }

        public Builder naic(List<String> naic) {
            this.naic = naic;
            return this;
        }

        public Builder expansion(String expansion) {
            this.expansion = expansion;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public IndexingTerm build() {
            IndexingTerm result = new IndexingTerm();
            result.vocab = vocab;
            result.value = value;
            result.source = source;
            if (naic != null) {
                result.naic = naic;
            } else {
                result.naic = new ArrayList<>();
            }
            result.expansion = expansion;
            result.status = status;
            return result;
        }

    }
}
