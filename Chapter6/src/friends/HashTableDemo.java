package friends;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Hashtable;

/**
 * Created by NewProgrammer on 3/28/15.
 */
public class HashTableDemo {
    public static void main(String[] args) {

        ContactDetail friend1 = new ContactDetail();
        friend1.fullName = "Jackie Allen";
        friend1.email = "jallen@gmail.com";
        friend1.facebookID = "jallen";
        friend1.phone="212-545-5545";

        ContactDetail friend2 = new ContactDetail();
        friend2.fullName = "Art Jones";
        friend2.email = "ajones@gmail.com";
        friend2.facebookID = "ajones";
        friend2.phone="212-333-2121";

/*        ContactDetail friend3 = new ContactDetail();
        friend3.fullName = "Art Smith";
        friend3.email = "asmith@gmail.com";
        friend3.facebookID = "asmith";
        friend3.phone="518-123-4040";*/


        Hashtable friends = new Hashtable();
        friends.put("Jackie", friend1);
        friends.put("Art", friend2);

  //      friends.put("Art", friend3);

        // Cast from Object to ContactDetail
        String artsPhone = ((ContactDetail) friends.get("Art")).phone;

        System.out.println("Art's phone number is " + artsPhone);

    }
}
