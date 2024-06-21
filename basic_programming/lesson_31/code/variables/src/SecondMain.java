import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecondMain {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Object());
        list.add("12345");
        list.add(12345);
        list.add(true);
        list.add(new Scanner(System.in));
        list.add(new Exception());

        for (Object object : list) {

        }

        System.out.println(list);
    }
}
