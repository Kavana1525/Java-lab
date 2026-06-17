import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);

        LinkedHashSet<Integer> set =
                new LinkedHashSet<>(list);

        list = new ArrayList<>(set);

        System.out.println("Final List:");
        System.out.println(list);
    }
}