package friends;

import java.util.Hashtable;

/**
 * Created by NewProgrammer on 3/28/15.
 */
public class HashTableBrokenDemo {
    public static void main(String[] args) {

        ContactDetail friend1 = new ContactDetail();
        friend1.fullName = "Jackie Allen";
        friend1.email = "jallen@gmail.com";
        friend1.facebookID = "jallen";
        friend1.phone="212-545-5545";

        Hashtable friends = new Hashtable();
        friends.put("Jackie", friend1);

        // this is a time bomb
        friends.put("Art", "Art Jones, ajones@gmail.com, ajones, 212-333-2121");

        // Cast from Object to ContactDetail
        String artsPhone = ((ContactDetail) friends.get("Art")).phone;

        System.out.println("Art's phone number is " + artsPhone);

    }
}
