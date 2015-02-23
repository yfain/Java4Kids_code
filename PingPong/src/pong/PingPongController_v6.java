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

import java.util.Random;

// This version of the controller modifies the method moveTheBall to change not only the x-, but y-coordinate of the ball as well

public class PingPongController_v6 {

    final int PADDLE_MOVEMENT_INCREMENT = 6;
    final int BALL_MOVEMENT_INCREMENT = 5;

    double centerTableY;

    DoubleProperty currentKidPaddleY = new SimpleDoubleProperty();


    DoubleProperty ballCenterX = new SimpleDoubleProperty();
    DoubleProperty ballCenterY = new SimpleDoubleProperty();

    double allowedPaddleTopY;
    double allowedPaddleBottomY;

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

        ballCenterX.set(ball.getCenterX());
        ballCenterY.set(ball.getCenterY());

        ball.centerXProperty().bind(ballCenterX);
        ball.centerYProperty().bind(ballCenterY);


        allowedPaddleTopY = PADDLE_MOVEMENT_INCREMENT;
        allowedPaddleBottomY = table.getHeight() - kidPaddle.getHeight() - PADDLE_MOVEMENT_INCREMENT;

        centerTableY = table.getHeight()/2;
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

        ballCenterY.set(currentKidPaddleY.doubleValue() + kidPaddle.getHeight()/2);
        ballCenterX.set(kidPaddle.getLayoutX());

        moveTheBall();
    }

    private void moveTheBall(){

        Random randomYGenerator = new Random();
        double randomYincrement = randomYGenerator.nextInt(BALL_MOVEMENT_INCREMENT);

        final boolean isServingFromTop = (ballCenterY.get() <= centerTableY)?true:false;


        KeyFrame keyFrame = new KeyFrame(new Duration(10), event -> {

            if (ballCenterX.get() >= -20) {

                ballCenterX.set(ballCenterX.get() - BALL_MOVEMENT_INCREMENT);

                if (isServingFromTop) {
                    ballCenterY.set(ballCenterY.get() + randomYincrement);

                } else {
                    ballCenterY.set(ballCenterY.get() + randomYincrement);
                }

            } else {
                timeline.stop();

            }

        });

        timeline = new Timeline(keyFrame);
        timeline.setCycleCount(Timeline.INDEFINITE);

        timeline.play();

    }
}