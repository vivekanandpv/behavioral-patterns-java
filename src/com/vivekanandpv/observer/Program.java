package com.vivekanandpv.observer;

public class Program {
    public static void main(String[] args) {
        Subject<String> subject = new AwsMonitor<>();

        Observer<String> priceWatcher = new PriceWatcher<>(subject);
        Observer<String> healthWatcher = new HealthWatcher<>(subject);

        subject.setState("AWS Event: 123456789");
        subject.setState("AWS Event: 887744114");
    }
}
