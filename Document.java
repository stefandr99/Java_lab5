package MyCatalog;

import javafx.util.Pair;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Document implements Serializable {
    String id;
    String name;
    String location;
    private Map<String, Object> tags = new HashMap<>(); // map care contine tagurile pe care le are un document


    public Document() {
    }

    public Document(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTag(String key, Object obj) { //adaugarea unui element in map ul cu taguri
        tags.put(key, obj);
    }
}
