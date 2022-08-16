package com.vivekanandpv.mediator;

public abstract class AbstractWidget {
    private final AbstractWidgetDirector mediator;

    protected AbstractWidget(AbstractWidgetDirector mediator) {
        this.mediator = mediator;
    }

    public final void changed() {
        mediator.widgetChanged(this);
    }

    protected AbstractWidgetDirector getMediator() {
        return mediator;
    }
}
