import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];

        array[0] = 1;
        array[1] = 3;

        System.out.println(Arrays.toString(array));

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.remove(0);
        list.set(0, 56);
        int result = list.get(0);
        boolean  exists = list.contains(56);

        System.out.println(result);

        System.out.println(exists);

        System.out.println(list);


    }
}
