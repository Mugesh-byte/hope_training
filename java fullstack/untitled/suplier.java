import java.util.function.Supplier;
import java.lang.Math;
class Student{
    String name;
    Student(String name){
        this.name=name;
    }
}
class suplier{
    public static void main(String[] args) {
        Supplier<Integer> s=()->(int)Math.random()*100;
        System.out.println(s.get());
    }
}