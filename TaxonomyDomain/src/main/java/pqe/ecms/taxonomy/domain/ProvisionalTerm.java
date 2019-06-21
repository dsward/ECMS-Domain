package pqe.ecms.taxonomy.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import java.util.List;

/**
 * The definition of a provisional term.  Includes the term definition and the definition of why it was suggested.
 * Created by wmillman on 1/11/2017.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProvisionalTerm {
    // What the term is.
    private String term;
    private String vocab;
    private List<String> naics;

    // Information about why/when the term was suggested.
    private Long documentId;
    private Date suggestedDate;
    private String who;
    private String sourceText;
    private String publicationTitle;
    private String publicationDate;
    private String documentTitle;
    private String termSource;

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getVocab() {
        return vocab;
    }

    public void setVocab(String vocab) {
        this.vocab = vocab;
    }

    public List<String> getNaics() {
        return naics;
    }

    public void setNaics(List<String> naics) {
        this.naics = naics;
    }

    public Long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    public Date getSuggestedDate() {
        return suggestedDate;
    }

    public void setSuggestedDate(Date suggestedDate) {
        this.suggestedDate = suggestedDate;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public String getSourceText() {
        return sourceText;
    }

    public void setSourceText(String sourceText) {
        this.sourceText = sourceText;
    }

    public String getPublicationTitle() {
        return publicationTitle;
    }

    public void setPublicationTitle(String publicationTitle) {
        this.publicationTitle = publicationTitle;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getDocumentTitle() {
        return documentTitle;
    }

    public void setDocumentTitle(String documentTitle) {
        this.documentTitle = documentTitle;
    }

    public String getTermSource() {
        return termSource;
    }

    public void setTermSource(String termSource) {
        this.termSource = termSource;
    }

    @Override
    public String toString() {
        return "ProvisionalTerm{" +
                "term='" + term + '\'' +
                ", vocab='" + vocab + '\'' +
                ", naics=" + naics +
                ", documentId='" + documentId + '\'' +
                ", suggestedDate=" + suggestedDate +
                ", who='" + who + '\'' +
                ", sourceText='" + sourceText + '\'' +
                ", publicationTitle='" + publicationTitle + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                ", documentTitle='" + documentTitle + '\'' +
                ", termSource='" + termSource + '\'' +
                '}';
    }

}
