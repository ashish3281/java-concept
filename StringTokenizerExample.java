import java.util.StringTokenizer;  
public class StringTokenizerExample{  
 public static void main(String args[]){  
    String str="Hello ! how are you";
   StringTokenizer st = new StringTokenizer(str);  
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     } 
     StringTokenizer st1=new StringTokenizer(str,"!"); 
     while (st1.hasMoreTokens()) {  
        System.out.println(st1.nextToken());  
    } 
    StringTokenizer st2=new StringTokenizer(str,"!",true); 
    while (st2.hasMoreTokens()) {  
       System.out.println(st2.nextToken());  
   } 
   }  
}  