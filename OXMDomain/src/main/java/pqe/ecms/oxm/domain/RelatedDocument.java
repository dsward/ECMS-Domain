package pqe.ecms.oxm.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RelatedDocument extends HashMap<String, Object> implements Serializable {

    private static final long serialVersionUID = 1L;

    @SuppressWarnings("unchecked")
    public void addToList(String key, Object toAdd) {
        putIfAbsent(key, new ArrayList<>());
        List<Object> list = (List) get(key);
        list.add(toAdd);
    }
}
