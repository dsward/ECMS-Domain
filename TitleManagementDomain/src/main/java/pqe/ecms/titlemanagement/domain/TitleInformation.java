package pqe.ecms.titlemanagement.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dsward on 4/18/2017.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TitleInformation {
    private Title title = new Title();
    private Set<String> exclusions = new HashSet<>();
    private Set<String> products = new HashSet<>();
    private Set<String> disciplines = new HashSet<>();
    private Set<Vocab> vocabs = new HashSet<>();
    private Set<String> providers = new HashSet<>();
    private Set<String> sources = new HashSet<>();

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Set<String> getExclusions() {
        return exclusions;
    }

    public void setExclusions(Set<String> exclusions) {
        this.exclusions = exclusions;
    }

    public Set<String> getProducts() {
        return products;
    }

    public void setProducts(Set<String> products) {
        this.products = products;
    }

    public Set<Vocab> getVocabs() {
        return vocabs;
    }

    public void setVocabs(Set<Vocab> vocabs) {
        this.vocabs = vocabs;
    }

    public Set<String> getProviders() {
        return providers;
    }

    public void setProviders(Set<String> providers) {
        this.providers = providers;
    }

    public Set<String> getSources() {
        return sources;
    }

    public void setSources(Set<String> sources) {
        this.sources = sources;
    }

    public Set<String> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(Set<String> disciplines) {
        this.disciplines = disciplines;
    }

}
