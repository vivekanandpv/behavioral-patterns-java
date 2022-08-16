package com.vivekanandpv.templatemethod;

public class PrimeOrder extends AbstractOrder {
    @Override
    public void confirmPayment() {
        System.out.println("Prime Order: Confirm order");
    }

    @Override
    public void packItems() {
        System.out.println("Prime Order: Pack items");
    }

    @Override
    public void shipPackage() {
        System.out.println("Prime Order: Ship package");
    }

    @Override
    public void notifyCustomer() {
        System.out.println("Prime Notification of the order");
    }
}
