package com.vivekanandpv.visitor;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Equipment> equipments = List.of(
                new AirConditioner("Dual Zone AC", 2580),
                new Printer("Laser Printer", 2300),
                new Computer("Workstation", 1282.3)
        );

        PowerConsumptionVisitor consumptionVisitor = new PowerConsumptionVisitor();

        for(Equipment e: equipments) {
            e.accept(consumptionVisitor);
        }

        System.out.println(consumptionVisitor.getTotalPowerConsumption());
    }
}
