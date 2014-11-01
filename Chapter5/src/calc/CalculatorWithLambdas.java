package calc;

/**
 * Created by NewProgrammer on 3/28/15.
 */
public class CalculatorWithLambdas {

    // Declaring lambda expressions
    static ArithmeticOperation addition = (first, second) -> {
        double result = first + second;
        System.out.println("" + first + " + " +
                second + " = " + result );
        return result;
    };

    static ArithmeticOperation subtraction = (first, second) -> {
        double result = first - second;
        System.out.println("" + first + " - " +
                second + " = " + result );
        return result;
    };

    // This method performs a given arithmetic operation on the provided numbers
    // The first argument can be implemented as lambda expression
    public static double calculate(ArithmeticOperation whatToDo, double a, double b ){

        return whatToDo.performOperation(a,b);
    }

    public static void main(String[] args) {

        calculate(addition, 3.55, 50.00);
        calculate(subtraction, 3.55, 50.00);
    }
}
