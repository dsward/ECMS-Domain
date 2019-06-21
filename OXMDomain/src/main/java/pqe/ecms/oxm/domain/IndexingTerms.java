package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by wmillman on 10/17/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IndexingTerms extends HashMap<String, List<IndexingTerm>> {

    @JsonIgnore
    private static final long serialVersionUID = 1L;

    public void addIndexingTerm(String vocab, IndexingTerm term) {
        putIfAbsent(vocab, new ArrayList<>());
        get(vocab).add(term);
    }

}
