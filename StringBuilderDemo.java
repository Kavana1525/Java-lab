public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder sb =
                new StringBuilder("Hello");

        sb.append(" World");

        sb.insert(6, "Java ");

        System.out.println("After Insert:");
        System.out.println(sb);

        sb.reverse();

        System.out.println("Reversed:");
        System.out.println(sb);
    }
}