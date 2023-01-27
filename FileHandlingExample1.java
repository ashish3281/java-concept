//write to a file
import java.io.FileWriter;
import java.io.IOException;
public class FileHandlingExample1 {
    public static void main(String args[]){
        try{
            FileWriter obj=new FileWriter("filename.txt");
            obj.write("file in java might be tricky");
            obj.close();
            System.out.println("Successfully wrote to the file");
        }
        catch (IOException e){
          System.out.println("an error occured");
          e.printStackTrace();
        }
    }
}
