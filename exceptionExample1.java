public class exceptionExample1 {
    static void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("access denied");
        }
        else{
            System.out.println("Access granted");
        }
    }
    public static void main(String args[]){

        checkAge(15);
    }
}
