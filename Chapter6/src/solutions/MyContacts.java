package solutions;

import java.util.ArrayList;

/**
 * Created by NewProgrammer on 3/28/15.
 */
public class MyContacts {

    public static void main(String[] args) {

        ArrayList<ContactDetail> friends = new ArrayList<>();

        ContactDetail friend1 = new ContactDetail();
        friend1.setFullName("Jackie Allen");
        friend1.setEmail("jallen@gmail.com");
        friend1.setFacebookID("jallen");
        friend1.setPhone("212-545-5545");

        ContactDetail friend2 = new ContactDetail();
        friend2.setFullName("Art Jones");
        friend2.setEmail("ajones@gmail.com");
        friend2.setFacebookID("ajones");
        friend2.setPhone("212-333-2121");

        friends.add(friend1);
        friends.add(friend2);

        friends.forEach(friend -> System.out.println(friend));

        /* an old way to loop through a collection
        for (ContactDetail friend: friends){
            System.out.println(friend);
        }*/


    }
}
