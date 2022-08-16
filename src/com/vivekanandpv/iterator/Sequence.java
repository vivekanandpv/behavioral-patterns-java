package com.vivekanandpv.iterator;

public interface Sequence<T> {
    Iterator<T> getIterator();
    T get(int index);
    int size();
}
