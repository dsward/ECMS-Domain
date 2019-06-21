package pqe.ecms.titlemanagement.domain;

/**
 * Created by dsward on 5/5/2017.
 */
public class CBLID extends PublicationId {

	private Integer value;

	public CBLID(String value) {
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
		return PublicationIdType.CBLID;
	}
}
