package com.vivekanandpv.iterator;

public class ListIterator<T> implements Iterator<T> {
    private final Sequence<T> sequence;
    private int index = 0;

    public ListIterator(Sequence<T> sequence) {
        this.sequence = sequence;
    }


    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        ++index;
    }

    @Override
    public boolean isDone() {
        return index >= sequence.size();
    }

    @Override
    public T getCurrentItem() {
        return sequence.get(index);
    }
}
