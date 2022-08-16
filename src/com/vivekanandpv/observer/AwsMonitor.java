package com.vivekanandpv.observer;

import java.util.ArrayList;
import java.util.List;

public class AwsMonitor<T> implements Subject<T> {
    private final List<Observer<T>> invocationList = new ArrayList<>();
    private T state;

    @Override
    public void notifyObservers() {
        for(Observer<T> observer: invocationList) {
            observer.update();
        }
    }

    @Override
    public T getState() {
        return state;
    }

    @Override
    public void setState(T state) {
        this.state = state;
        notifyObservers();
    }

    @Override
    public void add(Observer<T> observer) {
        invocationList.add(observer);
    }

    @Override
    public void remove(Observer<T> observer) {
        invocationList.remove(observer);
    }

    @Override
    public String toString() {
        return "AwsMonitor{" +
                "state=" + state +
                '}';
    }
}
