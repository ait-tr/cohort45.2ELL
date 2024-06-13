import java.util.ArrayList;
import java.util.List;

public class MainSecond {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(9);

        int max = Integer.MIN_VALUE;
        for (int i = 1; i < list.size(); i++) {
            int element = list.get(i);
            if (element > max) {
                max = element;
            }
        }

        int secondMax = Integer.MIN_VALUE;
        for (int i = 1; i < list.size(); i++) {
            int element = list.get(i);
            if (element > secondMax && element != max) {
                secondMax = element;
            }
        }

        System.out.println(secondMax);


    }
}
