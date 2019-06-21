package pqe.ecms.titlemanagement.domain;

/**
 * Created by dsward on 5/5/2017.
 */
public abstract class PublicationId {

	public abstract String value();

	public abstract PublicationIdType type();

	public static PublicationId from(String idType, String idValue) {
		switch (idType.toUpperCase()) {
			case "GISSTAT":
			case "CATALOG_ROOT":
				return new CatalogRoot(idValue);

			case "MSTAR":
			case "CBLID":
				return new CBLID(idValue);

			case "PQ":
			case "PMID":
				return new PMID(idValue);

			case "CH":
			case "CHLEGACYID":
				return new CH(idValue);

			case "ELIB":
				return new ELIB(idValue);
		}

		return null;
	}

	public String toString() {
		return type().toString() + " " + value();
	}

	@Override
	public int hashCode() {
		return type().hashCode() + value().hashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == null) return false;
		if (other == this) return true;
		if (!(other instanceof PublicationId)) return false;

		PublicationId o = (PublicationId) other;

		return o.type().equals(type()) && o.value().equals(value());
	}
}
