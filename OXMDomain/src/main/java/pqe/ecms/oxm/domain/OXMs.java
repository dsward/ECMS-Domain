package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import pqe.ecms.oxm.exception.InvalidOxmException;
import pqe.ecms.oxm.domain.bulktext.BulkText;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Rtabassi on 2/16/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OXMs {

    @JsonProperty("DocumentAttachments")
    private DocumentAttachments documentAttachments;

    @JsonProperty("DocumentControlStructure")
    private DocumentControlStructure documentControlStructure;

    @JsonProperty("IndexingTerms")
    private IndexingTerms indexingTerms;

    @JsonProperty("ControlData")
    private ControlData controlData;

    @JsonProperty("Identifiers")
    private Identifiers identifiers;

    @JsonProperty("DocumentAbstract")
    private DocumentAbstract documentAbstract;

    @JsonProperty("DocumentDoi")
    private DocumentDoi documentDoi;

    @JsonProperty("DocumentFlexTerms")
    private DocumentFlexTerms documentFlexTerms;

    @JsonProperty("DocumentFullText")
    private DocumentFullText documentFullText;

    @JsonProperty("DocumentLanguage")
    private DocumentLanguage documentLanguage;

    @JsonProperty("DocumentObjectType")
    private DocumentObjectType documentObjectType;

    @JsonProperty("DocumentPagination")
    private DocumentPagination documentPagination;

    @JsonProperty("DataDate")
    private DataDate dataDate;

    @JsonProperty("DocumentPublicationInfo")
    private DocumentPublicationInfo documentPublicationInfo;

    @JsonProperty("DocumentTitle")
    private DocumentTitle documentTitle;

    @JsonProperty("DocumentCopyright")
    private DocumentCopyright documentCopyright;

    @JsonProperty("DocumentParticipant")
    private DocumentParticipant documentParticipant;

    @JsonProperty("DocumentTestimonies")
    private DocumentTestimonies documentTestimonies;

    @JsonProperty("DocumentNoc")
    private DocumentNoc documentNoc;

    @JsonProperty("RelatedDocuments")
    private RelatedDocuments relatedDocuments;

    @JsonProperty("DocumentLinks")
    private DocumentLinks documentLinks;

    @JsonProperty("DocumentAsfa")
    private DocumentAsfa documentAsfa;

    @JsonProperty("MR3Title")
    private MR3Title mr3Title;

	@JsonProperty("DocumentObjectBundles")
	private DocumentObjectBundles documentObjectBundles;

	@JsonProperty("DocumentGenericData")
	private DocumentGenericData documentGenericData;

  	@JsonProperty("LiteratureTerms")
	private LiteratureTerms literatureTerms;

	public LiteratureTerms getLiteratureTerms() {
		return literatureTerms;
	}

	public void setLiteratureTerms(LiteratureTerms literatureTerms) {
		this.literatureTerms = literatureTerms;
	}

	@JsonProperty("BulkText")
    private BulkText bulkText;


	public DocumentGenericData getDocumentGenericData() {return documentGenericData;}

	public void setDocumentGenericData(DocumentGenericData documentGenericData){
	    this.documentGenericData = documentGenericData;
    }

    public DocumentLinks getDocumentLinks() {
        return documentLinks;
    }

    public void setDocumentLinks(DocumentLinks documentLinks) {
        this.documentLinks = documentLinks;
    }

    public DocumentAttachments getDocumentAttachments() {
        return documentAttachments;
    }

    public void setDocumentAttachments(DocumentAttachments documentAttachments) {
        this.documentAttachments = documentAttachments;
    }

    public DocumentControlStructure getDocumentControlStructure() {
        return documentControlStructure;
    }

    public void setDocumentControlStructure(DocumentControlStructure documentControlStructure) {
        this.documentControlStructure = documentControlStructure;
    }

    public IndexingTerms getIndexingTerms() {
        return indexingTerms;
    }

    public void setIndexingTerms(IndexingTerms indexingTerms) {
        this.indexingTerms = indexingTerms;
    }

    public ControlData getControlData() {
        return controlData;
    }

    public void setControlData(ControlData controlData) {
        this.controlData = controlData;
    }

    public Identifiers getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(Identifiers identifiers) {
        this.identifiers = identifiers;
    }

    public DocumentAbstract getDocumentAbstract() {
        return documentAbstract;
    }

    public void setDocumentAbstract(DocumentAbstract documentAbstract) {
        this.documentAbstract = documentAbstract;
    }

    public DocumentDoi getDocumentDoi() {
        return documentDoi;
    }

    public void setDocumentDoi(DocumentDoi documentDoi) {
        this.documentDoi = documentDoi;
    }

    public DocumentFlexTerms getDocumentFlexTerms() {
        return documentFlexTerms;
    }

    public void setDocumentFlexTerms(DocumentFlexTerms documentFlexTerms) {
        this.documentFlexTerms = documentFlexTerms;
    }

    public DocumentFullText getDocumentFullText() {
        return documentFullText;
    }

    public void setDocumentFullText(DocumentFullText documentFullText) {
        this.documentFullText = documentFullText;
    }

    public DocumentLanguage getDocumentLanguage() {
        return documentLanguage;
    }

    public void setDocumentLanguage(DocumentLanguage documentLanguage) {
        this.documentLanguage = documentLanguage;
    }

    public DocumentObjectType getDocumentObjectType() {
        return documentObjectType;
    }

    public void setDocumentObjectType(DocumentObjectType documentObjectType) {
        this.documentObjectType = documentObjectType;
    }

    public DocumentPagination getDocumentPagination() {
        return documentPagination;
    }

    public void setDocumentPagination(DocumentPagination documentPagination) {
        this.documentPagination = documentPagination;
    }

    public DataDate getDataDate() {
        return dataDate;
    }

    public void setDataDate(DataDate dataDate) {
        this.dataDate = dataDate;
    }

    public DocumentPublicationInfo getDocumentPublicationInfo() {
        return documentPublicationInfo;
    }

    public void setDocumentPublicationInfo(DocumentPublicationInfo documentPublicationInfo) {
        this.documentPublicationInfo = documentPublicationInfo;
    }

    public DocumentTitle getDocumentTitle() {
        return documentTitle;
    }

    public void setDocumentTitle(DocumentTitle documentTitle) {
        this.documentTitle = documentTitle;
    }

    public DocumentCopyright getDocumentCopyright() {
        return documentCopyright;
    }

    public void setDocumentCopyright(DocumentCopyright documentCopyright) {
        this.documentCopyright = documentCopyright;
    }

    public DocumentParticipant getDocumentParticipant() {
        return documentParticipant;
    }

    public void setDocumentParticipant(DocumentParticipant documentParticipant) {
        this.documentParticipant = documentParticipant;
    }

    public DocumentTestimonies getDocumentTestimonies() {
        return documentTestimonies;
    }

    public void setDocumentTestimonies(DocumentTestimonies documentTestimonies) {
        this.documentTestimonies = documentTestimonies;
    }

    public DocumentNoc getDocumentNoc() {
        return documentNoc;
    }

    public void setDocumentNoc(DocumentNoc documentNoc) {
        this.documentNoc = documentNoc;
    }

    public RelatedDocuments getRelatedDocuments() {
        return relatedDocuments;
    }

    public void setRelatedDocuments(RelatedDocuments relatedDocuments) {
        this.relatedDocuments = relatedDocuments;
    }

    public DocumentAsfa getDocumentAsfa() {
        return documentAsfa;
    }

    public void setDocumentAsfa(DocumentAsfa documentAsfa) {
        this.documentAsfa = documentAsfa;
    }

	public MR3Title getMr3Title() {
		return mr3Title;
	}

	public void setMr3Title(MR3Title mr3Title) {
		this.mr3Title = mr3Title;
	}

	public DocumentObjectBundles getDocumentObjectBundles() {
		return documentObjectBundles;
	}

	public void setDocumentObjectBundles(DocumentObjectBundles documentObjectBundles) {
		this.documentObjectBundles = documentObjectBundles;
	}

	public BulkText getBulkText() {
		return bulkText;
	}

	public void setBulkText(BulkText bulkText) {
		this.bulkText = bulkText;
	}

	/**
     * Adds the given oxm to the Oxms pojo
     *
     * @param con : The object to add to the pojo
     * @throws InvalidOxmException : if it is an unknown OXM type
     */
    public void addToOxms(Object con) throws InvalidOxmException {

        switch (con.getClass().getSimpleName()) {
            case "DocumentAttachments":
                setDocumentAttachments((DocumentAttachments) con);
                break;

            case "DocumentControlStructure":
                setDocumentControlStructure((DocumentControlStructure) con);
                break;

            case "IndexingTerms":
                setIndexingTerms((IndexingTerms) con);
                break;

            case "ControlData":
                setControlData((ControlData) con);
                break;

            case "Identifiers":
                setIdentifiers((Identifiers) con);
                break;

            case "DocumentAbstract":
                setDocumentAbstract((DocumentAbstract) con);
                break;

            case "DocumentDoi":
                setDocumentDoi((DocumentDoi) con);
                break;

            case "DocumentFlexTerms":
                setDocumentFlexTerms((DocumentFlexTerms) con);
                break;

            case "DocumentFullText":
                setDocumentFullText((DocumentFullText) con);
                break;

            case "DocumentLanguage":
                setDocumentLanguage((DocumentLanguage) con);
                break;

            case "DocumentObjectType":
                setDocumentObjectType((DocumentObjectType) con);
                break;

            case "DocumentPagination":
                setDocumentPagination((DocumentPagination) con);
                break;

            case "DataDate":
                setDataDate((DataDate) con);
                break;

            case "DocumentPublicationInfo":
                setDocumentPublicationInfo((DocumentPublicationInfo) con);
                break;

            case "DocumentTitle":
                setDocumentTitle((DocumentTitle) con);
                break;

            case "DocumentCopyright":
                setDocumentCopyright((DocumentCopyright) con);
                break;

            case "DocumentParticipant":
                setDocumentParticipant((DocumentParticipant) con);
                break;

            case "DocumentTestimonies":
                setDocumentTestimonies((DocumentTestimonies) con);
                break;

            case "DocumentNoc":
                setDocumentNoc((DocumentNoc) con);
                break;

            case "RelatedDocuments":
                setRelatedDocuments((RelatedDocuments) con);
                break;

            case "DocumentLinks":
                setDocumentLinks((DocumentLinks) con);
                break;

	        case "DocumentAsfa":
		        setDocumentAsfa((DocumentAsfa) con);
		        break;

	        case "MR3Title":
		        setMr3Title((MR3Title) con);
		        break;

			case "DocumentObjectBundles":
				setDocumentObjectBundles((DocumentObjectBundles) con);
				break;

            case "DocumentGenericData":
                setDocumentGenericData((DocumentGenericData) con);
                break;

			case "LiteratureTerms":
				setLiteratureTerms((LiteratureTerms) con);
				break;

			case "BulkText":
				setBulkText((BulkText) con);
				break;

	        default:
                throw new InvalidOxmException("Failed to get oxm from JSON");
        }
    }

    /**
     * @return Returns all the oxms as a list of objects
     */
    public List<Object> listOXMs() {
        return Arrays.asList(documentAttachments,
                documentControlStructure,
                indexingTerms,
                controlData,
                identifiers,
                documentAbstract,
                documentDoi,
                documentFlexTerms,
                documentFullText,
                documentLanguage,
                documentObjectType,
                documentPagination,
                dataDate,
                documentPublicationInfo,
                documentTitle,
                documentCopyright,
                documentParticipant,
                documentTestimonies,
                documentNoc,
                relatedDocuments,
                documentLinks,
                documentAsfa,
                mr3Title,
				documentObjectBundles,
                documentGenericData,
				literatureTerms,
				bulkText
        );
    }

    @Override
    public String toString() {
        return "OXMs{" +
                "documentAttachments=" + documentAttachments +
                ", documentControlStructure=" + documentControlStructure +
                ", indexingTerms=" + indexingTerms +
                ", controlData=" + controlData +
                ", identifiers=" + identifiers +
                ", documentAbstract=" + documentAbstract +
                ", documentDoi=" + documentDoi +
                ", documentFlexTerms=" + documentFlexTerms +
                ", documentFullText=" + documentFullText +
                ", documentLanguage=" + documentLanguage +
                ", documentObjectType=" + documentObjectType +
                ", documentPagination=" + documentPagination +
                ", dataDate=" + dataDate +
                ", documentPublicationInfo=" + documentPublicationInfo +
                ", documentTitle=" + documentTitle +
                ", documentCopyright=" + documentCopyright +
                ", documentParticipant=" + documentParticipant +
                ", documentTestimonies=" + documentTestimonies +
                ", documentNoc=" + documentNoc +
                ", relatedDocuments=" + relatedDocuments +
                ", documentLinks=" + documentLinks +
                ", documentAsfa" + documentAsfa +
                ", mr3Title" + mr3Title +
				", documentObjectBundles=" + documentObjectBundles +
                ", documentGenericData=" + documentGenericData +
				", literatureTerms=" + literatureTerms +
				", bulkText=" + bulkText +
                '}';
    }
}
