package serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by NewProgrammer on 3/28/15.
 */
public class GameStateManager {

    public static void main(String[] args) {

        // Create and populate the GameState object
        GameState gameState = new GameState("Mary", 45,28000,3);

        // The file for serialization/deserialization
        Path path = Paths.get("gamestate.ser");

        saveGameState(path, gameState);
        System.out.println("The GameStateObject is serialized");

        GameState deserializedGameState = loadGameState(path);
        System.out.println("Deserialized game state; " + deserializedGameState);

    }

     // Serialize the gameState into a file
    private static void saveGameState(Path path, GameState gameState) {

        try (ObjectOutputStream whereToWrite =
                     new ObjectOutputStream(Files.newOutputStream(path, StandardOpenOption.CREATE))){

            whereToWrite.writeObject(gameState);

        } catch (IOException ioe) {
               System.out.println("Can't serialize file: " + ioe.getMessage());
        }
    }

    // Deserialize the GameState from a file
    private static GameState loadGameState(Path path){

        GameState loadedGameState = null;

        try (ObjectInputStream whereToReadFrom =
                     new ObjectInputStream(Files.newInputStream(path))){

            loadedGameState= (GameState) whereToReadFrom.readObject();

        } catch (ClassNotFoundException cnfe) {
            System.out.println("Can't find the declaration of GameState: " + cnfe.getMessage());
        }  catch (IOException ioe) {
            System.out.println("Can't deserialize file: " + ioe.getMessage());
        }

        return loadedGameState;
    }

}
