class Character{
    String name;
    Character(String name){
        this.name=name;
    }
    void attack(){
        System.out.println();
    }
}
class Warrior extends Character{
    Warrior(String name){
        super(name);
    }
    void attack(){
        System.out.println(name+" attack with sword");
    }
}
class Archer extends Character{
    Archer(String name){
        super(name);
    }
    void attack(){
        System.out.println(name+" attack with arrow");
    }
}
class Mage extends Character{
    Mage(String name){
        super(name);
    }
    void attack(){
        System.out.println(name+" attack with magic");
    }
}

public class Minigame{
    public static void main(String[] args) {
        Character c;
        c=new Warrior("Blade");
        c.attack();
        Character h;
        h=new Archer("Hawkeye");
        h.attack();
        Character s;
        s=new Mage("Dr.Strange");
        s.attack();

    }
}