/**
 * Created by NewProgrammer on 3/28/15.
 */
public class ReportCard {

    String studentName;

    /**
     The method convertGrades has one integer argument: a test score.
     The method returns a letter grade, A, B, C or D, depending on the score.
     */
    public char convertGrades( int testScore){

        char grade;

        if (testScore >= 90){
            grade = 'A';
        } else if (testScore >= 80 && testScore < 90){
            grade = 'B';
        }else if (testScore >= 70 && testScore < 80){
            grade = 'C';
        }else {
            grade = 'D';
        }

        return grade;

    }

    public static void main(String[] args){

        ReportCard rc = new ReportCard();

        char yourGrade = rc.convertGrades(88);
        System.out.println("Your first grade is " +
                yourGrade);

        yourGrade = rc.convertGrades(79);
        System.out.println("Your second grade is " +
                yourGrade);
    }
}

