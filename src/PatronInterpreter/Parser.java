package PatronInterpreter;

// Parser.java
import java.util.Stack;

public class Parser {
    private final Expression expression;

    public Parser(String expression) {
        this.expression = buildExpressionTree(expression);
    }

    public int evaluate() {
        return expression.interpret();
    }

    private Expression buildExpressionTree(String expression) {
        String[] tokens = expression.split(" ");

        Stack<Expression> stack = new Stack<>();
        for (String token : tokens) {
            if (isOperator(token)) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Expresión mal formada: no hay suficientes operandos para el operador " + token);
                }
                Expression right = stack.pop();
                Expression left = stack.pop();
                stack.push(createExpression(token, left, right));
            } else {
                stack.push(new NumberExpression(Integer.parseInt(token)));
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Expresión mal formada: hay operadores adicionales o faltan operandos");
        }

        return stack.pop();
    }

    private Expression createExpression(String operator, Expression left, Expression right) {
        switch (operator) {
            case "+":
                return new AddExpression(left, right);
            case "-":
                return new SubtractExpression(left, right);
            default:
                throw new IllegalArgumentException("Operador no soportado: " + operator);
        }
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-");
    }
}
