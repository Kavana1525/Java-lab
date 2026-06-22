public class NullPointerExceptionDemo {
    public static void main(String[] args) {

        try {
            String str = null;

            // This will cause NullPointerException
            System.out.println("Length = " + str.length());

        } catch (NullPointerException e) {
            System.out.println("Error: You are trying to use a null object!");
        }

        System.out.println("Program ended.");
    }
}