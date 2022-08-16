package com.vivekanandpv.memento;

public class Program {
    public static void main(String[] args) {
        DocumentOriginator document = new DocumentOriginator();
        DocumentCaretaker caretaker = new DocumentCaretaker();

        document.setTitle("Title 1");
        document.setBody("Body 1");
        caretaker.save(document);

        document.setTitle("Title 2");
        caretaker.save(document);

        document.setTitle("Title 3");
        caretaker.save(document);

        document.setTitle("Title 4");

        caretaker.undo(document);
        caretaker.undo(document);
        caretaker.undo(document);

        System.out.println(document);
    }
}
