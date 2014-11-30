package solutions.lambdapets;

/**
 * Created by NewProgrammer on 3/28/15.
 */
public class Pet {

    String name;
    Talkative myTalkingRules;

    Pet(Talkative talkRules, String name){
        this.name = name;
        myTalkingRules = talkRules;
    }

    public String speakup(){

        return myTalkingRules.talk(name);
    }
}
