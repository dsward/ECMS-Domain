package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("DocumentPagination")
public class DocumentPagination extends OXMContent {

    private static final long serialVersionUID = 1L;
    @JsonProperty("StartPage")
    private String startpage;

    @JsonProperty("EndPage")
    private String endPage;

    @JsonProperty("Pagination")
    private String pagination;

    @JsonProperty("PageCount")
    private String pageCount;

    @JsonProperty("Collation")
    private Collation collation;

    public String getStartpage() {
        return startpage;
    }

    public void setStartpage(String startpage) {
        this.startpage = startpage;
    }

    public String getEndPage() { return this.endPage; }

    public void setEndPage(String endPage) { this.endPage = endPage; }

    public String getPagination() { return this.pagination; }

    public void setPagination(String pagination) { this.pagination = pagination; }

    public String getPageCount() {
        return pageCount;
    }

    public void setPageCount(String pageCount) {
        this.pageCount = pageCount;
    }

    public Collation getCollation() {
        return collation;
    }

    public void setCollation(Collation collation) {
        this.collation = collation;
    }

    @Override
    public String toString() {
        return "DocumentPagination{" +
                "startpage='" + startpage + '\'' +
                ", endPage='" + endPage + '\'' +
                ", pagination='" + pagination + '\'' +
                ", pageCount='" + pageCount + '\'' +
                ", collation=" + collation +
                '}';
    }
}
