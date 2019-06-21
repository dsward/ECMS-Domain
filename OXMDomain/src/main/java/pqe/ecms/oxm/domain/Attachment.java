package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.io.Serializable;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("Attachment")
public class Attachment implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("MimeType")
	private String mimeType;

	@JsonProperty("Resides")
	private String resides;

	@JsonProperty("ImageType")
	private String imageType;

	@JsonProperty("WordMapCoords")
	private String wordMapCoords;

	@JsonProperty("Color")
	private String color;

	@JsonProperty("IllustrationInfo")
	private String illustrationInfo;

	@JsonProperty("LayoutInfo")
	private String layoutInfo;

	@JsonProperty("Options")
	private String options;

	@JsonProperty("ImageHitHighlighting")
	private String imageHitHighlighting;

	@JsonProperty("Bytes")
	private String bytes;

	@JsonProperty("PDFType")
	private String pdfType;

	@JsonProperty("Misc")
	private String misc;

	@JsonProperty("Seconds")
	private String seconds;

	@JsonProperty("RepId")
	private String repId;

	@JsonProperty("ResourceId")
	private String resourceId;

	@JsonProperty("CitationCount")
	private String citationCount;

	@JsonProperty("Scanned")
	private String scanned;

	@JsonProperty("LegacyFormat")
	private String legacyFormat;

	@JsonProperty("CHImageHitHighlighting")
	private String chImageHitHighlighting;

	@JsonProperty("MediaKey")
	private String mediaKey;

	@JsonProperty("Link")
	private String link;

	@JsonProperty("Name")
	private String filename;

	@JsonProperty("RepresentationType")
	private String representationType;

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public String getResides() {
		return resides;
	}

	public void setResides(String resides) {
		this.resides = resides;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public String getWordMapCoords() {
		return wordMapCoords;
	}

	public void setWordMapCoords(String wordMapCoords) {
		this.wordMapCoords = wordMapCoords;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getIllustrationInfo() {
		return illustrationInfo;
	}

	public void setIllustrationInfo(String illustrationInfo) {
		this.illustrationInfo = illustrationInfo;
	}

	public String getLayoutInfo() {
		return layoutInfo;
	}

	public void setLayoutInfo(String layoutInfo) {
		this.layoutInfo = layoutInfo;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public String getImageHitHighlighting() {
		return imageHitHighlighting;
	}

	public void setImageHitHighlighting(String imageHitHighlighting) {
		this.imageHitHighlighting = imageHitHighlighting;
	}

	public String getBytes() {
		return bytes;
	}

	public void setBytes(String bytes) {
		this.bytes = bytes;
	}

	public String getPdfType() {
		return pdfType;
	}

	public void setPdfType(String pdfType) {
		this.pdfType = pdfType;
	}

	public String getMisc() {
		return misc;
	}

	public void setMisc(String misc) {
		this.misc = misc;
	}

	public String getSeconds() {
		return seconds;
	}

	public void setSeconds(String seconds) {
		this.seconds = seconds;
	}

	public String getRepId() {
		return repId;
	}

	public void setRepId(String repId) {
		this.repId = repId;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getCitationCount() {
		return citationCount;
	}

	public void setCitationCount(String citationCount) {
		this.citationCount = citationCount;
	}

	public String getScanned() {
		return scanned;
	}

	public void setScanned(String scanned) {
		this.scanned = scanned;
	}

	public String getLegacyFormat() {
		return legacyFormat;
	}

	public void setLegacyFormat(String legacyFormat) {
		this.legacyFormat = legacyFormat;
	}

	public String getChImageHitHighlighting() {
		return chImageHitHighlighting;
	}

	public void setChImageHitHighlighting(String chImageHitHighlighting) {
		this.chImageHitHighlighting = chImageHitHighlighting;
	}

	public String getMediaKey() {
		return mediaKey;
	}

	public void setMediaKey(String mediaKey) {
		this.mediaKey = mediaKey;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

    public String getRepresentationType() {
        return representationType;
    }

    public void setRepresentationType(String representationType) {
        this.representationType = representationType;
    }
}
