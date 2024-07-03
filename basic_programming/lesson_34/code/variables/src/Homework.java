import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Homework {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Optional<Integer> optional = list.stream()
                .filter((x) -> x > 10)
                .reduce((x, y) -> x + y);

        Integer integer = optional.get();
        System.out.println(integer);
    }
}
