class MyThread extends Thread{
    public void run(){
        for ( int i = 1; i <= 5; i++){
            System.out.println("Child Thread: " + i);
        }
    }
}
public class L6P4 {
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        try{
            t1.start();
            t1.join();
            System.out.println("Thread resumes after t1");
            t2.start();
            t2.join();
            System.out.println("Thread resumes after t2");
        }
        catch ( Exception e){
            System.out.println("Error: " + e);
        }
    }
}
