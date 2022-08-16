package com.vivekanandpv.iterator;

import java.util.Collection;

public class SequenceList<T> implements Sequence<T> {
    private final T[] elements;

    @SafeVarargs
    public SequenceList(T... elements) {
        this.elements = elements;
    }

    @Override
    public Iterator<T> getIterator() {
        return new ListIterator<>(this);
    }

    @Override
    public T get(int index) {
        return elements[index];
    }

    @Override
    public int size() {
        return elements.length;
    }
}
