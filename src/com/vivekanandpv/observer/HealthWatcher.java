package com.vivekanandpv.observer;

public class HealthWatcher<T> implements Observer<T> {
    private final Subject<T> subject;

    public HealthWatcher(Subject<T> subject) {
        this.subject = subject;
        subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("Health Watcher Update: " + subject.getState());
    }
}
