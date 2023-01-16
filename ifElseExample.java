public class ifElseExample {
    public static void main(String args[]){
        int time=22;
        if(time<10){
            System.out.println("good morning");

        }
        else if(time<18){
            System.out.println("good day");

        }
        else{
            System.out.println("good evening");
        }

        int time1=20;
        String result=(time1<18)?"good day":"good evening";
        System.out.println(result);
    }
}
