/* To run this file 
javac IOread.java
java IOread filename.format */


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class IOread {
    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream(args[0]);
            int ch;
            while((ch=fis.read())!=-1){
                System.out.println((char)ch);
            }
            fis.close();
        }
        catch(FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}

