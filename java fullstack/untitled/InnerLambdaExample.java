@FunctionalInterface
interface Math {
    int add(int a,int b);
}
interface Exercise{
    void sayHello();
}
class LambdaExample{
        public static void main(String[] args) {
            Math obj=(a,b)->a+b;
            /*Math a=new Math(){
                @Override
                public int add(int a,int b){
                    return a+b;
                }
            };*/
            Exercise ex=()->System.out.println("hello");
            ex.sayHello();
            //System.out.println(obj.add(100, 04));
    }
}
