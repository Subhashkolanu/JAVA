class NewThread extends Thread{
    NewThread(String threadname , ThreadGroup tgob){
        super(tgob,threadname);
        start();
    }
    public void run(){
    for(int i = 0 ; i < 1000; i++){
        try{
            Thread.sleep(10);
        }
        catch(InterruptedException ie){
            System.out.println("Exception encountered");
        }
     }
   }
}

public class ThreadGroupDemo{
    public static void main(String[] args) {
        ThreadGroup g
    }
}