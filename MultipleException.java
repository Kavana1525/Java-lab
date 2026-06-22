import java.util.Scanner;

public class MultipleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter array index: ");
            int index = sc.nextInt();

            System.out.print("Enter denominator: ");
            int den = sc.nextInt();

            System.out.println("Array Element = " + arr[index]);

            int result = 100 / den;
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");
        }

        sc.close();
    }
}