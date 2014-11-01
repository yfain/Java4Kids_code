package vehicles;

/**
 * Created by NewProgrammer on 3/28/15.
 */
public class Car {

    // This private variable is visible only inside this class
    private String brakesCondition;

    // The public method brake() calls private methods
    // to decide which brakes to use
    public void brake(int pedalPressure){
        boolean useRegularBrakes;
        useRegularBrakes=
                checkForAntiLockBrakes (pedalPressure);

        if (useRegularBrakes==true){
            useRegularBrakes();
        }else{
            useAntiLockBrakes();
        }
    }

    // This private method can be called inside
    // this class only
    private boolean checkForAntiLockBrakes(int pressure){
        if (pressure > 100){
            return true;
        }else {
            return false;
        }
    }

    // This private method can be called inside this
    // class only
    private void useRegularBrakes(){
        // code that sends a signal to regular brakes
    }

    // This private method can be called inside this
    // class only
    private void useAntiLockBrakes(){
        // code that sends a signal to anti-lock brakes
    }
}
