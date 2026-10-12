interface Calling{
    void call();
}
interface Camera{
    void takePhoto();
}
interface Internet{
    void browseInternet();
}
interface Music{
    void playMusic();
}
class SmartPhone implements Calling,Camera,Internet,Music{
    public void call(){
        System.out.println("Calling...");
    }
    public void takePhoto(){
        System.out.println("Taking photos");
    }
    public void browseInternet(){
        System.out.println("Browsing the internet");
    }
    public void playMusic(){
        System.out.println("Playing Music");
    }
}
public class multipleInhInterfaces{
    void main(){
        SmartPhone mobile = new SmartPhone();
        mobile.call();
        mobile.takePhoto();
        mobile.browseInternet();
        mobile.playMusic();
    }
}
