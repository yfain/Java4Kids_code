package pets;

/**
 * Created by yfain11 on 8/13/14.
 */
public class Dog implements Talkative, Swimmable {
    public void talk(){
        System.out.println("Bark! Bark-bark!");
    }

    public void swim(int howFar){
        System.out.println("Will swim about a half of this distance: " + howFar/2 + " feet");
    }
}
