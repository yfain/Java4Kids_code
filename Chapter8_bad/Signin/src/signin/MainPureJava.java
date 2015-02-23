package signin;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainPureJava extends Application {

    public void start(Stage primaryStage) {

        final int TWO_COLUMN_SPAN = 2;

        Label userIdLbl = new Label("User ID:");
        TextField userIdTxt = new TextField();
        Label userPwdLbl = new Label("Password:");
        userPwdLbl.getStyleClass().add("bluelabel");
        PasswordField userPwdTxt = new PasswordField();

        GridPane root = new GridPane();
        root.setVgap(20);
        root.setPadding(new Insets(10));
        root.setAlignment(Pos.CENTER);
        root.setId("root");

        // Using static methods for setting node constraints
        GridPane.setConstraints(userIdLbl, 0, 0);
        GridPane.setConstraints(userIdTxt, 1, 0);
        GridPane.setConstraints(userPwdLbl, 0, 1);
        GridPane.setConstraints(userPwdTxt, 1, 1);

        root.getChildren().addAll(userIdLbl, userIdTxt, userPwdLbl, userPwdTxt);


        Button signInBtn = new Button ("Sign In");
        signInBtn.setId("submitBtn");  // used in CSS

        // Event handler with lambda expression
        signInBtn.setOnAction(evt -> {

            String userID = userIdTxt.getText();
            String password = userPwdTxt.getText();
            if (!"Yakov".equals(userID)){
                userIdTxt.setStyle("-fx-background-color: lightpink;");
            } else{
                userIdTxt.setStyle("-fx-background-color: white;");
            }

            System.out.println("Got id " + userID +
                               " and password " + password);
        });


        signInBtn.setPrefWidth(Double.MAX_VALUE); // Allow the button to be wider
        // using instance method for directly adding the node
        root.add(signInBtn,0,2,TWO_COLUMN_SPAN,1);


        Scene scene = new Scene(root,250,180);
        scene.getStylesheets().add(getClass().getResource("signin.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();



    }

    public static void main(String[] args) {
        launch(args);
    }
}
