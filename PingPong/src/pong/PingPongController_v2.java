package pong;

import javafx.application.Platform;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

// This version of the controller adds the the code to terminate the game to PingPongController_v1

public class PingPongController_v2 {

    public void keyReleasedHandler(KeyEvent event){

        KeyCode keyCode = event.getCode();

        switch (keyCode){
            case UP:
                process_key_Up();
                break;
            case DOWN:
                process_key_Down();
                break;
            case N:
                process_key_N();
                break;
            case Q:
                Platform.exit(); // Terminate the application
                break;
            case S:
                process_key_S();
                break;
        }
    }


    private void process_key_Up() {
        System.out.println("Processing the Up key");
    }

    private void process_key_Down() {
        System.out.println("Processing the Down key");
    }

    private void process_key_N() {
        System.out.println("Processing the N key");
    }

    private void process_key_S() {
        System.out.println("Processing the S key");
    }
}
