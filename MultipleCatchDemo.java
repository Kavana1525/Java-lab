import java.util.Scanner;

public class MultipleCatchDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();

            System.out.print("Enter denominator: ");
            int b = sc.nextInt();

            int[] arr = {10, 20, 30};

            int result = a / b;                 // may cause ArithmeticException
            System.out.println("Result = " + result);

            System.out.println(arr[5]);         // may cause ArrayIndexOutOfBoundsException

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");

        } catch (Exception e) {
            System.out.println("General error occurred!");
        }

        System.out.println("Program ended.");
    }
}