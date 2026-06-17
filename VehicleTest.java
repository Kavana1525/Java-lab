class Vehicle {
    private String brand;
    protected int speed;
    String fuelType;

    Vehicle() {
        brand = "Unknown";
        speed = 0;
        fuelType = "Unknown";
    }
    Vehicle(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public void setDetails(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class VehicleTest {
    public static void main(String[] args) {

    
        Vehicle v1 = new Vehicle();
        v1.setDetails("Toyota", 120, "Petrol");

        
        Vehicle v2 = new Vehicle("Tesla", 150, "Electric");

        System.out.println("Vehicle 1 Details:");
        v1.displayDetails();

        System.out.println("\nVehicle 2 Details:");
        v2.displayDetails();
    }
}