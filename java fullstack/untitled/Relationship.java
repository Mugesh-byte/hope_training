class Battery{
    void powerSupply(){
        System.out.println("Still have 40% power");
    }
}

class Remote{
    Battery miniBattery;
    Remote(){
        miniBattery=new Battery();
    }
    public void changeChannel(){
        miniBattery.powerSupply();
        System.out.println("channel changed");
    }
    public void changeVolume(){
        System.out.println("volume increased");
    }
}

class TV{
    Remote tvremote;
    TV(Remote tvremote){
        this.tvremote=tvremote;
    }
    public void increasevolume(){
        tvremote.changeVolume();
    }
}

public class Relationship{
    public static void main(String[] args){
        Remote re=new Remote();
        TV sony=new TV(re);
        sony.increasevolume();
    }
}