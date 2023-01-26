public class threadExample2 extends Thread{
    public static int amount=0;
    public static void main(String[] args){
   threadExample2 thread=new threadExample2();
   thread.start();
   System.out.println(amount);
   amount++;
   System.out.println(amount);
    }
    public void run(){
        amount++;
    }

}
