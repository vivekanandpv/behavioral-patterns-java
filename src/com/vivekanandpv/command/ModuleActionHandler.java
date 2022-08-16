package com.vivekanandpv.command;

public class ModuleActionHandler implements ActionHandler {
    @Override
    public void approve() {
        System.out.println("Module Action: Approved");
    }

    @Override
    public void reject() {
        System.out.println("Module Action: Rejected");
    }
}
