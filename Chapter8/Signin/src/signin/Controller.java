package signin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField id;

    @FXML
    private PasswordField pwd;

    public void signInClicked(ActionEvent evt){

        String userID = id.getText();
        String password = pwd.getText();

        if (!"Yakov".equals(userID)){
            id.setStyle("-fx-background-color: lightpink;");
        } else{
            id.setStyle("-fx-background-color: white;");
        }

        System.out.println("got id:" + userID + ", got password: " + password);

        System.out.println("Hello from signInClicked method in controller");
    }
}
