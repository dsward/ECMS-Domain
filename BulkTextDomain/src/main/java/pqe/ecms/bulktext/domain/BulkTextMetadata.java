package pqe.ecms.bulktext.domain;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName("BulkTextMetadata")
public class BulkTextMetadata {
    private String rawLang;
    private String isoCode;
    private String source;
    private String sid;
    private String date;
    private String time;
    private Boolean htmlContent;
    private Boolean accessible;
    private String isPrimary;
    private Boolean primaryLanguage;
    private Long wordCount;

    private Long size;

    public String getRawLang() {
        return rawLang;
    }

    public void setRawLang(String rawLang) {
        this.rawLang = rawLang;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Boolean getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(Boolean htmlContent) {
        this.htmlContent = htmlContent;
    }

    public Boolean getAccessible() {
        return accessible;
    }

    public void setAccessible(Boolean accessible) {
        this.accessible = accessible;
    }

    public String getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(String isPrimary) {
        this.isPrimary = isPrimary;
    }

    public Boolean getPrimaryLanguage() {
        return primaryLanguage;
    }

    public void setPrimaryLanguage(Boolean primaryLanguage) {
        this.primaryLanguage = primaryLanguage;
    }

    public Long getWordCount() {
        return wordCount;
    }

    public void setWordCount(Long wordCount) {
        this.wordCount = wordCount;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public void populateFrom(BulkTextMetadata metadata) {
        if (metadata != null) {
            this.setRawLang(metadata.getRawLang());
            this.setIsoCode(metadata.getIsoCode());
            this.setSource(metadata.getSource());
            this.setSid(metadata.getSid());
            this.setDate(metadata.getDate());
            this.setTime(metadata.getTime());
            this.setHtmlContent(metadata.getHtmlContent());
            this.setAccessible(metadata.getAccessible());
            this.setIsPrimary(metadata.getIsPrimary());
            this.setPrimaryLanguage(metadata.getPrimaryLanguage());
            this.setWordCount(metadata.getWordCount());
            this.setSize(metadata.getSize());
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BulkTextMetadata)) return false;
        BulkTextMetadata that = (BulkTextMetadata) o;
        return Objects.equals(getRawLang(), that.getRawLang()) &&
                Objects.equals(getIsoCode(), that.getIsoCode()) &&
                Objects.equals(getSource(), that.getSource()) &&
                Objects.equals(getSid(), that.getSid()) &&
                Objects.equals(getDate(), that.getDate()) &&
                Objects.equals(getTime(), that.getTime()) &&
                Objects.equals(getHtmlContent(), that.getHtmlContent()) &&
                Objects.equals(getAccessible(), that.getAccessible()) &&
                Objects.equals(getIsPrimary(), that.getIsPrimary()) &&
                Objects.equals(getPrimaryLanguage(), that.getPrimaryLanguage()) &&
                Objects.equals(getWordCount(), that.getWordCount()) &&
                Objects.equals(getSize(), that.getSize());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRawLang(), getIsoCode(), getSource(), getSid(), getDate(), getTime(), getHtmlContent(), getAccessible(), getIsPrimary(), getPrimaryLanguage(), getWordCount(), getSize());
    }

    @Override
    public String toString() {
        return "BulkTextMetadata{" +
                "rawLang='" + rawLang + '\'' +
                ", isoCode='" + isoCode + '\'' +
                ", source='" + source + '\'' +
                ", sid='" + sid + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", htmlContent=" + htmlContent +
                ", accessible=" + accessible +
                ", isPrimary='" + isPrimary + '\'' +
                ", primaryLanguage=" + primaryLanguage +
                ", wordCount=" + wordCount +
                ", size=" + size +
                '}';
    }
}
