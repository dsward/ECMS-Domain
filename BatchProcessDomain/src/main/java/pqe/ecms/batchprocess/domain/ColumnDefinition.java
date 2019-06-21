package pqe.ecms.batchprocess.domain;

public class ColumnDefinition {
	private String name;
	private String searchField;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSearchField() {
		return searchField;
	}

	public void setSearchField(String searchField) {
		this.searchField = searchField;
	}

	@Override
	public String toString() {
		return "ColumnDefinition{" +
				"name='" + name + '\'' +
				", searchField='" + searchField + '\'' +
				'}';
	}
}
