package com.vivekanandpv.strategy;

public interface Server {
    int getCpu();
    int getRam();
    int getStorage();
    double getPrice(int minutes);
    void setStrategy(BillingStrategy strategy);
}
