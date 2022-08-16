package com.vivekanandpv.strategy;

public class DiscountedBillingStrategy implements BillingStrategy {
    @Override
    public double getBillingPrice(Server server, int minutes) {
        return server.getCpu() * 0.03 +
                server.getRam() * 0.018 +
                server.getStorage() * 0.01;
    }
}
