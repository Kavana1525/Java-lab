import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {

        int a[] = {5, 2, 8};
        int b[] = {1, 9, 4};

        int c[] = new int[a.length + b.length];

        int k = 0;

        for(int i=0;i<a.length;i++)
            c[k++] = a[i];

        for(int i=0;i<b.length;i++)
            c[k++] = b[i];

        Arrays.sort(c);

        System.out.println("Merged Sorted Array:");
        for(int x : c)
            System.out.print(x + " ");
    }
}