//Read a file
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileHandlingExample2 {
    public static void main(String args[]){
        try{
            File obj=new File("filename.txt");
            Scanner myreader=new Scanner(obj);
            while(myreader.hasNextLine()){
                String data=myreader.nextLine();
                System.out.println(data);
            }
            myreader.close();
        }
        catch(FileNotFoundException e){
            System.out.println("an error occurred.");
            e.printStackTrace();
        }
    }
}
