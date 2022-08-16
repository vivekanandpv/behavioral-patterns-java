package com.vivekanandpv.command;

public class ApproveCommand implements Command {
    private final ActionHandler handler;

    public ApproveCommand(ActionHandler handler) {
        this.handler = handler;
    }

    @Override
    public void execute() {
        handler.approve();
    }
}
