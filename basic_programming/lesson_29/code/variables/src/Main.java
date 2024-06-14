import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();

        list.add("qwerty");
        set.add("qwerty");

        list.add("qwerty");
        set.add("qwerty");
        set.add("Qwerty");

        System.out.println(list);
        System.out.println(set);

        System.out.println(list.get(0));
        //System.out.println(set.get(0)); //нельзя получить по индексу, потому что индекса нет

        System.out.println(list.contains("qwerty"));
        System.out.println(set.contains("qwerty"));

        set.remove("qwerty");

        System.out.println(set);


    }
}
