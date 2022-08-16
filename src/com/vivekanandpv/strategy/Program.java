package com.vivekanandpv.strategy;

public class Program {
    public static void main(String[] args) {
        Server server = new CloudServer(4, 8, 200, new RegularBillingStrategy());

        double regularPrice = server.getPrice(120);

        server.setStrategy(new DiscountedBillingStrategy());

        double discountedPrice = server.getPrice(120);
    }
}
