class Employee {
    int empId;
    String name;
    double salary;

    Employee() {
        this(0);
    }

    Employee(int empId) {
        this(empId, "Unknown");
    }

    Employee(int empId, String name) {
        this(empId, name, 0.0);
    }

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Brunda", 50000);

        e1.display();
    }
}