package com.vivekanandpv.strategy;

public interface BillingStrategy {
    double getBillingPrice(Server server, int minutes);
}
