class DisplayExample {

    void display(String text) {
        System.out.println("String value: " + text);
    }

    void display(int number) {
        System.out.println("Integer value: " + number);
    }

    public static void main(String[] args) {
        DisplayExample obj = new DisplayExample();

        obj.display("salary");
        obj.display(50000);
    }
}