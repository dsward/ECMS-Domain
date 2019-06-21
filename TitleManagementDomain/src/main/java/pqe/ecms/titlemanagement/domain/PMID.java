package pqe.ecms.titlemanagement.domain;

/**
 * Created by dsward on 5/5/2017.
 */
public class PMID extends PublicationId {

	private Integer value;

	public PMID(String value) {
		try {
			this.value = Integer.parseInt(value);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException(e);
		}
	}

	public String value() {
		return value.toString();
	}

	@Override
	public PublicationIdType type() {
		return PublicationIdType.PMID;
	}
}
