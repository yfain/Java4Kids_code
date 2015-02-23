package signin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("signin.fxml"));

        // Manually setting controller
        //FXMLLoader loader = new FXMLLoader(getClass().getResource("signin.fxml"));
        //loader.setController();
        // Parent root = loader.load();

        primaryStage.setTitle("Sign In");

        Scene scene  = new Scene(root, 200, 150);
        scene.getStylesheets().add(getClass()
                .getResource("signin.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
