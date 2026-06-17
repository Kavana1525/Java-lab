class Person {
    String name;
    int age;


    Person() {
        name = "kavana";
        age = 21;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person p = new Person();  // calling no-argument constructor
        p.display();
    }
}