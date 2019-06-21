package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("DataDate")
public class DataDate extends OXMContent {

	private static final long serialVersionUID = 1L;
	@JsonProperty("DataDateStart")
	private String dataDateStart;

	@JsonProperty("DataDateEnd")
	private String dataDateEnd;

	@JsonProperty("ProductYear")
	private String productYear;

	public String getDataDateStart() {
		return dataDateStart;
	}

	public void setDataDateStart(String DataDateStart) {
		dataDateStart = DataDateStart;
	}

	public String getDataDateEnd() {
		return dataDateEnd;
	}

	public void setDataDateEnd(String DataDateEnd) {
		dataDateEnd = DataDateEnd;
	}

	public String getProductYear() {
		return productYear;
	}

	public void setProductYear(String productYear) {
		this.productYear = productYear;
	}

	@Override
	public String toString() {
		return "DataDate{" +
				"DataDateStart='" + dataDateStart + '\'' +
				", DataDateEnd='" + dataDateEnd +
				", ProductYear='" + productYear +
				'}';
	}
}
