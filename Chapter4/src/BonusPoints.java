/**
 * Created by NewProgrammer on 3/28/15.
 */
public class BonusPoints {

    public static void main(String[] args) {

        float totalSpent = getTotalAmount();

        int bonusPoints;

        if (totalSpent > 100){
            bonusPoints=Math.round(totalSpent*2);
        }
        else{
            bonusPoints=Math.round(totalSpent);
        }

        System.out.println("Today you've earned " + bonusPoints + " points!");
    }

    public static float getTotalAmount(){
        // This is a dummy code just to illustrate the use of
        // if statement in the main method
        return 125.90f;
    }

}
