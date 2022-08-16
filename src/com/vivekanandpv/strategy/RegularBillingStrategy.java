package com.vivekanandpv.strategy;

public class RegularBillingStrategy implements BillingStrategy {
    @Override
    public double getBillingPrice(Server server, int minutes) {
        return server.getCpu() * 0.04 +
                server.getRam() * 0.02 +
                server.getStorage() * 0.015;
    }
}
