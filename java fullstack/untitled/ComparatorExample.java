import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Students{
    int id;
    String name;
    int mark;
    Students(int id,String name,int mark){
        this.id=id;
        this.name=name;
        this.mark=mark;
    }
    @Override
    public String toString(){
        return id+"-"+name+"-"+mark;
    }
}
class ComparatorExample{
    public static void main(String[] args){
        List<Students> students=new ArrayList<>();
        students.add(new Students(6,"x",20));
        students.add(new Students(4,"y",45));
        students.add(new Students(1,"z",76));
        students.add(new Students(9,"m",80));
        students.add(new Students(5,"i",99));

        Comparator<Students> byId=new Comparator<Students>(){
            @Override
            public int compare(Students a,Students b){
                return a.id-b.id;
            }
        };
        Collections.sort(students,byId);
        System.out.println(students);
        
    }
}