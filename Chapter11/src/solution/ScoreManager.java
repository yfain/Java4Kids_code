package solution;

import serialization.GameState;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.*;

public class ScoreManager {

    public static void main(String[] args) {

        Path path = Paths.get("scores.ser");
        List<Score> scores;

        if (Files.exists(path)) {
            scores = loadScores(path);

        } else {
            scores = new ArrayList<>();
        }

        Random numberGenerator = new Random();

        scores.add(new Score("Mary", numberGenerator.nextInt(50000), LocalDateTime.now()));

        System.out.println("All scores:");
        scores.forEach(s -> System.out.println(s));

        saveScores(path, scores);

        System.out.println("Sorted scores (highest on top):");
        Comparator<Score> byScoreDescending =
                Collections.reverseOrder(Comparator.comparing(s -> s.score));

        scores.stream()
                .sorted(byScoreDescending)
                .forEach(s -> System.out.println(s));
    }

    // Serialize scores into a file
    private static void saveScores(Path path, List<Score> gameScores) {

        try (ObjectOutputStream whereToWrite = new ObjectOutputStream(
                Files.newOutputStream(path, StandardOpenOption.CREATE))){

            whereToWrite.writeObject(gameScores);

        } catch (IOException ioe) {
            System.out.println("Can't serialize scores: " + ioe.getMessage());
        }
    }

    // Deserialize the scores from a file
    private static List<Score> loadScores(Path path){

        List<Score> loadedScores= null;

        try (ObjectInputStream whereToReadFrom =
                     new ObjectInputStream(Files.newInputStream(path))){

            loadedScores= (List<Score>) whereToReadFrom.readObject();

        } catch (ClassNotFoundException cnfe) {
            System.out.println("Can't find the declaration of Score: " + cnfe.getMessage());
        }  catch (IOException ioe) {
            System.out.println("Can't deserialize file: " + ioe.getMessage());
        }

        return loadedScores;
    }
}
