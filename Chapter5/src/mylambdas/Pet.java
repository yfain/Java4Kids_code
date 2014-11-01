package mylambdas;

/**
 * Created by NewProgrammer on 3/28/15.
 */
public class Pet {


    // Arguments: rules for talking and pet's name
    // Return: What did the pet say
    public String speakup(Talkative talkRules, String name){
        return talkRules.talk(name);
    }

    static public String saySomething(Talkative talkRules, String name){
        return talkRules.talk(name);
    }

}
