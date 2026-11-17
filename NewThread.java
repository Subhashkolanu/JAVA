class NewThread extends Thread{
    NewThread(string threadname , threadGroup tgob){
        super(tgob,threadname);
        start();
    }
    public void run()
    for(int i = 0 ; i < 1000; i++){
        try{
            thread.sleep(10);
        }
        catch(){
            
        }
    }
}