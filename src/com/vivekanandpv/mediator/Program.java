package com.vivekanandpv.mediator;

public class Program {
    public static void main(String[] args) {
        AbstractWidgetDirector widgetDirector = new Window();
        widgetDirector.initialize();

        System.out.println(widgetDirector.getTextBox().getText());

        widgetDirector.getButton().click();

        System.out.println(widgetDirector.getTextBox().getText());
    }
}
