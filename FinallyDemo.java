import java.util.Scanner;

public class FinallyDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            int result = 100 / num;   // may cause ArithmeticException
            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");

        } finally {
            System.out.println("Finally block always executes.");
        }

        System.out.println("Program ended.");
    }
}