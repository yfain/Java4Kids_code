package enumSamples;

/**
 * Created by NewProgrammer on 3/28/15.
 */
public class GreetTheDay {

    public static void main(String[] args) {

        greet(Day.SATURDAY);
    }

    static void greet(Day day){
        switch (day) {
            case MONDAY:
                System.out.println("The week begins");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Hello Weekend!");
                break;
            default:
                System.out.println("Hello Midweek");
                break;
        }
    }
}
