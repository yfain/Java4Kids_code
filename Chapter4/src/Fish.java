/**
 * Created by NewProgrammer on 3/28/15.
 */
public class Fish extends Pet {

    int currentDepth=0;

    public int dive(int howDeep){
        currentDepth=currentDepth + howDeep;
        if (currentDepth > 100){
            System.out.println("I'm just a little fish and "
                    + " I can't dive below 100 feet");
            currentDepth=currentDepth - howDeep;
        }else{
            System.out.println("Diving for " + howDeep +
                    " feet");
            System.out.println("I'm at " + currentDepth +
                    " feet below sea level");
        }
        return currentDepth;
    }

    public String say(String something){
        return "Hey, don't you know that fish don't talk?";
    }
}

