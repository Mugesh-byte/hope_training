public class Except{
    public static void main(String[] args){
        try{
            /*int a=3;
            int b=0;
            int c=a/b;*/
            String c=null;
            System.out.println(c.length());

        }
       
        catch(ArithmeticException e){
            System.out.println("Number is divided by zero");
        }
        catch(Exception e){
            System.out.println(e);
            
        }
        finally{
            System.out.println("Finally block is always is executed");
        }
    }
}