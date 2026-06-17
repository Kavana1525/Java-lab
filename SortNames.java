import java.util.ArrayList;
import java.util.Collections;

public class SortNames {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Ravi");
        names.add("Anita");
        names.add("Kiran");
        names.add("Deepa");

        Collections.sort(names);

        System.out.println("Sorted Names:");
        System.out.println(names);
    }
}