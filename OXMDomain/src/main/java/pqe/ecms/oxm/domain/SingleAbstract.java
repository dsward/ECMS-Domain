package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.io.Serializable;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("Abstract")
public class SingleAbstract implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("XMLOrder")
	private Integer xmlOrder;
	@JsonProperty("AbsText")
	private String absText;
	@JsonProperty("HiddenText")
	private String hiddenText;
	@JsonProperty("AbstractType")
	private String abstractType;
	@JsonProperty("Provider")
	private String provider;
	@JsonProperty("RawLang")
	private String rawLang;

	public Integer getXmlOrder() {
		return xmlOrder;
	}

	public void setXmlOrder(Integer xmlOrder) {
		this.xmlOrder = xmlOrder;
	}

	public String getHiddenText() {
		return hiddenText;
	}

	public void setHiddenText(String hiddenText) {
		this.hiddenText = hiddenText;
	}


	public String getAbsText() {
		return absText;
	}

	public void setAbsText(String absText) {
		this.absText = absText;
	}


	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getAbstractType() {
		return abstractType;
	}

	public void setAbstractType(String abstractType) {
		this.abstractType = abstractType;
	}

	public String getRawLang() {
		return rawLang;
	}

	public void setRawLang(String rawLang) {
		this.rawLang = rawLang;
	}

	@Override
	public String toString() {
		return "SingleAbstract{" +
				"xmlOrder=" + xmlOrder +
				", absText='" + absText + '\'' +
				", hiddenText='" + hiddenText + '\'' +
				", abstractType='" + abstractType + '\'' +
				", provider='" + provider + '\'' +
				", rawLang='" + rawLang + '\'' +
				'}';
	}
}
