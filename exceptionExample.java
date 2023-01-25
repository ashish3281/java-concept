public class exceptionExample {
    public static void main(String args[]){
        try{
            int[] myNumber={1,2,3};
            System.out.println(myNumber[10]);
            
        }
        catch(Exception e){
            System.out.println("something went wrong");
        }
        finally{
            System.out.println("The try catch is finised");
        }
    }
}
