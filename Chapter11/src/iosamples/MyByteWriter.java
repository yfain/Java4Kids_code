package iosamples;

import java.io.FileOutputStream;
import java.io.IOException;

public class MyByteWriter {

    public static void main(String[] args) {

        // Some byte values represented by integer codes
        int someData[]= {56,230,123,43,11,37};

        try (FileOutputStream myFile = new FileOutputStream("xyz.dat")){

            int arrayLength = someData.length;

            for (int i = 0; i < arrayLength; i++){
                myFile.write(someData[i]);
            }
        } catch (IOException ioe) {
            System.out.println("Could not write into the file: " +
                    ioe.getMessage());
        }
    }
}