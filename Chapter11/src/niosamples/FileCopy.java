package niosamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by NewProgrammer on 3/28/15.
 */
public class FileCopy {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println(
                    "Please provide source and destination file names, for example:");
            System.out.println("java FIleCopy abc.dat copyOfabc.dat");

            // Exit the program
            System.exit(0);
        }

        Path sourcePath = Paths.get(args[0]);
        Path destinationPath = Paths.get(args[1]);

        try {
            Files.copy(sourcePath, destinationPath);
            System.out.println("The file " + args[0] + " is copied to " + args[1]);

        } catch (IOException ioe) {
            System.out.println("Can't copy file: " + ioe.getMessage());
        }

    }
}