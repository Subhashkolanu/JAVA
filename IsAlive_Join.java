// Write a JAVA program to demonstarte the use of isAlive() and join() methods

class MyClass implements Runnable{
    public void run(){
        Thread t = Thread.currentThread();
        System.out.println("Thread started : "+t.getName());
        try{
            t.sleep(4000);
        }
        catch(InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("Thread ended : "+t.getName());
    }   
}
public class IsAlive_Join{
    public static void main(String[] args) {
        Thread th1 = new Thread(new MyClass(), "th1");
        Thread th2 = new Thread(new MyClass(), "th2");
        Thread th3 = new Thread(new MyClass(), "th3");

        th1.start();
        System.out.println("Thread th1 is alive after calling start method = "+th1.isAlive());
    try{
        th1.join();
    }
    catch(InterruptedException ie){
        ie.printStackTrace();
    }
    th2.start();
    System.out.println("Thread th2 is alive after calling start method = "+th2.isAlive());
    try{
        th2.join();
    }
    catch(InterruptedException ie){
        ie.printStackTrace();
    }
    th3.start();
    System.out.println("Thread th3 is alive after calling start method = "+th3.isAlive());
    try{
        th2.join();
    }
    catch(InterruptedException ie){
        ie.printStackTrace();
    }
    System.out.println("All 3 Threads have finished execution and the isAlive() returns false for 3 threads");
    System.out.println("th1 is alive = "+th1.isAlive());
    System.out.println("th2 is alive = "+th2.isAlive());
    System.out.println("th3 is alive = "+th3.isAlive());

}
}