
class Notification{
    String name;
    String message;
    Notification(String name,String message){
        this.name=name;
        this.message=message;
    }
    void send(){
        System.out.println("sending message "+message+" to"+name);
    }
}
class EmailNotification extends Notification{
    EmailNotification(String name,String message){
        super(name, message);
    }
    void send(){
        System.out.println("Sending email "+message+" to "+name);

    }                    

}
class SMSNotification extends Notification{
    SMSNotification(String name,String message){
        super(name, message);
    }
    void send(){
        System.out.println("Sending SMS "+message+" to "+name);
    }
}

public class notify{
    public static void main(String[] args) {
        Notification n;
        n= new EmailNotification("Mugesh","Hello");
        n.send();
        n=new SMSNotification("Mugesh","Bye");
        n.send();

    }

}

