class Calculator{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
}
public class Math{
    public static void main(String[] args){
        Calculator c=new Calculator();
        int d=c.add(1,6);
        System.out.println(d);
    }
    
}