import java.util.StringTokenizer;
import java.util.Scanner;

public class TokenizerDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        StringTokenizer st =
                new StringTokenizer(str);

        int count = st.countTokens();

        System.out.println("Total Words = " + count);

        while(st.hasMoreTokens()) {
            String word = st.nextToken();

            System.out.println("Word: " + word);
            System.out.println("Length: " + word.length());
        }
    }
}