//create a file
import java.io.File;
import java.io.IOException;
public class FileHandlingExample {
    public static void main(String[] args){
        try{
            File obj=new File("filename.txt");
            if(obj.createNewFile()){
                System.out.println("FILE CREATED:"+ obj.getName());
            }
            else{
                System.out.println("File lready exit");
            }
        }
        catch (IOException e){
            System.out.println("An erroroccured.");
            e.printStackTrace();
        }
    }
}
//if you want to create a file in special directory
//File obj=new File("C:\\Users\\MyName\\filename.txt");