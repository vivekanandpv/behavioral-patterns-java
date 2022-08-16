package com.vivekanandpv.command;

public class RejectCommand implements Command {
    private final ActionHandler handler;

    public RejectCommand(ActionHandler handler) {
        this.handler = handler;
    }


    @Override
    public void execute() {
        handler.reject();
    }
}
