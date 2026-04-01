import java.lang.String;
import java.lang.Math;
class ProductOutOfStock extends Exception{
    ProductOutOfStock(String msg){
        super(msg);
    }
}

class PaymentFailedException extends Exception{
    
    PaymentFailedException(String msg){
        super(msg);
    }
}

class OrderProcessingFailed extends Exception{
    OrderProcessingFailed(String msg){
        super(msg);
    }
}
class Product{
    String name;
    int stock;
    int price;
    Product(String name,int stock,int price){
        this.name=name;
        this.stock=stock;
        this.price=price;
    }

}
class User{
    String name;
    String address;
    User(String name,String address){
        this.name=name;
        this.address=address;
    }
}
class Order{
    Product product;
    User user;
    int quantity;
    Order(Product product,User user,int quantity){
        this.product=product;
        this.user=user;
        this.quantity=quantity;
    }
}
class OrderService{
    void placeorder(Order order) throws ProductOutOfStock,PaymentFailedException,OrderProcessingFailed{
        if(order.product.stock<=0){
            throw new ProductOutOfStock("product is out of stock");
        }
        //double val=Math.random();
        if(Math.random()<0.5){
            throw new PaymentFailedException("Payment failed");
        }
        if(Math.random()<0.6){
            throw new OrderProcessingFailed("Order processing failed");
        }
        else{
            order.product.stock=order.product.stock-order.quantity;
            System.out.println("order placed successfully");
        }

    }
}
class Ecommerce{
    public static void main(String[] args){
        Product p=new Product("lwd tundra",8,10);
        User u=new User("John Wick","Continental");
        Order o=new Order(p,u,1);
        OrderService s=new OrderService();
        try{
            s.placeorder(o);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}