import java.lang.*;
public class Wrapper {
    public static int test(String s){
            return Integer.valueOf(s);
        }
    public static void main(String[] args){
        
        Integer b=Integer.valueOf(128);
        Integer c=Integer.parseInt("128");
        int a=b;
        System.out.println(b==c);
        System.out.println(b.equals(c));
    }
}
