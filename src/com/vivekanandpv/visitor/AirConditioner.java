package com.vivekanandpv.visitor;

public class AirConditioner implements Equipment {
    private final String name;
    private final double power;

    public AirConditioner(String name, double power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPowerConsumption() {
        return power;
    }

    @Override
    public void accept(EquipmentVisitor visitor) {
        visitor.visitAirConditioner(this);
    }
}
