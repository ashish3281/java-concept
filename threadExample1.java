public class threadExample1 implements Runnable {
    public static void main(String[] args){
        threadExample1 obj=new threadExample1();
        Thread thread=new Thread(obj);
        thread.start();
        System.out.println("this code is outside of the thread");
    }
    public void run(){
        System.out.println("this code is running in a thread");
    }
}
