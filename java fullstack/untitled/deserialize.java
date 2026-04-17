import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.lang.Exception;
class deserialize{
    public static void main(String[] args) throws Exception{
        FileInputStream fi=new FileInputStream("student.txt");
        ObjectInputStream ObjStream=new ObjectInputStream(fi);
        while(true){
            try{
                Student s=(Student)ObjStream.readObject();
                System.out.println(s.name+" "+s.mark);
            }
            catch(EOFException e){
                break;
            }
        }
        
        fi.close();
        ObjStream.close();
    }
}