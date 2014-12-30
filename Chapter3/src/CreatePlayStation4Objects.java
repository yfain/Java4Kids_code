/**
 * Created by NewProgrammer on 3/28/15.
 */
public class CreatePlayStation4Objects {

    public static void main(String[] args) {

        // create one instance of PlayStation4 class
        PlayStation4 firstPlayStation = new PlayStation4();
        firstPlayStation.hardDiskSize = "500GB";

        // call the method shareOnFacebook
        firstPlayStation.shareOnFacebook();

        PlayStation4 secondPlayStation = new PlayStation4();
        secondPlayStation.hardDiskSize = "1TB";

        // call the method shareOnTwitter
        secondPlayStation.shareOnTwitter();
    }
}
