package src.com.Ecommerce.main;
import src.com.Ecommerce.model.*;
import src.com.Ecommerce.service.OrderService;
public class Main {
    public static void main(String[] args){
        User u=new User("Zuhail","thailand");
        Product p=new Product("Grau 5.56",122000);
        Order o=new Order(u,p,2);
        OrderService service=new OrderService();
        service.place_order(o);
    }
}
 