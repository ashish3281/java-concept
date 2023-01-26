public class threadExample3 extends Thread{
    public static int amount=0;
    public static void main(String[] args){
   threadExample3 thread=new threadExample3();
   thread.start();
   while(thread.isAlive()){
    System.out.println("Waiting...");
   }
   System.out.println("Main:"+amount);
   amount++;
   System.out.println(amount);
    }
    public void run(){
        amount++;
    }

}
