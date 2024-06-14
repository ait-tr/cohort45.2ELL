import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainThird {

    public static void main(String[] args) {
        Set<Something> set = new TreeSet<>();

        for (int i = 0; i < 1_000; i++) {
            Something something = new Something();
            something.setName(String.valueOf(i));
            set.add(something);

        }

        System.out.println(set);
    }
}
