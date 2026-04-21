import java.util.ArrayList;
import java.util.List;

class Product{
    String name;
    int price;
    double rating;
    Product(String name,int price,double rating){
        this.name=name;
        this.price=price;
        this.rating=rating;
    }
    @Override
    public String toString(){
        return name+"-"+price+"-"+rating;
    }
}

class Task{
    public static void main(String[] args) {
        List<Product> products=new ArrayList<>();
        products.add(new Product("pencil",5,4.9));
        products.add(new Product("pen",4,4.0));
        products.add(new Product("calculator",400,4.7));
        products.add(new Product("compass",10,5.0));

        Comparator<Product> byprice=new Comparator<Product>(){
            @Override
            public int compare(Product a,Product b){
                return Integer.compare(a.price,b.price);
            }
        };
        Collections.sort(products,byprice);
        System.out.println(products);
    }
}