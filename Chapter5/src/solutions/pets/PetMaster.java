package solutions.pets;

/**
 * Created by NewProgrammer on 3/28/15.
 */
public class PetMaster {
    public static void main(String[] args) {

        Dog myDog = new Dog("Sammy");
        myDog.talk();
        myDog.swim(7);
        myDog.dive(2);

        Fish myFish = new Fish("Mary");
        myFish.swim(50);
        myFish.dive(20);

    }
}
