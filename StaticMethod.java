class Employee {
    String name;
    double salary;
    static int totalEmployees = 0;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        totalEmployees++;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Amit", 30000);
        Employee e2 = new Employee("Rahul", 40000);
        Employee e3 = new Employee("Neha", 35000);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();

        Employee.displayTotalEmployees();
    }
}