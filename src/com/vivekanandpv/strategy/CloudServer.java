package com.vivekanandpv.strategy;

public class CloudServer implements Server {
    private int cpu;
    private int ram;
    private int storage;
    private BillingStrategy strategy;

    public CloudServer(int cpu, int ram, int storage, BillingStrategy strategy) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.strategy = strategy;
    }

    @Override
    public void setStrategy(BillingStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public int getCpu() {
        return cpu;
    }

    @Override
    public int getRam() {
        return ram;
    }

    @Override
    public int getStorage() {
        return storage;
    }

    @Override
    public double getPrice(int minutes) {
        return strategy.getBillingPrice(this, minutes);
    }
}
