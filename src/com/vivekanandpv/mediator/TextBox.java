package com.vivekanandpv.mediator;

public class TextBox extends AbstractWidget {
    private String text;

    protected TextBox(AbstractWidgetDirector mediator, String text) {
        super(mediator);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        this.getMediator().widgetChanged(this);
    }
}
