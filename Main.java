//staticVariable

class Student {
    String name;
    static String college = "Amity University";

    Student(String n) {
        name = n;
    }
    void display() {
        System.out.println(name + " studies at " + college);
    }
}
public class Main{ 
    public static void main(String[] args) {
        Student s1 = new Student("Rahul");
        Student s2 = new Student("Anita");

        s1.display();
        s2.display();
    }
}