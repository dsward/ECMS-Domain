package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("OrganizationTerm")
public class OrganizationTerm {

    @JsonProperty("Name")
    private String name;

    @JsonProperty("NAIC")
    private List<String> naics;

    @JsonProperty("Indexed")
    private Boolean indexed;

    @JsonProperty("LimitedAppearance")
    private String limitedAppearance;

    @JsonProperty("Acronym")
    private Boolean acronym;

    @JsonProperty("TermId")
    private String termId;

    @JsonProperty("Abbreviation")
    private String abbreviation;

    @JsonProperty("Role")
    private String role;

    @JsonProperty("SubRole")
    private String subRole;

    @JsonProperty("TermStatus")
    private String termStatus;

    @JsonProperty("Type")
    private String termType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getNaics() {
        return naics;
    }

    public void setNaics(List<String> naics) {
        this.naics = naics;
    }

    public void addNaic(String toAdd) {
        if (naics == null) {
            naics = new ArrayList<>();
        }
        naics.add(toAdd);
    }

    public Boolean getIndexed() {
        return indexed;
    }

    public void setIndexed(Boolean indexed) {
        this.indexed = indexed;
    }

    public String getLimitedAppearance() {
        return limitedAppearance;
    }

    public void setLimitedAppearance(String limitedAppearance) {
        this.limitedAppearance = limitedAppearance;
    }

    public Boolean getAcronym() {
        return acronym;
    }

    public void setAcronym(Boolean acronym) {
        this.acronym = acronym;
    }

    public String getTermId() {
        return termId;
    }

    public void setTermId(String termId) {
        this.termId = termId;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSubRole() {
        return subRole;
    }

    public void setSubRole(String subRole) {
        this.subRole = subRole;
    }

    public String getTermStatus() {
        return termStatus;
    }

    public void setTermStatus(String termStatus) {
        this.termStatus = termStatus;
    }

    public String getTermType() {
        return termType;
    }

    public void setTermType(String termType) {
        this.termType = termType;
    }

    @Override
    public String toString() {
        return "OrganizationTerm{" +
                "name='" + name + '\'' +
                ", naics=" + naics +
                ", indexed=" + indexed +
                ", limitedAppearance=" + limitedAppearance +
                ", acronym=" + acronym +
                ", termId='" + termId + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", role='" + role + '\'' +
                ", subRole='" + subRole + '\'' +
                ", termStatus=" + termStatus +
                ", termType=" + termType +
                '}';
    }
}
