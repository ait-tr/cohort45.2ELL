import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompareMain {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(1);
            linkedList.add(1);
        }

        for (int i = 0; i < 1_000; i++) {
            long start = System.nanoTime();
            arrayList.add(1);
            long end = System.nanoTime();
            System.out.println(end - start);
        }

        //start = System.currentTimeMillis();
        //for (int i = 0; i < 1_000_000; i++) {
        //    linkedList.add(1);
        //}
        //end = System.currentTimeMillis();
        //System.out.println(end - start);
    }
}
