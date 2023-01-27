//delete a file
import java.io.File;
public class FileHandlingExample4 {
    public static void main(String args[]){
        File obj=new File("filename.txt");
        if(obj.delete()){
            System.out.println("Deleted the file :"+obj.getName());
        }
        else{
            System.out.println("Failed to delete");
        }
    }
}
//you want to delete a folder
//File obj=new File("C:\\User\\myName\\Test");
