package com.vivekanandpv.visitor;

public interface Equipment {
    String getName();
    double getPowerConsumption();
    void accept(EquipmentVisitor visitor);
}
