import java.util.*;
abstract class Item {
    private String id;
    private String name;
    private double price;
    private int stock;

    public Item(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        setPrice(price);
        setStock(stock);
    }
    public String getName() {
        return name;
    }
    
    public double getPrice() { return price; }
    public void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative.");
        this.price = price;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        if (stock < 0) throw new IllegalArgumentException("Stock cannot be negative.");
        this.stock = stock;
    }

    public String getId() { return id; }
    public abstract void displayDetails();
}
class PerishableItem extends Item {
    private String expiryDate;

    public PerishableItem(String id, String name, double price, int stock, String expiryDate) {
        super(id, name, price, stock);
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayDetails() {
        System.out.printf("[Perishable] ID: %s | Name: %s | Price: $%.2f | Stock: %d | Expires: %s%n",
                getId(), getName(), getPrice(), getStock(), expiryDate);
    }
}

class ElectronicsItem extends Item {
    private int warrantyMonths;

    public ElectronicsItem(String id, String name, double price, int stock, int warrantyMonths) {
        super(id, name, price, stock);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public void displayDetails() {
        System.out.printf("[Electronics] ID: %s | Name: %s | Price: $%.2f | Stock: %d | Warranty: %d months%n",
                getId(), getName(), getPrice(), getStock(), warrantyMonths);
    }
}
class InventoryManager {
    private Map<String, Item> products = new HashMap<>();

    public void addItem(Item item) {
        products.put(item.getId(), item);
    }

    public void updateStock(String id, int amount) throws Exception {
        if (!products.containsKey(id)) throw new Exception("Item ID " + id + " not found.");
        Item item = products.get(id);
        item.setStock(item.getStock() + amount);
    }

    public void showInventory() {
        System.out.println("\n--- Current Inventory Report ---");
        for (Item item : products.values()) {
            item.displayDetails();
        }
    }
    public void checkLowStock(int threshold) {
        System.out.println("\n--- Low Stock Alerts ---");
        products.values().stream()
                .filter(i -> i.getStock() < threshold)
                .forEach(i -> System.out.println("ALERT: " + i.getName() + " is low on stock (" + i.getStock() + ")"));
    }
}
public class holiday_task2{
    public static void main(String[] args) {
        InventoryManager warehouse = new InventoryManager();
        Item milk = new PerishableItem("P001", "Organic Milk", 3.99, 50, "2026-05-01");
        Item laptop = new ElectronicsItem("E505", "Pro Laptop", 1200.00, 5, 24);
        
        warehouse.addItem(milk);
        warehouse.addItem(laptop);
        warehouse.showInventory();
        try {
            System.out.println("\nUpdating stock for Laptop...");
            warehouse.updateStock("E505", -2);
            
            System.out.println("Attempting invalid price update...");
            milk.setPrice(-1.0);
        } catch (Exception e) {
            System.out.println("Error Caught: " + e.getMessage());
        }
        warehouse.checkLowStock(10);
    }
}
