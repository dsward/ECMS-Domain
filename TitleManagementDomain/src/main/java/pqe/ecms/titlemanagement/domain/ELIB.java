package pqe.ecms.titlemanagement.domain;


public class ELIB extends PublicationId {

    private String value;

    public ELIB(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public PublicationIdType type() {
        return PublicationIdType.ELIB;
    }
}