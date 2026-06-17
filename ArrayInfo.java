import java.util.Scanner;

public class ArrayInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int sum = 0;

        System.out.println("Enter 10 integers:");
        for(int i=0;i<10;i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int largest = arr[0];
        int smallest = arr[0];

        for(int i=0;i<10;i++) {
            if(arr[i] > largest)
                largest = arr[i];
            if(arr[i] < smallest)
                smallest = arr[i];
        }

        System.out.println("Elements:");
        for(int x : arr)
            System.out.print(x + " ");

        System.out.println("\nSum = " + sum);
        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }
}