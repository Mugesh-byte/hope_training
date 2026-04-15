import java.io.FileReader;
import java.io.IOException;
public class FileRead{
    public static void main(String[] args){
        try{
            FileReader reader=new FileReader("test.txt");
            int ch;
            while((ch=reader.read())!=-1){
                //ch=reader.read();
                System.out.print((char)ch);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}