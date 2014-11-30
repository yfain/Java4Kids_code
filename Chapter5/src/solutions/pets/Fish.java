package solutions.pets;

import pets.Swimmable;

/**
 * Created by yfain11 on 8/13/14.
 */
public class Fish extends Pet implements Swimmable {

     Fish(String name) {
        super(name);
    }
    public void swim(int howFar){
        System.out.println("OK," + name + " will swim " + howFar + " feet");
    }
    public void dive(int howDeep){
        System.out.println("OK, " + name + " will dive " + howDeep + " feet");
    }
}
