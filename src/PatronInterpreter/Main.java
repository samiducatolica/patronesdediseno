package PatronInterpreter;

public class Main {
    public static void main(String[] args) {
        String expression = "5 + 2 + 1 ";
        Parser parser = new Parser(expression);
        int result = parser.evaluate();
        System.out.println("Resultado de la expresión '" + expression + "': " + result);
    }
}