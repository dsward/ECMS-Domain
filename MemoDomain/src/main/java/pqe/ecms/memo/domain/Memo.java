package pqe.ecms.memo.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Memo {

    private Long id;
    private Long documentId;
    private String text;
    private String username;
    private Date createdDate;
    private Date updatedDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Memo memo = (Memo) o;
        return Objects.equals(getId(), memo.getId()) &&
                Objects.equals(getDocumentId(), memo.getDocumentId()) &&
                Objects.equals(getText(), memo.getText()) &&
                Objects.equals(getUsername(), memo.getUsername()) &&
                Objects.equals(getCreatedDate(), memo.getCreatedDate()) &&
                Objects.equals(getUpdatedDate(), memo.getUpdatedDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDocumentId(), getText(), getUsername(), getCreatedDate(), getUpdatedDate());
    }

    @Override
    public String toString() {
        return "Memo{" +
                "id=" + id +
                ", documentId='" + documentId + '\'' +
                ", text='" + text + '\'' +
                ", username='" + username + '\'' +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
