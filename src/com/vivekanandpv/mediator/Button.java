package com.vivekanandpv.mediator;

public class Button extends AbstractWidget {
    private boolean clicked;
    protected Button(AbstractWidgetDirector mediator) {
        super(mediator);
    }

    public void click() {
        clicked = true;
        this.getMediator().widgetChanged(this);
    }

    public boolean isClicked() {
        return clicked;
    }
}
