class Mobilee {

    String brand = "Samsung";
    String model = "Galaxy M32";

    class Battery {
        int capacity;
        String type;
        String backupTime;

        Battery(int capacity, String type, String backupTime) {
            this.capacity = capacity;
            this.type = type;
            this.backupTime = backupTime;
        }

        void displayBattery() {
            System.out.println("----- Mobilee Details -----");
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);

            System.out.println("\n----- Battery Specifications -----");
            System.out.println("Capacity: " + capacity + " mAh");
            System.out.println("Type: " + type);
            System.out.println("Backup Time: " + backupTime);
        }
    }

    public static void main(String[] args) {

        Mobilee mobilee = new Mobilee();
        Mobilee.Battery b1 = mobilee.new Battery(6000, "Li-Po", "2 days");

        b1.displayBattery();
    }
}