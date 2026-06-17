class Computer {

    static class Specification {
        String processor;
        int ram;
        int storage;
        String gpu;

        Specification(String processor, int ram, int storage, String gpu) {
            this.processor = processor;
            this.ram = ram;
            this.storage = storage;
            this.gpu = gpu;
        }

        void displaySpecs() {
            System.out.println("----- Hardware Configuration -----");
            System.out.println("Processor: " + processor);
            System.out.println("RAM: " + ram + " GB");
            System.out.println("Storage: " + storage + " GB");
            System.out.println("GPU: " + gpu);
        }
    }

    public static void main(String[] args) {
        Computer.Specification spec = new Computer.Specification(
            "Intel i7", 16, 512, "NVIDIA RTX 3050"
        );

        spec.displaySpecs();
    }
}