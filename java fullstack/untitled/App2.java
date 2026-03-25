class User{
    String name;
    String email;
    String address;
    User(String name,String email,String address){
        this.name=name;
        this.email=email;
        this.address=address;
    }
    void display(){
        System.out.println(name);
        System.out.println(email);
        System.out.println(address);
    }
}

class RideUser extends User{
    String vehicletype;
    RideUser(String name,String email,String address,String vehicletype){
        super(name,email,address);
        this.vehicletype=vehicletype;
    }
    void displayride(){
        super.display();
        System.out.println(vehicletype);
    }

}
class Food extends User{
    String favfood;
    Food(String name,String email,String address,String favfood){
        super(name, email, address);
        this.favfood=favfood;
    }

    
}
class Packagedelivery extends User{
    int packageweight;
    Packagedelivery(String name,String email,String address,int packageweight){
        super(name, email, address);
        this.packageweight=packageweight;
    }
    void displaypackage(){
        super.display();
        System.out.println(packageweight);
    }
}

class App2{
    public static void main(String[] args) {
        RideUser r=new RideUser("mugesh","mugesh@gmail.com","chennai","Bike");
        r.displayride();}
}