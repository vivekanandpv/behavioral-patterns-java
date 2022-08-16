package com.vivekanandpv.memento;

import java.util.Deque;
import java.util.LinkedList;

public class DocumentCaretaker {
    private final Deque<DocumentMemento> history = new LinkedList<>();

    public void save(DocumentOriginator originator) {
        history.push(originator.save());
    }

    public void undo(DocumentOriginator originator) {
        if (!history.isEmpty()) {
            originator.undo(history.pop());
        }
    }
}
