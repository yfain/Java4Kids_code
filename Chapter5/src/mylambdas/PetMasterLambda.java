package mylambdas;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by NewProgrammer on 3/28/15.
 */
public class PetMasterLambda {
    public static void main(String[] args) {


        // dogs
        Pet myDog = new Pet();

        Talkative dogTalkRules = (name) -> {
            return  "I'm a dog. My name is " + name;
        };

        System.out.println(myDog.speakup(dogTalkRules, "Sammy"));

        // parrots
        Pet myParrot = new Pet();

        Talkative parrotTalkRules = (name) -> {
            return  "I'm a parrot. Don't call me " + name;
        };

        System.out.println(myDog.speakup(parrotTalkRules, "Charlie"));


        System.out.println(Pet.saySomething(dogTalkRules, "Mary"));


        }
}
