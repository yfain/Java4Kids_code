package friends;

import java.util.Hashtable;

/**
 * Created by NewProgrammer on 3/28/15.
 */
public class HashTableGenericsDemo {
    public static void main(String[] args) {

        ContactDetail friend1 = new ContactDetail();
        friend1.fullName = "Jackie Allen";
        friend1.email = "jallen@gmail.com";
        friend1.facebookID = "jallen";
        friend1.phone="212-545-5545";

        Hashtable<String, ContactDetail> friends = new Hashtable<>();
        friends.put("Jackie", friend1);

        // compiler will complain about this line
       //friends.put("Art", "Art Jones, ajones@gmail.com, ajones, 212-333-2121");

        // Cast from Object to ContactDetail
        String jackiesPhone = friends.get("Jackie").phone;

        System.out.println("Jackie's phone number is " + jackiesPhone);

    }
}
