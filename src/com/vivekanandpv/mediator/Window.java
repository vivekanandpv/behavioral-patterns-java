package com.vivekanandpv.mediator;

public class Window extends AbstractWidgetDirector {
    @Override
    public void widgetChanged(AbstractWidget widget) {
        if (widget == button) {
            if (button.isClicked()) {
                textBox.setText(textBox.getText().toUpperCase());
            }
         }

        if (widget == textBox) {

        }
    }
}
