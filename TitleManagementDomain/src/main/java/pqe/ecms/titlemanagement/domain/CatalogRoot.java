package pqe.ecms.titlemanagement.domain;

public class CatalogRoot extends PublicationId {

    private Integer value;

    public CatalogRoot(String value) {
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
        return PublicationIdType.CATALOG_ROOT;
    }
}
