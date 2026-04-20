import java.util.List;
import java.util.function.Consumer;
class Student{
    String name;
    Student(String name){
        this.name=name;
    }
}
public class Consumerex {
    public static void main(String[] args) {
        Consumer<String> printname=(s)->System.out.println(s);
        Consumer<Student> printString=(s)->System.out.println(s.name);
        printString.accept(new Student("mugesh"));
        List<String> names=List.of("asd","fgh","dgf");
        names.forEach(name->System.out.println(name));
        names.forEach(System.out::println);
    }
}



