import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class WebSiteReader {
    public static void main(String args[]){

        URL url = null;
        URLConnection urlConn = null;

        try
        {
            url  = new URL("http://www.google.com" );
            urlConn = url.openConnection();
        } catch( IOException e){
            System.out.println("Can't connect to the provided URL:" + e.toString() );
        }

        try( InputStreamReader inStream = new InputStreamReader(
                urlConn.getInputStream(), "UTF8");
             BufferedReader buff  = new BufferedReader(inStream);){

            String currentLine;

            // Read and print the code of the Google's home page
            while ((currentLine = buff.readLine())!= null ){

                    System.out.println(currentLine);
            }
        } catch(MalformedURLException ex){
            System.out.println ("Check the spelling of the URL" + ex.getMessage());
        }
        catch(IOException  ioe){
            System.out.println("Can't read from the Internet: "+
                    ioe.toString());
        }
    }
}