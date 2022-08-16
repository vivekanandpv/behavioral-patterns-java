package com.vivekanandpv.memento;

public class DocumentMemento {
    private final String title;
    private final String body;

    public DocumentMemento(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
