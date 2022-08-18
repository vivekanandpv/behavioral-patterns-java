package com.vivekanandpv.interpreter;

public abstract class BinaryOperator implements Expression {
    private final Expression lvalue;
    private final Expression rvalue;

    protected BinaryOperator(Expression lvalue, Expression rvalue) {
        this.lvalue = lvalue;
        this.rvalue = rvalue;
    }

    @Override
    public void interpret(Context context) {
        lvalue.interpret(context);
        String leftEvaluation = context.getResult();

        rvalue.interpret(context);
        String rightEvaluation = context.getResult();

        evaluate(context, leftEvaluation, rightEvaluation);
    }

    protected abstract void evaluate(Context context, String leftValue, String rightValue);
}
