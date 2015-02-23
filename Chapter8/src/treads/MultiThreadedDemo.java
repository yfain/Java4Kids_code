package treads;

/**
 * Created by NewProgrammer on 3/28/15.
 */
public class MultiThreadedDemo {
  public static void main(String[] args) {

     Thread myThread = new Thread(
            () ->{
              for (int i=0; i<5;i++){
                 System.out.println("The value of i in power of 4 is " + i*i*i*i*i);
              }
            }
     );

     myThread.start();

     for (int k=0; k<5;k++){
            System.out.println("*** The value of k is " + k + "!");
     }
  }
}
