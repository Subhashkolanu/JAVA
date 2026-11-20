import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FilenotfoundException;
import java.io.FileOutputStream;
public class IOdemo {
    public static void main(String[] args){
        try{
            FileOutputStream fos = new FileOutputStream("File1.txt");
            String msg = "Welcome to Java File Handling";
            byte b[] = msg.getBytes();
            fos.write(b);
            fos.close();
        }
        catch(FileNotFoundException fnfe){
            
        }
    }
}
