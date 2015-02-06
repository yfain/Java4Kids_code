package niosamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyTextFileReader {

    public static void main(String[] args){

        Path path = Paths.get("abc.dat");

        System.out.println("The absolute path is " + path.toAbsolutePath());


        try {


            if ( Files.exists(path)){
                System.out.println("The file size is " + Files.size(path));
            }


            BufferedReader bufferedReader= Files.newBufferedReader(path, StandardCharsets.UTF_8);

            String currentLine;

            while ((currentLine = bufferedReader.readLine()) != null){

                System.out.println(currentLine);

            }
        } catch (IOException ioe) {
            System.out.println("Can't read file: " + ioe.getMessage());
        }


        System.out.println("Your default character encoding is " + Charset.defaultCharset());
    }
}
