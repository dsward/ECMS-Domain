package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("Identifiers")
public class Identifiers extends OXMContent {

	private static final long serialVersionUID = 1L;

	@JsonProperty("LegacyIDType")
	private String legacyIDType;

	@JsonProperty("LegacyID")
	private String legacyID;

	@JsonProperty("PubID")
	private String pubID;

	@JsonProperty("PubIDType")
	private String pubIDType;

	@JsonProperty("GroupID")
	private String groupID;

	@JsonProperty("DocumentId")
	private String documentId;

	@JsonProperty("SudocNos")
	private List<String> sudocNos;

	@JsonProperty("ReportNo")
	private String reportNo;

	@JsonProperty("CongPubNo")
	private String congPubNo;

	@JsonProperty("SerialNo")
	private String serialNo;

	@JsonProperty("Platform")
	private String platform;

	@JsonProperty("AccessionNos")
	private List<AccessionNo> accessionNos;

	@JsonProperty("StmtPurpose")
	private String stmtPurpose;

	@JsonProperty("CongressSession")
	private String congressSession;

	@JsonProperty("Collation")
	private String collation;

	@JsonProperty("PublicLaw")
	private String publicLaw;

	@JsonProperty("BillNumber")
	private String billNumber;

	@JsonProperty("SALNumber")
	private String salNumber;

	@JsonProperty("CongressSessions")
	private List<String> congressSessions;

	@JsonProperty("DissertationsNumber")
	private String dissertationsNumber;

	public String getLegacyIDType() {
		return legacyIDType;
	}

	public void setLegacyIDType(String legacyIDType) {
		this.legacyIDType = legacyIDType;
	}

	public String getLegacyID() {
		return legacyID;
	}

	public void setLegacyID(String legacyID) {
		this.legacyID = legacyID;
	}

	public String getPubID() {
		return pubID;
	}

	public void setPubID(String pubID) {
		this.pubID = pubID;
	}

	public String getPubIDType() {
		return pubIDType;
	}

	public void setPubIDType(String pubIDType) {
		this.pubIDType = pubIDType;
	}

	public String getGroupID() {
		return groupID;
	}

	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public List<String> getSudocNos() {
		return sudocNos;
	}

	public void setSudocNos(List<String> sudocNos) {
		this.sudocNos = sudocNos;
	}

	public void addSudocNo(String toAdd) {
		if (sudocNos == null) {
			sudocNos = new ArrayList<>();
		}
		sudocNos.add(toAdd);
	}

	public String getReportNo() {
		return reportNo;
	}

	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

	public String getCongPubNo() {
		return congPubNo;
	}

	public void setCongPubNo(String congPubNo) {
		this.congPubNo = congPubNo;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public List<AccessionNo> getAccessionNos() {
		return accessionNos;
	}

	public void setAccessionNos(List<AccessionNo> accessionNos) {
		this.accessionNos = accessionNos;
	}

	public void addAccessionNos(AccessionNo toAdd) {
		if (accessionNos == null) {
			accessionNos = new ArrayList<>();
		}
		accessionNos.add(toAdd);
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getStmtPurpose() {
		return stmtPurpose;
	}

	public void setStmtPurpose(String stmtPurpose) {
		this.stmtPurpose = stmtPurpose;
	}

	public String getCongressSession() {
		return congressSession;
	}

	public void setCongressSession(String congressSession) {
		this.congressSession = congressSession;
	}

	public String getCollation() {
		return collation;
	}

	public void setCollation(String collation) {
		this.collation = collation;
	}

	public String getPublicLaw() {
		return publicLaw;
	}

	public void setPublicLaw(String publicLaw) {
		this.publicLaw = publicLaw;
	}

	public String getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}

	public String getSalNumber() {
		return salNumber;
	}

	public void setSalNumber(String salNumber) {
		this.salNumber = salNumber;
	}

	public void addCongressSession(String toAdd) {
		if (congressSessions == null) {
			congressSessions = new ArrayList<>();
		}
		congressSessions.add(toAdd);
	}

	public List<String> getCongressSessions() {
		return congressSessions;
	}

	public void setCongressSessions(List<String> congressSessions) {
		this.congressSessions = congressSessions;
	}

    public String getDissertationsNumber() {
        return dissertationsNumber;
    }

    public void setDissertationsNumber(String dissertationsNumber) {
        this.dissertationsNumber = dissertationsNumber;
    }

    @Override
	public String toString() {
		return "Identifiers{" +
				"pubID='" + pubID + '\'' +
				", pubIDType='" + pubIDType + '\'' +
				", groupID='" + groupID + '\'' +
				", documentId='" + documentId + '\'' +
				", sudocNos=" + sudocNos +
				", reportNo='" + reportNo + '\'' +
				", congPubNo='" + congPubNo + '\'' +
				", serialNo='" + serialNo + '\'' +
				", platform='" + platform + '\'' +
				", accessionNos=" + accessionNos +
				", stmtPurpose='" + stmtPurpose + '\'' +
				", congressSession='" + congressSession + '\'' +
				", collation='" + collation + '\'' +
				", publicLaw='" + publicLaw + '\'' +
				", billNumber='" + billNumber + '\'' +
				", salNumber='" + salNumber + '\'' +
				", legacyID='" + legacyID + '\'' +
				", legacyIDType='" + legacyIDType + '\'' +
				", dissertationsNumber='" + dissertationsNumber + '\'' +
				'}';
	}

	//TODO: Eventually pull this from TitleIdType
	public enum Type {
		CBLID, PMID
	}
}