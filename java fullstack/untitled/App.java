
class User{
        String user;
        String address;
        String gmail;
        String role="User";
        User(String user, String address, String gmail){
                this.user=user;
                this.address=address;
                this.gmail=gmail;
        
        }
        void display(){
                System.out.println("user:"+user);
                System.out.println("role:"+role);
        }
}
class Driver extends User{
        String role="Driver";
        String vehicle; 
        Driver(String user,String address,String gmail,String vehicle){ 
                super(user, address, gmail);
                
                this.vehicle=vehicle;
                }
        void displayDriver(){
                super.display();
                System.out.println("role:"+role);
                System.out.println("vehicle:"+vehicle);
                System.out.println("role:"+super.role);
        } 
}
class Food extends User{
        String favoritefood;
        Food(String user, String address, String gmail, String favoritefood) {
                super(user, address, gmail);
                this.favoritefood=favoritefood;
                System.out.println("Food created");
        }
}

class Taxi extends User{
        String location;
        Taxi(String user, String address, String gmail, String location) {
                super(user, address, gmail);
                this.location=location;
                System.out.println("Taxi created");
        }
}
public class App{
        public static void main(String[] args){
                Food fi=new Food("mugesh","chennai","mugesh@gmail.com","parottaaaaaaaaaa");   
                System.out.println(fi.user);
                System.out.println(fi.address);
                System.out.println(fi.gmail);
                System.out.println(fi.favoritefood);

                Driver d=new Driver("sai","chennai","sai@gmail.com","swift");
                System.out.println(d.user);
                System.out.println(d.role);
                System.out.println(d.vehicle);

                Taxi t=new Taxi("kumar","chennai","kumar@gmail.com","madurai");
                System.out.println(t.user);
                System.out.println(t.address);
                System.out.println(t.gmail);
                System.out.println(t.location);
                System.err.println("----------------------------------------------");
        }
}