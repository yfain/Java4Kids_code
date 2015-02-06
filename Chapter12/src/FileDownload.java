import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class FileDownload{

    public static void main(String args[]){
        if (args.length!=2){
            System.out.println(
                    "Proper Usage: java FileDownload FileURL DestinationFileName");
            System.out.println(
                    "For example: java FileDownload http://myflex.org/yf/nyc.jpg nyc.jpg");
            System.exit(-1);
        }

        URLConnection fileStream=null;

        try{
            URL remoteFile=new URL(args[0]);
            fileStream=remoteFile.openConnection();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }

        Path path = Paths.get(args[1]);

        try(OutputStream fOut= Files.newOutputStream(path);


            InputStream in = fileStream.getInputStream();){

            System.out.println("Downloading from " + args[0] + ". Please wait...");

            // Read a remote file and save it in the local one

            int data;
            while((data=in.read())!=-1){
                fOut.write(data);
            }


            System.out.println("Finished downloading the file. It's located at "+path.toAbsolutePath());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}