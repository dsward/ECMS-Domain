package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RelatedDocuments extends HashMap<String, List<RelatedDocument>> {

    @JsonIgnore
    private static final long serialVersionUID = 1L;

    public void addToList(String key, RelatedDocument document) {
        putIfAbsent(key, new ArrayList<>());
        get(key).add(document);
    }
}
