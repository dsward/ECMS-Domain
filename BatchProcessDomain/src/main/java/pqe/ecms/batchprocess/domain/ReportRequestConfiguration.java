package pqe.ecms.batchprocess.domain;

import java.util.List;

public class ReportRequestConfiguration  {
	private List<ColumnDefinition> columnDefinitions;


	public List<ColumnDefinition> getColumnDefinitions() {
		return columnDefinitions;
	}

	public void setColumnDefinitions(List<ColumnDefinition> columnDefinitions) {
		this.columnDefinitions = columnDefinitions;
	}


}
