package com.vivekanandpv.interpreter;

public class LiteralExpression implements Expression {
    private String value;

    public LiteralExpression(String value) {
        this.value = value;
    }


    private String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void interpret(Context context) {
        context.pushResult(getValue());
    }
}
