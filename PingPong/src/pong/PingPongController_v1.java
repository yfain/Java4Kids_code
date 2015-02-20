package pong;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

// This version of the controller just prints the code of the pressed key on the console

public class PingPongController_v1 {

    public void keyReleasedHandler(KeyEvent event){

        KeyCode keyCode =  event.getCode();
        System.out.println("You pressed " + keyCode);
    }
}
