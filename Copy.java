class Student {
    int id;
    String name;
    Student(int i, String n) {
        id = i;
        name = n;
    }
    Student(Student s) {
        id = s.id;
        name = s.name;
    }
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        Student s1 = new Student(1, "KAVANA");  
        Student s2 = new Student(s1);           

        s1.display();
        s2.display();
   }
}