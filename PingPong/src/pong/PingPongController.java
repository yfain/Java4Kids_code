package pong;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import javafx.util.Duration;

// This version of the controller modifies the method moveTheBall to use an event handler implemented as lambda

public class PingPongController {

    final int PADDLE_MOVEMENT_INCREMENT = 6;
    final int BALL_MOVEMENT_INCREMENT = 5;

    DoubleProperty currentKidPaddleY = new SimpleDoubleProperty();

    double allowedPaddleTopY;
    double allowedPaddleBottomY;
    double currentBallY;
    double currentBallX;

    Timeline timeline;

    @FXML
    Rectangle table;
    @FXML  Rectangle compPaddle;
    @FXML  Rectangle kidPaddle;
    @FXML  Circle ball;

    public void initialize()
    {

        currentKidPaddleY.set(kidPaddle.getLayoutY());
        kidPaddle.layoutYProperty().bind(currentKidPaddleY);


        allowedPaddleTopY = PADDLE_MOVEMENT_INCREMENT;
        allowedPaddleBottomY = table.getHeight() - kidPaddle.getHeight() - PADDLE_MOVEMENT_INCREMENT;

        ball.setCenterX(191.0);
        ball.setCenterY(123.0);

    }
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

        if (currentKidPaddleY.get() > allowedPaddleTopY) {
            currentKidPaddleY.set(currentKidPaddleY.get() - PADDLE_MOVEMENT_INCREMENT);
        }
    }

    private void process_key_Down() {

        if (currentKidPaddleY.get()< allowedPaddleBottomY) {
            currentKidPaddleY.set(currentKidPaddleY.get() + PADDLE_MOVEMENT_INCREMENT);
        }
    }

    private void process_key_N() {
        System.out.println("Processing the N key");
    }

    // This method serves the ball
    private void process_key_S() {

        currentBallY = (currentKidPaddleY.doubleValue() + kidPaddle.getHeight()/2);
        ball.setCenterY(currentBallY);

        currentBallX = kidPaddle.getLayoutX();
        ball.setCenterX(currentBallX);

        moveTheBall(currentBallX);

    }

    private void moveTheBall(double currentCenterX){


        KeyFrame keyFrame = new KeyFrame(new Duration(5), event -> {

            if (currentBallX > BALL_MOVEMENT_INCREMENT) {
                currentBallX -= BALL_MOVEMENT_INCREMENT;
            } else {
                timeline.stop();
            }

            ball.setCenterX(currentBallX);
        });

        timeline = new Timeline(keyFrame);
        timeline.setCycleCount(Timeline.INDEFINITE);

        timeline.play();

    }
}