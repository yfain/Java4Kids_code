package signin;

import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;


public class BasicController {

    public void signInClicked(ActionEvent evt){

        System.out.println("Hello from signInClicked method in controller");
     }

    public void signInMouseClicked(MouseEvent evt){

        System.out.println("Hello from signInMouseClicked method in controller");
    }
}
