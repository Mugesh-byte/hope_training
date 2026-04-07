package com.Ecommerce.main;
import com.Ecommerce.model.User;
import com.Ecommerce.model.Product;
import com.Ecommerce.model.Order;
import com.Ecommerce.service.OrderService;
public class Main {
    public static void main(String[] args){
        User u=new User("Zuhail","thailand");
        Product p=new Product("Grau 5.56",122000);
        Order o=new Order(u,p,2);
        OrderService service=new OrderService();
        service.place_order(o);
    }
}
 