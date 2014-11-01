package abstractclasses;

/**
 * Created by NewProgrammer on 3/28/15.
 */
public abstract class Animal {

    String animalClass;
    String name;

    public void setName(String name){
        this.name = name;
    }

    public void sleep(){
        System.out.println("The " + name + " is tired and goes to sleep.");
    }

    abstract public void talk();

}
