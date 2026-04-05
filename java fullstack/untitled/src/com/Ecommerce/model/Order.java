package src.com.Ecommerce.model;

public class Order{
    public User user;
    public Product product;
    public int quantity;
    Order(User user,Product product,int quantity){
        this.user=user;
        this.product=product;
        this.quantity=quantity;
    }
}