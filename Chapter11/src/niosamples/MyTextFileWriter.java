package niosamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

public class MyTextFileWriter {

    public static void main(String[] args){

        System.out.println("The current directory is "+ System.getProperty("user.dir"));

        String myScore = "My game score is 28000 " + LocalDateTime.now() + "\n";

        Path path = Paths.get("data/scores.txt");

        try {

            if ( Files.exists(path)){
                Files.write(path, myScore.getBytes(), StandardOpenOption.APPEND);
            } else {
                Files.write(path, myScore.getBytes(), StandardOpenOption.CREATE);

            }

            System.out.println("The game score was saved at " + path.toAbsolutePath());
        } catch (IOException ioe) {
            System.out.println("Can't write file: " + ioe.getMessage());
        }

    }
}
