/**
 * Created by NewProgrammer on 3/28/15.
 */
public class GradeInterpreter {

    public static void main(String[] args){

        interpetGrades('B');  // prints Good Job!

        interpetGrades('D');  // prints Try a lot harder!
    }

    static void interpetGrades(char gradeLetter){
        switch (gradeLetter){

            case 'A':
                System.out.println("Excellent Job!");
                break;
            case 'B':
                System.out.println("Good Job!");
                break;
            case 'C':
                System.out.println("Try harder!");
                break;
            case 'D':
                System.out.println("Try a lot harder!");
                break;
        }

        System.out.println("Done with interpreting grade " + gradeLetter);
    }
}
