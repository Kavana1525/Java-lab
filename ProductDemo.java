class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    Product() {
        this(101, "Pen");
    }

    Product(int productId, String productName) {
        this(productId, productName, 10.0, 1);
    }

    Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateTotalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Product p = new Product(201, "Laptop", 50000, 2);
        p.display();
    }
}