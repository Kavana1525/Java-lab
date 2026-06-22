import java.util.Scanner;

public class ArrayException1 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter index to access (0-4): ");
            int index = sc.nextInt();

            System.out.println("Value = " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index! Please enter between 0 and 4.");
        }

        System.out.println("Program ended.");
    }
}