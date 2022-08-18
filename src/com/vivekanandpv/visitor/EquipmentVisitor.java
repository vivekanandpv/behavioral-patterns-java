package com.vivekanandpv.visitor;

public interface EquipmentVisitor {
    void visitComputer(Computer computer);
    void visitPrinter(Printer printer);
    void visitAirConditioner(AirConditioner airConditioner);
}
