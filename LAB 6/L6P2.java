class MyRunnable implements Runnable{
    public void run(){
        for( int i = 1; i <= 5; i++){
           System.out.println("Runnable Thread: " + i); 
        }
    }
}
class MyThread extends Thread{
    public void run(){
        for( int i = 1; i <= 5; i++){
            System.out.println("Child Thread: " + i);
        }
    }
}
public class L6P2 {
    public static void main (String[] args){
        MyRunnable r1 = new MyRunnable();
        Thread t1 = new Thread(r1);
        t1.start();
        for( int i = 1; i <= 5; i++){
            System.out.println("T1 Thread: " + i);
        }
        MyThread t2 = new MyThread();
        t2.start();
         for( int i = 1; i <= 5; i++){
            System.out.println("T2 Thread: " + i);
        }
    }
}
