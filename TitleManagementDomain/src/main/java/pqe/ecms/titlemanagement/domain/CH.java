package pqe.ecms.titlemanagement.domain;

/**
 * Created by dsward on 5/5/2017.
 */
public class CH extends PublicationId {

	private String value;

	public CH(String value) {
		this.value = value;
	}

	public String value() {
		return value;
	}

	@Override
	public PublicationIdType type() {
		return PublicationIdType.CH;
	}
}
