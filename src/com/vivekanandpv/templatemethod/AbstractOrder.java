package com.vivekanandpv.templatemethod;

public abstract class AbstractOrder {
    protected abstract void confirmPayment();
    protected abstract void packItems();
    protected abstract void shipPackage();
    protected void notifyCustomer() {
        System.out.println("Default notification to the customer");
    }

    public final void process() {
        confirmPayment();
        packItems();
        shipPackage();
        notifyCustomer();
    }
}
