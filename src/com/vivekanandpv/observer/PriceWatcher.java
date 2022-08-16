package com.vivekanandpv.observer;

public class PriceWatcher<T> implements Observer<T> {
    private final Subject<T> subject;

    public PriceWatcher(Subject<T> subject) {
        this.subject = subject;
        subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("Price Watcher Update: " + subject.getState());
    }
}
