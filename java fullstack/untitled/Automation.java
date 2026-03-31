
abstract class Device{
    
    abstract void on();
    abstract void off();
}

class Light extends Device{
    String name;
    
    Light(String name){
        this.name=name;
    }
    @Override
    public void on(){
        System.out.println(name+" is turned on");
    }
    @Override
    public void off(){
        System.out.println(name+" is turned off");
    }

}

class AC extends Device{
    String name;
    AC(String name){
        this.name=name;
    }
    @Override
    public void on(){
        System.out.println(name+" is turned on");
    }
    @Override
    public void off(){
        System.out.println(name+" is turned off");
    }

}

interface trigger{
    boolean istriggered();
}
class MotionTrigger implements trigger{
    boolean trig;
    MotionTrigger(boolean trig){
        this.trig=trig;
    }
    @Override
    public boolean istriggered(){
        return trig==true;
    }
}

class Temp implements trigger{
    int temp;
    Temp(int temp){
        this.temp=temp;
    }
    
    @Override
    public boolean istriggered(){
        if(temp>30){
            return true;
        }
        return false;
    }
    
}
class Time implements trigger{
    int time;
    Time(int time){
        this.time=time;
    }
    @Override
    public boolean istriggered(){
        if(time>7){
            return true;
        }
        return false;
    }
}


interface Action{
    void execute();
}
class Turnonaction implements Action{
    Device device;
    Turnonaction(Device device){
        this.device=device;
    }
    public void execute(){
        device.on();
    }
}

class Turnoffaction implements Action{
    Device device;
    Turnoffaction(Device device){
        this.device=device;
    }
    public void execute(){
        device.off();
    }
}

class Link{
    trigger t;
    Action a;
    Link(trigger t,Action a){
        this.t=t;
        this.a=a;
    }
    void result(){
        if(t.istriggered()){
            a.execute();
        }
        else{
            System.out.println("not triggered");
        }
    }
}
class Automation{
    public static void main(String[] args) {
        Device l=new Light("light");
        Device a=new AC("AC");
        trigger t1=new MotionTrigger(true);
        trigger t2=new Time(5);
        trigger t3=new Temp(45);
        Action a1=new Turnonaction(l);
        Action a2=new Turnoffaction(l);
        Link l1=new Link(t1,a2);
        l1.result();

    }
}