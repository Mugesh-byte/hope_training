package src.com.Ecommerce.service;

import src.com.Ecommerce.model.Order;

public class OrderService {
    
    public void place_order(Order order){
        System.out.println(order.user.name);
        System.out.println(order.product.name);
        System.out.println(order.quantity);
        System.out.println(order.user.name);
        int total_price=order.quantity*order.product.price;
        System.out.println(total_price);
    }
}
