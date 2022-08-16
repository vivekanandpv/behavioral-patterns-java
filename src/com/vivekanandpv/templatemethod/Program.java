package com.vivekanandpv.templatemethod;

public class Program {
    public static void main(String[] args) {
        AbstractOrder[] orders = new AbstractOrder[] {
                new RegularOrder(),
                new PrimeOrder()
        };

        for(AbstractOrder order : orders) {
            order.process();
        }
    }
}
