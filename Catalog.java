package MyCatalog;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class Catalog implements Serializable {
    private String name;
    private String path;
    private List<Document> documents = new ArrayList<>();

    public Catalog(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public void add(Document doc) {
        documents.add(doc);
    }

    public Document findById(String id) {        
        return documents.stream()
                .filter(d -> d.getId().equals(id)).findFirst().orElse(null);
    }

}
