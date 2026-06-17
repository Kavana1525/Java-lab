import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int vowels = 0, consonants = 0;

        str = str.toLowerCase();

        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);

            if(Character.isLetter(ch)) {
                if("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        String rev = "";

        for(int i=str.length()-1;i>=0;i--)
            rev += str.charAt(i);

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.println("Reverse = " + rev);
    }
}