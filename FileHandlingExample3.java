//Get file information
import java.io.File;
public class FileHandlingExample3 {
    public static void main(String args[]){
        File obj=new File("filename.txt");
        if(obj.exists()){
            System.out.println("file name : "+obj.getName());
            System.out.println("Absolute path : "+obj.getAbsolutePath());
            System.out.println("Writeable : "+obj.canWrite());
            System.out.println("Readable : "+obj.canRead());
            System.out.println("file size in bytes : "+obj.length());

        }
        else{
            System.out.println("file does not exit");
        }
    }
}
