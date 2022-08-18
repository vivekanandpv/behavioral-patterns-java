package com.vivekanandpv.interpreter;

public class Program {
    public static void main(String[] args) {
        Context context = new ContextImplementation();

        LiteralExpression inputExpression = new LiteralExpression("i");

        BinaryOperator equalsExpressionL = new EqualsOperator(inputExpression, new LiteralExpression("I"));

        BinaryOperator equalsExpressionR = new EqualsOperator(inputExpression, new LiteralExpression("i"));

        BinaryOperator orExpression = new OrOperator(equalsExpressionL, equalsExpressionR);

        orExpression.interpret(context);

        System.out.println("i == I or i == i --> " + context.getResult());

        inputExpression.setValue("x");

        orExpression.interpret(context);

        System.out.println("x == I or x == i --> " + context.getResult());
    }
}
