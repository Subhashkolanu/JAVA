class GoodMorning extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
class Hello extends Thread{
    public void run(){
        while(true){
            System.out.println("Hello");
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}class Welcome extends Thread{
    public void run(){
        while(true){
            System.out.println("Welcome");
            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}

public class MultipleMethodsDemo{
    public static void main(String[] args) {
        GoodMorning gm = new GoodMorning();
        Hello h1 = new Hello();
        Welcome we = new Welcome();

        gm.start();
        h1.start();
        we.start();
    }
}