import java.util.Scanner;

// throws is used in method declaration
public class ThrowThrowsDemo {

    // method declares exception using throws
    static void checkAge(int age) throws Exception {

        if (age < 18) {
            // throw is used to explicitly throw exception
            throw new Exception("Age must be 18 or above!");
        } else {
            System.out.println("You are eligible.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            checkAge(age);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program ended.");
    }
}