package com.vivekanandpv.visitor;

public class PowerConsumptionVisitor implements EquipmentVisitor {
    private double totalPowerConsumption = 0.0;

    @Override
    public void visitComputer(Computer computer) {
        this.totalPowerConsumption += computer.getPowerConsumption();
    }

    @Override
    public void visitPrinter(Printer printer) {
        this.totalPowerConsumption += printer.getPowerConsumption();
    }

    @Override
    public void visitAirConditioner(AirConditioner airConditioner) {
        this.totalPowerConsumption += airConditioner.getPowerConsumption();
    }

    public double getTotalPowerConsumption() {
        return totalPowerConsumption;
    }
}
