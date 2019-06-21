package pqe.ecms.titlemanagement.domain;

public class Product {
	private String moniker;
	private Integer productId;
	private String description;
	private String type;
	private String name;
	private String[] disciplines;
	private String[] vocabularies;

	public Product() {
	}

	public String getMoniker() {
		return moniker;
	}

	public void setMoniker(String moniker) {
		this.moniker = moniker;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String[] getDisciplines() {
		return disciplines;
	}

	public void setDisciplines(String[] disciplines) {
		this.disciplines = disciplines;
	}

	public String[] getVocabularies() {
		return vocabularies;
	}

	public void setVocabularies(String[] vocabularies) {
		this.vocabularies = vocabularies;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
