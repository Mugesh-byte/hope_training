public class CompileTimeException{
    public static void main(String[] args){
        Thread t=new Thread(()->{
            try{
                System.out.println("thread sleep");
                Thread.sleep(4000);
                System.out.println("thread awake");
            }
            catch(InterruptedException e){
                System.out.println("sleep exception");
            }
        });
        t.start();
        try{
            Thread.sleep(2000);
            System.out.println("main method thread");
        }catch(Exception e){
            System.out.println(e);
        }
        t.interrupt();


    }
}