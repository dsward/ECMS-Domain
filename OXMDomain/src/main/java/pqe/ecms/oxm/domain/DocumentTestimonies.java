package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("DocumentTestimonies")
public class DocumentTestimonies extends OXMContent {

    private static final long serialVersionUID = 1L;

    @JsonProperty("Testimonies")
    private List<Testimony> testimonies;

    public List<Testimony> getTestimonies() {
        return testimonies;
    }

    public void setTestimonies(List<Testimony> testimonies) {
        this.testimonies = testimonies;
    }

    public void addTestimony(Testimony toAdd) {
        if (testimonies == null) {
            testimonies = new ArrayList<>();
        }
        testimonies.add(toAdd);
    }

    @Override
    public String toString() {
        return "DocumentTestimonies{" +
                "testimonies=" + testimonies +
                '}';
    }
}
