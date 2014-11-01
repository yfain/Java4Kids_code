import java.util.Scanner;

/**
 * Created by NewProgrammer on 3/28/15.
 */
public class DoWhileDemo {
    public static void main(String[] args) {

        String playAgain = "no";

        Scanner usersConsole = new Scanner(System.in);

        do{
            System.out.print("Do you want to play again (yes/no)? ");
            playAgain = usersConsole.nextLine();

        } while ("yes".equals(playAgain));

        System.out.println("Thank you for playing!");
    }
}
