/**
 * Created by yfain11 on 4/17/14.
 */
public class Fish extends Pet {

    int currentDepth=0;

    public int dive(int howDeep){

        currentDepth=currentDepth + howDeep;
        System.out.println("Diving for " + howDeep +
                " feet");
        System.out.println("I'm at " + currentDepth +
                " feet below sea level");

        return currentDepth;
    }
}
