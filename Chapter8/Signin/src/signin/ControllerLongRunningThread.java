package signin;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ControllerLongRunningThread {

    @FXML
    private TextField id;

    @FXML
    private PasswordField pwd;

    public void signInClicked(ActionEvent evt){

        String userID = id.getText();
        String password = pwd.getText();

        rightStartOfLongRunningProcess(userID);

        System.out.println("got id:" + userID + ", got password: " + password);

    }

    private void rightStartOfLongRunningProcess(String uID) {

    /*  Emulate a login process that runs 10 sec (10000 msec)
     as if the login server connects to remote busy servers
     This method creates a worker thread, which sleeps for 10 sec
     and then asks Platform.runLater() to perform the GUI update logic in app thread
     (compare user id with Yakov)
     The application thread continues communicating with the GUI all the time */

        Runnable loginTask = () -> {
            try {
              Thread.sleep(10000);  // Sleep for 10 sec in worker thread

              Platform.runLater(() -> {       // turn the control to app thread
                  System.out.println("sss");
                  if (!"Yakov".equals(uID)){
                      id.setStyle("-fx-background-color: lightpink;");
                  } else{
                      id.setStyle("-fx-background-color: white;");
                  }
              });


            } catch (InterruptedException interExp) {
                interExp.printStackTrace();
            }
        };

        Thread workerThread = new Thread(loginTask);
        workerThread.start();

    }

/*

    private void wrongStartOfLongRunningProcess(String uID) {

        // Emulate a login process that runs 10 sec (10000 msec)
        // as if the login server connects to remote busy servers
        // This method puts the current app thread to sleep to 10 sec
        // The GUI becomes frozen for 10 sec

        try {
            Thread.sleep(10000);  // Sleep for 10 sec
        } catch (InterruptedException interExp) {
            interExp.printStackTrace();
        }

        if (!"Yakov".equals(uID)){
            id.setStyle("-fx-background-color: lightpink;");
        } else{
            id.setStyle("-fx-background-color: white;");
        }
    }
*/

}
