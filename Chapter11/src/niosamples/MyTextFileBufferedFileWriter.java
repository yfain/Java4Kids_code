package niosamples;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

public class MyTextFileBufferedFileWriter {

    public static void main(String[] args) {

        String myScore = "My game score is 28000 " + LocalDateTime.now() + "\n";

        Path path = Paths.get("data/scores.txt");

        try (BufferedWriter writer = getBufferedWriter(path)) {

            writer.write(myScore);

            System.out.println("The game score was saved at " + path.toAbsolutePath());
        } catch (IOException ioe) {
            System.out.println("Can't write file: " + ioe.getMessage());
        }

    }

    // The factory of BufferedWriter objects
    private static BufferedWriter getBufferedWriter(Path path) throws IOException{

        if (Files.exists(path)) {
            return Files.newBufferedWriter(path, StandardOpenOption.APPEND);
        } else {
            return Files.newBufferedWriter(path, StandardOpenOption.CREATE);

        }
    }
}