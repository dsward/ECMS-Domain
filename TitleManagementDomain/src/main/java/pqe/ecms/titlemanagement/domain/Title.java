package pqe.ecms.titlemanagement.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Title {

    private String title;
    private String subTitle;

    private Integer cblId;
    private Integer pmid;
    private String catalogRoot;
    private String catalogNumber;

    private String edition;
    private String qualifier;
    private String partNumber;
    private String partName;

    private String issn;
    private String eissn;
    private String accessionNumber;
    private String sudoc;
    private String hardIsbns;
    private String softIsbns;
    private String otherIsbns;

    private String publisherName;
    private String publisherCountry;
    private String publicationFrequency;
    private String impaLegacyId;
    private List<String> publicationSubjects;

    private String keyAccountLevel;
    private Boolean amgAccount;
    private Boolean embargo;
    private String exercisingRights;
    private String reasonNotExercisingRights;

    private String sourceType;
    private String scholarly;
    private String language;
    private String mlnNumbers;
    private String asfaInputCentre;

    public Title() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Integer getCblId() {
        return cblId;
    }

    public void setCblId(Integer cblId) {
        this.cblId = cblId;
    }

    public Integer getPmid() {
        return pmid;
    }

    public void setPmid(Integer pmid) {
        this.pmid = pmid;
    }

    public String getCatalogRoot() {
        return catalogRoot;
    }

    public void setCatalogRoot(String catalogRoot) {
        this.catalogRoot = catalogRoot;
    }

    public String getCatalogNumber() {
        return catalogNumber;
    }

    public void setCatalogNumber(String catalogNumber) {
        this.catalogNumber = catalogNumber;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getQualifier() {
        return qualifier;
    }

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getEissn() {
        return eissn;
    }

    public void setEissn(String eissn) {
        this.eissn = eissn;
    }

    public String getAccessionNumber() {
        return accessionNumber;
    }

    public void setAccessionNumber(String accessionNumber) {
        this.accessionNumber = accessionNumber;
    }

    public String getSudoc() {
        return sudoc;
    }

    public void setSudoc(String sudoc) {
        this.sudoc = sudoc;
    }

    public String getHardIsbns() {
        return hardIsbns;
    }

    public void setHardIsbns(String hardIsbns) {
        this.hardIsbns = hardIsbns;
    }

    public String getSoftIsbns() {
        return softIsbns;
    }

    public void setSoftIsbns(String softIsbns) {
        this.softIsbns = softIsbns;
    }

    public String getOtherIsbns() {
        return otherIsbns;
    }

    public void setOtherIsbns(String otherIsbns) {
        this.otherIsbns = otherIsbns;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublisherCountry() {
        return publisherCountry;
    }

    public void setPublisherCountry(String publisherCountry) {
        this.publisherCountry = publisherCountry;
    }

    public String getPublicationFrequency() {
        return publicationFrequency;
    }

    public void setPublicationFrequency(String publicationFrequency) {
        this.publicationFrequency = publicationFrequency;
    }

    public List<String> getPublicationSubjects() {
        return publicationSubjects;
    }

    public void setPublicationSubjects(List<String> publicationSubjects) {
        this.publicationSubjects = publicationSubjects;
    }

    public String getKeyAccountLevel() {
        return keyAccountLevel;
    }

    public void setKeyAccountLevel(String keyAccountLevel) {
        this.keyAccountLevel = keyAccountLevel;
    }

    public Boolean getAmgAccount() {
        return amgAccount;
    }

    public void setAmgAccount(Boolean amgAccount) {
        this.amgAccount = amgAccount;
    }

    public Boolean getEmbargo() {
        return embargo;
    }

    public void setEmbargo(Boolean embargo) {
        this.embargo = embargo;
    }

    public String getExercisingRights() {
        return exercisingRights;
    }

    public void setExercisingRights(String exercisingRights) {
        this.exercisingRights = exercisingRights;
    }

    public String getReasonNotExercisingRights() {
        return reasonNotExercisingRights;
    }

    public void setReasonNotExercisingRights(String reasonNotExercisingRights) {
        this.reasonNotExercisingRights = reasonNotExercisingRights;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getScholarly() {
        return scholarly;
    }

    public void setScholarly(String scholarly) {
        this.scholarly = scholarly;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getMlnNumbers() {
        return mlnNumbers;
    }

    public void setMlnNumbers(String mlnNumbers) {
        this.mlnNumbers = mlnNumbers;
    }

    public String getAsfaInputCentre() {
        return asfaInputCentre;
    }

    public void setAsfaInputCentre(String asfaInputCentre) {
        this.asfaInputCentre = asfaInputCentre;
    }

    public String getImpaLegacyId() {
        return impaLegacyId;
    }

    public void setImpaLegacyId(String impaLegacyId) {
        this.impaLegacyId = impaLegacyId;
    }

    @Override
    public String toString() {
        return "Title{" +
                "title='" + title + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", cblId=" + cblId +
                ", pmid=" + pmid +
                ", catalogRoot='" + catalogRoot + '\'' +
                ", catalogNumber='" + catalogNumber + '\'' +
                ", edition='" + edition + '\'' +
                ", qualifier='" + qualifier + '\'' +
                ", partNumber='" + partNumber + '\'' +
                ", partName='" + partName + '\'' +
                ", issn='" + issn + '\'' +
                ", eissn='" + eissn + '\'' +
                ", accessionNumber='" + accessionNumber + '\'' +
                ", sudoc='" + sudoc + '\'' +
                ", hardIsbns='" + hardIsbns + '\'' +
                ", softIsbns='" + softIsbns + '\'' +
                ", otherIsbns='" + otherIsbns + '\'' +
                ", publisherName='" + publisherName + '\'' +
                ", publisherCountry='" + publisherCountry + '\'' +
                ", publicationFrequency='" + publicationFrequency + '\'' +
                ", impaLegacyId='" + impaLegacyId + '\'' +
                ", publicationSubjects=" + publicationSubjects +
                ", keyAccountLevel='" + keyAccountLevel + '\'' +
                ", amgAccount=" + amgAccount +
                ", embargo=" + embargo +
                ", exercisingRights='" + exercisingRights + '\'' +
                ", reasonNotExercisingRights='" + reasonNotExercisingRights + '\'' +
                ", sourceType='" + sourceType + '\'' +
                ", scholarly='" + scholarly + '\'' +
                ", language='" + language + '\'' +
                ", mlnNumbers='" + mlnNumbers + '\'' +
                ", asfaInputCentre='" + asfaInputCentre + '\'' +
                '}';
    }
}
