import java.util.HashSet;
import java.util.Set;

public class MainSecond {

    public static void main(String[] args) {
        Something something = new Something();
        System.out.println(something.hashCode());

        Set<Something> set = new HashSet<>();
        set.add(something);

        System.out.println(set);

        something.setName("12345");

        System.out.println(something.hashCode());

        System.out.println(set.contains(something));
    }
}
