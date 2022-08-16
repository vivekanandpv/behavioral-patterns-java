package com.vivekanandpv.memento;

public class DocumentOriginator {
    private String title;
    private String body;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public DocumentMemento save() {
        return new DocumentMemento(title, body);
    }

    public void undo(DocumentMemento memento) {
        setTitle(memento.getTitle());
        setBody(memento.getBody());
    }

    @Override
    public String toString() {
        return "DocumentOriginator{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
