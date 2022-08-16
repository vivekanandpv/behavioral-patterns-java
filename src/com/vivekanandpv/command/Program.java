package com.vivekanandpv.command;

public class Program {
    public static void main(String[] args) {
        Command approveCommand = new ApproveCommand(new ModuleActionHandler());
        Command rejectCommand = new RejectCommand(new ModuleActionHandler());

        Invoker invoker = new Invoker(approveCommand, rejectCommand);

        invoker.invokeCommand1();
        invoker.invokeCommand2();
    }
}
