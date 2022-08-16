package com.vivekanandpv.command;

public class Invoker {
    private final Command command1;
    private final Command command2;

    public Invoker(Command command1, Command command2) {
        this.command1 = command1;
        this.command2 = command2;
    }

    public void invokeCommand1() {
        command1.execute();
    }

    public void invokeCommand2() {
        command2.execute();
    }
}
