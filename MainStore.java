class Store {

    static class Product {
        int productId;
        String productName;
        double price;

        Product(int productId, String productName, double price) {
            this.productId = productId;
            this.productName = productName;
            this.price = price;
        }

        void displayProduct() {
            System.out.println("----- Product Details -----");
            System.out.println("Product ID: " + productId);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
        }
    }
}

class University {

    static class Department {
        String deptName;
        int deptId;
        int noOfStudents;

        Department(String deptName, int deptId, int noOfStudents) {
            this.deptName = deptName;
            this.deptId = deptId;
            this.noOfStudents = noOfStudents;
        }

        void displayDepartment() {
            System.out.println("----- Department Details -----");
            System.out.println("Department ID: " + deptId);
            System.out.println("Department Name: " + deptName);
            System.out.println("Number of Students: " + noOfStudents);
        }
    }
}

public class MainStore
 {
    public static void main(String[] args) {

        Store.Product p1 = new Store.Product(101, "Laptop", 55000);
        p1.displayProduct();

        System.out.println();

        University.Department d1 = new University.Department("Computer Science", 1, 120);
        d1.displayDepartment();
    }
}