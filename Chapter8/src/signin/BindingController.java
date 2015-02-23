package signin;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class BindingController {

    @FXML
    private TextField id;

    @FXML
    private PasswordField pwd;

    @FXML private Label errMsg;

    SimpleStringProperty signinError = new SimpleStringProperty();


    @FXML public void initialize() {
        System.out.println("Controller's ready. Let's bind some components");

        errMsg.textProperty().bind(signinError);
    }

    public void signInClicked(ActionEvent evt){

        String userID = id.getText();
        String password = pwd.getText();
        if (!"Yakov".equals(userID)){
            id.setStyle("-fx-background-color: lightpink;");
            signinError.set("Wrong id:" + userID);

        } else{
            id.setStyle("-fx-background-color: white;");
            signinError.set("");
        }

        System.out.println("got id:" + userID + ", got password: " + password);

        System.out.println("Hello from signInClicked method in controller");
    }

}
