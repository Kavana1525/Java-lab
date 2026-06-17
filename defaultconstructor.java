class Student {
    int id;
    String name;
    Student() {
        id = 1;
        name = "Kavana";
    }
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        Student s1 = new Student();  
        s1.display();
    }
}