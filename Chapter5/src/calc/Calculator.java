package calc;

/**
 * Created by NewProgrammer on 3/28/15.
 */
public class Calculator {

    static double addTwoNumbers (double first, double second){
        double result = first + second;
        System.out.println("" + first + " + " +
                          second + " = " + result  );
        return result;
    }

    static double subtractTwoNumbers (double first, double second){
        double result = first - second;
        System.out.println("" + first + " - " +
                second + " = " + result  );
        return result;
    }

    public static void main(String[] args) {

        addTwoNumbers(3.55, 50.00);
        subtractTwoNumbers(3.55, 50.00);
    }
}

