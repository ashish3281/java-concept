public class MethodExample1 {
    static void checkage(int age){
        if(age<18){
            System.out.println("Access denied");
        }
        else{
            System.out.println("access granted");
        }
    }
    public static void main(String args[]){
        checkage(20);
    }
}
