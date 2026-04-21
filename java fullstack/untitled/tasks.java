import java.util.List;
class Employee{
    String name;
    String dept;
    int salary;
    int age;
    Employee(String name,String dept,int salary,int age){
        this.name=name;
        this.dept=dept;
        this.salary=salary;
        this.age=age;
    }
    public String getDept(){
        return dept;
    }
    public int getSal(){
        return salary;
    }
    @Override
    public String toString(){
        return name;
    }
}
public class tasks{
    public static void main(String[] args) {
        List<Employee> employees=List.of(new Employee("mugesh","dev", 123456, 20),new Employee("dinesh", "hr", 98765, 21),new Employee("chun li","support",123456,19));
        List<Employee> emp=employees.stream().filter((i)->i.getDept()=="dev").toList();
        System.out.println(emp.toString());
        List<Employee> emps=employees.stream().filter((i)->i.getSal()>30000).toList();
        System.out.println(emps.toString());
        //int total=employees.stream().
        //int avg=employees.stream().map((i)->i.getSal());
        //int countofemp=employees.stream().map(Item::get).count();
    }
}