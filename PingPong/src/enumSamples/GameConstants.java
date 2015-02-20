package enumSamples;

/**
 * Created by NewProgrammer on 3/28/15.
 */
public enum GameConstants {

    TABLE_WIDTH(320),TABLE_HEIGHT(220), KID_RACKET_Y_START(100),
    KID_RACKET_X_START(300),TABLE_TOP(12), TABLE_BOTTOM(180),RACKET_INCREMENT(4);

       private int value;

       private GameConstants(int value){
           this.value=value;
       };



}
