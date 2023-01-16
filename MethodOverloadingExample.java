public class MethodOverloadingExample {
    static int addNumber(int a,int b){
        return a+b;
    }
    static double addNumber(double a,double b){
        return a+b;
    }
    public static void main(String args[]){
        int num1=addNumber(4,6);
        double num2=addNumber(4.2,5.6);
        System.out.println(num1);
        System.out.println(num2);
    }
}
