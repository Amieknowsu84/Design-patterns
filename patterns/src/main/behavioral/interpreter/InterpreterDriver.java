package main.behavioral.interpreter;

// Client
public class InterpreterDriver {
    public static void main(String[] args) {
        // Build expression: 1 + 2 + 3
        Expression expression = new AddExpression(new AddExpression(new NumberExpression(1), new NumberExpression(2)), new NumberExpression(3));

        // Evaluate expression
        int result = expression.interpret();
        System.out.println("Result: " + result); // Output: 6
    }
}
