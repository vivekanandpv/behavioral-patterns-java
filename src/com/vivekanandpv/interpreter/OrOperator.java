package com.vivekanandpv.interpreter;

public class OrOperator extends BinaryOperator {


    protected OrOperator(Expression lvalue, Expression rvalue) {
        super(lvalue, rvalue);
    }

    @Override
    protected void evaluate(Context context, String leftValue, String rightValue) {
        context.pushResult(leftValue.equals("true") || rightValue.equals("true") ? "true" : "false");
    }
}
