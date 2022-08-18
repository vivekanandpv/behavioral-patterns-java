package com.vivekanandpv.interpreter;

public class EqualsOperator extends BinaryOperator {


    protected EqualsOperator(Expression lvalue, Expression rvalue) {
        super(lvalue, rvalue);
    }

    @Override
    protected void evaluate(Context context, String leftValue, String rightValue) {
        context.pushResult(leftValue.equals(rightValue) ? "true" : "false");
    }
}
