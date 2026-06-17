class Mobile {
    String brand;
    String model;
    double price;

    Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    Mobile(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.price = 10000;
    }

    void displayMobile() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

class MobileTest {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Apple", "iPhone 15", 80000);
        Mobile m2 = new Mobile("Samsung", "Galaxy A14");

        m1.displayMobile();
        m2.displayMobile();
    }
}