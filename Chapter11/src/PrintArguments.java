/**
 * Created by NewProgrammer on 3/28/15.
 */
public class PrintArguments {

    public static void main(String[] args) {

        // How many arguments we've got?
        int numberOfArgs = args.length;

        for (int i=0; i<numberOfArgs; i++){
            System.out.println("I've got " + args[i]);
        }
    }
}

