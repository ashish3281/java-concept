//extends example
public class threadExample extends Thread {
    public static void main(String[] args){
        threadExample thread=new threadExample();
        thread.start();
        System.out.println("this code is outside of the thread");
    }
    public void run(){
        System.out.println("this code is running in a thread");
    }
}
