import java.util.*;
class Method{
    public int mul(int n,int m){
        return n*m;
    }
    public int square(int n){
        return mul(n,n);
    }
}
class Pattern7{
    public static void main(String[] args){
        Method m1=new Method();
        int m=m1.square(4);
        System.out.println(m);
    }
}