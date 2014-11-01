package calc;

/**
 * Created by NewProgrammer on 3/28/15.
 */
public class CalculatorWithAnonymousClasses {

    static ArithmeticOperation addition = new ArithmeticOperation() {
        public double performOperation(double first, double second) {
            double result = first + second;
            System.out.println("" + first + " * " +
                    second + " = " + result );
            return result;
        }
    };

    static ArithmeticOperation subtraction = new ArithmeticOperation() {
        public double performOperation(double first, double second) {
            double result = first - second;
            System.out.println("" + first + " - " +
                    second + " = " + result );
            return result;
        }
    };

    // This method performs a given arithmetic operation on the provided numbers
    // The first argument is an object that implements ArithmeticOperation
    public static double calculate(ArithmeticOperation whatToDo, double a, double b ){

        return whatToDo.performOperation(a,b);
    }

    public static void main(String[] args) {

        calculate(addition, 3.55, 50.00);
        calculate(subtraction, 3.55, 50.00);
    }
}
