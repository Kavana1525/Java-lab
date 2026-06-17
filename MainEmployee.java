abstract class Employee {
    abstract void display();
}

class FullTimeEmployee extends Employee {
    int id;
    String name;
    double salary;

    FullTimeEmployee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("FullTime Employee: " + id + " " + name + " " + salary);
    }
}

class PartTimeEmployee extends Employee {
    int id;
    String name;
    double hourlyWage;

    PartTimeEmployee(int id, String name, double hourlyWage) {
        this.id = id;
        this.name = name;
        this.hourlyWage = hourlyWage;
    }

    void display() {
        System.out.println("PartTime Employee: " + id + " " + name + " " + hourlyWage);
    }
}

class Intern extends Employee {
    int id;
    String name;

    Intern(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Intern Employee: " + id + " " + name);
    }
}

public class MainEmployee
 {
    public static void main(String[] args) {
        Employee[] e = new Employee[3];

        e[0] = new FullTimeEmployee(1, "Asha", 50000);
        e[1] = new PartTimeEmployee(2, "Ravi", 300);
        e[2] = new Intern(3, "Kiran");

        for (Employee emp : e) {
            emp.display();
        }
    }
}