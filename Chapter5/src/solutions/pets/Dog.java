package solutions.pets;

import pets.Swimmable;
import pets.Talkative;

/**
 * Created by yfain11 on 8/13/14.
 */
public class Dog extends Pet implements Talkative, Swimmable {

    Dog(String name) {
        super(name);
    }
    public void talk(){
        System.out.println( "My name is " + name + " Bark-bark-bark!");
    }

    public void swim(int howFar){
        System.out.println(name + " will swim about a half of this distance: " + howFar/2 + " feet");
    }
}
