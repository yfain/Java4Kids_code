/**
 * Created by yfain11 on 4/17/14.
 */
public class PetMaster {

    public static void main(String[] args) {

        String petReaction;

        Pet myPet = new Pet();

        myPet.eat();
        petReaction = myPet.say("Tweet!! Tweet!!");
        System.out.println(petReaction);

        myPet.sleep();

    }
}
