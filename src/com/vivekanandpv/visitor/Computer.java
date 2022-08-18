package com.vivekanandpv.visitor;

public class Computer implements Equipment {
    private final String name;
    private final double wattage;

    public Computer(String name, double wattage) {
        this.name = name;
        this.wattage = wattage;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPowerConsumption() {
        return wattage;
    }

    @Override
    public void accept(EquipmentVisitor visitor) {
        visitor.visitComputer(this);
    }
}
