public class DaemonThread extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon Thread executing");
        }
        else{
            System.out.println("User(normal) thread executing");
        }
    }

public static void main(String[] args){
    /*Creating  */
    DaemonThread t1 = new DaemonThread();
    DaemonThread t2 = new DaemonThread();

    t1.setDaemon(true);

    t1.start();
    t2.start();
    }
}
