import java.util.Scanner;

// Step 1: Create custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            // Step 2: condition for exception
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above!");
            }

            System.out.println("You are eligible to vote.");

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program ended.");
    }
}