package iosamples;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by NewProgrammer on 3/28/15.
 */
public class MyBufferedByteReader {


    public static void main(String[] args) {

        try (FileInputStream myFile = new  FileInputStream("abc.dat");
             BufferedInputStream buff = new BufferedInputStream(myFile);){

            int byteValue;

            while ((byteValue = buff.read()) != -1) {

                System.out.print(byteValue + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
