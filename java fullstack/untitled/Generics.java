import java.util.function.Predicate;
class Student{
    int mark;
    Student(int mark){
        this.mark=mark;
    }
}
class Generics{
    public static void main(String[] args) {
        Predicate<String> isEven=(n)->n.startsWith("a")||n.startsWith("A");
        Predicate<String> isodd=isEven.negate(); 
        Predicate<Student> isPass=(s)->s.mark>45;
        System.out.println(isEven.test("awertyui"));
        System.out.println(isPass.test(new Student(46)));

        //System.out.println(isOdd.test("dfghjhgfd"));
    }
}