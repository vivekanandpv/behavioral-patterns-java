package com.vivekanandpv.iterator;

public interface Iterator<T> {
    void first();
    void next();
    boolean isDone();
    T getCurrentItem();
}
