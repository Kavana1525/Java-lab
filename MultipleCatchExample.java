public class MultipleCatchExample {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int result = a / b;   // ArithmeticException

            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException

        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid");
        } 
        catch (Exception e) {
            System.out.println("Some other exception occurred");
        }

        System.out.println("Program continues...");
    }
}