package signin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainWithBinding extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("signin_for_binding_sample.fxml"));

        primaryStage.setTitle("Sign In");

        Scene scene  = new Scene(root, 200, 170);
        scene.getStylesheets().add(getClass()
                .getResource("signin.css").toExternalForm());



        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
