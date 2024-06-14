import java.util.*;

public class IteratorMain {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(7);
        set.add(17);


        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer result = list.get(i);
            System.out.println(result);
        }

        for (Integer i : list) {
            System.out.println(i);
        }

        for (Integer i : set) {
            System.out.println(i);
        }

        //foreach
        for (Integer a : set) {
            System.out.println(a);
        }

    }
}
