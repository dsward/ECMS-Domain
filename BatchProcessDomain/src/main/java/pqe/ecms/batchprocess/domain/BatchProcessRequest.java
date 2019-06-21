package pqe.ecms.batchprocess.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import pqe.ecms.editorialsearch.domain.SearchRequest;

import java.util.Arrays;
import java.util.List;

public class BatchProcessRequest {
	public enum SetType {
		DOCSET,
		SEARCH
	}

	public enum RequestType {
		Report
	}

	private String reporter;
	private String reporterEmail;
	private SetType setType = SetType.DOCSET;
	private List<Long> docSet;
	private SearchRequest query;
	private RequestType requestType = RequestType.Report;
	private ReportRequestConfiguration batchRequestConfiguration;

	public SetType getSetType() {
		return setType;
	}

	public void setSetType(SetType setType) {
		this.setType = setType;
	}

	public RequestType getRequestType() {
		return requestType;
	}

	public void setRequestType(RequestType requestType) {
		this.requestType = requestType;
	}


	public ReportRequestConfiguration getBatchRequestConfiguration() {
		return batchRequestConfiguration;
	}

	public void setBatchRequestConfiguration(ReportRequestConfiguration batchRequestConfiguration) {
		this.batchRequestConfiguration = batchRequestConfiguration;
	}

	public List<Long> getDocSet() {
		return docSet;
	}

	public void setDocSet(List<Long> docSet) {
		this.docSet = docSet;
	}

	public SearchRequest getQuery() {
		return query;
	}

	public void setQuery(SearchRequest query) {
		this.query = query;
	}

	public String getReporter() {
		return reporter;
	}

	public void setReporter(String reporter) {
		this.reporter = reporter;
	}

	public String getReporterEmail() {
		return reporterEmail;
	}

	public void setReporterEmail(String reporterEmail) {
		this.reporterEmail = reporterEmail;
	}

	@Override
	public String toString() {
		return "BatchProcessRequest{" +
				"setType=" + setType +
				", docSet=" + docSet +
				", query='" + query + '\'' +
				", requestType=" + requestType +
				'}';
	}


	public static void main(String[] args) throws JsonProcessingException {
		BatchProcessRequest batchProcessRequest = new BatchProcessRequest();
		batchProcessRequest.setSetType(SetType.SEARCH);
		batchProcessRequest.setReporter("me");
		batchProcessRequest.setReporterEmail("rod.tabassi@proquest.com");
		batchProcessRequest.setRequestType(RequestType.Report);
		batchProcessRequest.setQuery(SearchRequest.newRequest().query("ti.any(true)").build());
		ReportRequestConfiguration reportRequestConfiguration = new ReportRequestConfiguration();
		ColumnDefinition columnDefinition = new ColumnDefinition();
		columnDefinition.setName("main_ti");
		columnDefinition.setSearchField("main_ti");
		reportRequestConfiguration.setColumnDefinitions(Arrays.asList(columnDefinition));
		batchProcessRequest.setBatchRequestConfiguration(reportRequestConfiguration);
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper.writeValueAsString(batchProcessRequest));

	}
}
