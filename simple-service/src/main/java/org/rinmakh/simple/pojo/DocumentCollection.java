package org.rinmakh.simple.pojo;

import java.util.Collection;


public class DocumentCollection <T extends Collection> {

    private T doucments;

    public DocumentCollection(T doucments) {
        this.doucments = doucments;
    }

    public T getDoucments() {
        return doucments;
    }

    public void setDoucments(T doucments) {
        this.doucments = doucments;
    }
}
