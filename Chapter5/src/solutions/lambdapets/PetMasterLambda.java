package solutions.lambdapets;

/**
 * Created by NewProgrammer on 3/28/15.
 */
public class PetMasterLambda {
    public static void main(String[] args) {


        // dogs
        Talkative dogTalkRules = name -> {
            return  "I'm a dog. My name is " + name;
        };

        Pet myDog = new Pet(dogTalkRules, "Sammy");

        System.out.println(myDog.speakup());

        // parrots
        Talkative parrotTalkRules = name -> {
            return  "I'm a parrot. Don't call me " + name;
        };

        Pet myParrot = new Pet(parrotTalkRules, "Charlie");

        System.out.println(myParrot.speakup());

        }
}
