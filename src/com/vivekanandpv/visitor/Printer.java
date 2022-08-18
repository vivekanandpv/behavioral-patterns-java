package com.vivekanandpv.visitor;

public class Printer implements Equipment {
    private final String name;
    private final int powerConsumption;

    public Printer(String name, int powerConsumption) {
        this.name = name;
        this.powerConsumption = powerConsumption;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public void accept(EquipmentVisitor visitor) {
        visitor.visitPrinter(this);
    }
}
