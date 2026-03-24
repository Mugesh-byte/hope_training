
import java.lang.String;
class Product{
    int id;
    String name;
    double price;
    int quantity;
    Product(int id,String name,double price,int quantity){
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    void display(){
        System.out.printf("%d\t%s\t%.2f\t%d",id,name,price,quantity);
    }
    float getTotalPrice(){
        return (float)price*quantity;
    }
}
public class Cart{
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        float grandttl=0;
        Product[] products=new Product[3];
        products[0]=new Product(2,"pencil",5.00,5);
        products[1]=new Product(1,"striker",250000.00,2);
        products[2]=new Product(20,"LWD tundra",500000.00,1);
        
        for(int i=0;i<3;i++){
            products[i].display();
            System.out.printf("\t");
            System.out.print(products[i].getTotalPrice());
            System.out.println();
            grandttl+=products[i].getTotalPrice();
        }
        System.out.println("grand total:"+grandttl);
    }
}