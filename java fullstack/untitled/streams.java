import java.util.List;
class Employee{
    String name;
    int salary;
    Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
    String getName(){
        return name;
    }
    int getSal(){
        return salary;
    }
    @Override
    public String toString(){
        return name;    
    }
}
class streams{
    public static void main(String[] args) {
        List<Integer> nums=List.of(2,3,4,9,5,6,6,7,8);
        List<Integer> multiply=nums.stream().map((i)->i*2).toList();
        List<Integer> even=nums.stream().filter((i)->i%2==0).toList();
        List<Employee> employees=List.of(new Employee("Mugesh", 23456),new Employee("mgyuhbhvh",123456));
        List<String> names=employees.stream().map((i)->i.getName()).toList();
        int total=even.stream().reduce(1,(a,b)->a+b);
        List<Employee> sal=employees.stream().filter((i)->i.getSal()>30000).toList();
        System.out.println(multiply);
        System.out.println(even);
        System.out.println(sal.toString());
        System.out.println(total);
    }
}