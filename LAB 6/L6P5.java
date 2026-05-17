class A extends Thread{
    public void run(){
        for ( int i = 1; i <= 5; i++){
            System.out.println("Thread A: " + i + " Priority: " + getPriority());
        }
    }
}
class B extends Thread{
    public void run(){
        for ( int i = 1; i <= 5; i++){
            System.out.println("Thread B: " + i + " Priority: " + getPriority());
        }
    }
}
class C extends Thread{
    public void run(){
        for ( int i = 1; i <= 5; i++){
            System.out.println("Thread C: " + i + " Priority: " + getPriority());
        }
    }
}
public class L6P5 {
    public static void main(String[] args){
        A t1 = new A();
        B t2 = new B();
        C t3 = new C();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
