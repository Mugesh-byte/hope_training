import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Student implements Serializable{
    String name;
    int mark;
    Student(String name,int mark){
        this.name=name;
        this.mark=mark;
    }
}
class CustomObjectOutputStream extends ObjectOutputStream{
CustomObjectOutputStream(ObjectOutputStream objStream) throws IOException{
    super(objStream);
}
@Override
protected void writeStreamHeader(){

}
}
public class serialize{
    public static void main(String[] args) throws IOException{
        Student s=new Student("vgthn",56);
        FileOutputStream fo=new FileOutputStream("student.txt",true);
        ObjectOutputStream objstream=new ObjectOutputStream(fo);
        objstream.writeObject(s);
        fo.close();
        objstream.close();
    }
}

