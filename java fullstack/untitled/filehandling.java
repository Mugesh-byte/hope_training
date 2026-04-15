import java.util.*;
import java.io.File;
import java.io.IOException;
public class filehandling{
    public static void main(String[] args) {
        try{
            File file=new File("test.txt");
            if(file.createNewFile()){
                System.out.println("file created "+file.getName());
            }
            else{
                System.out.println("cannot create file");
            }

            
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        //System.out.println("File created"); 
    }
}