package com.vivekanandpv.templatemethod;

public class RegularOrder extends AbstractOrder {
    @Override
    public void confirmPayment() {
        System.out.println("Regular Order: Confirm payment");
    }

    @Override
    public void packItems() {
        System.out.println("Regular Order: Pack items");
    }

    @Override
    public void shipPackage() {
        System.out.println("Regular Order: Ship package");
    }
}
