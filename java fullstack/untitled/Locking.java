class Locker{
    private boolean locke;
    private int id;
    private int pin;
    private String item;
    Locker(int id,int pin){
        this.id=id;
        this.pin=pin;
    }
    public void lock(){
        locke=true;
    }
    public boolean islocked(){
        return locke;
    }
    public void unlock(int epin){
        if(pin==epin){
            locke=false;
        }
        else{
            System.out.println("Invalid pin");
        }
    }
    public void store_item(String item,int ipin){
        if(pin==ipin){
            unlock(ipin);
            this.item=item;
            System.out.println("Stored item:"+item);
            lock();
        }
        else{
            System.out.println("Invalid pin");
        }
    }
    public void retrieve(int piin){
        if(pin==piin && item!=null){
            unlock(piin);
            System.out.println("Retrived item:"+item);
            lock();
        }
        else{
            System.out.println("Invalid pin");
        }

    }

}
class Locking{
    public static void main(String[] args){
        Locker l=new Locker(1,2006);
        l.unlock(4356);
        System.out.println(l.islocked());
        l.lock();
        System.out.println(l.islocked());

    }
}