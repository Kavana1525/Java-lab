import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter index (0-4): ");
            int index = sc.nextInt();

            System.out.println("Element = " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");
        }

        sc.close();
    }
}