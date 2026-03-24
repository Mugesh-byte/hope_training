import java.lang.String;
class Students{
    int rollno;
    String name;
    int marks;

    
    Students(int rollno,String name,int marks){
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
    }
}  
public class contructor{
    public static void main(String[] args){
        Students s=new Students(138,"mugesh",98); 
        System.out.println(s.rollno);
    }
}