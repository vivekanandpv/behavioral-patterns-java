package com.vivekanandpv.mediator;

public abstract class AbstractWidgetDirector {
    protected Button button;
    protected TextBox textBox;

    public void initialize() {
        button = new Button(this);
        textBox = new TextBox(this, "Hello, World!");
    }
    public abstract void widgetChanged(AbstractWidget widget);

    public Button getButton() {
        return button;
    }

    public TextBox getTextBox() {
        return textBox;
    }
}
