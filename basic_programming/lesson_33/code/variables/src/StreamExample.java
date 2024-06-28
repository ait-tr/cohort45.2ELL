import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1200);
        list.add(2300);
        list.add(4300);
        list.add(4500);
        list.add(12000);
        list.add(16000);
        list.add(500);

        //найти, у какого количества людей зарплата меньше 3000 евро

        long count = list.stream()
                .filter(x -> x < 3000)
                .count();

        System.out.println(count);

        //всем подняли зарплату на 10%
        //вычесть налог в 40%
        //найдите общий зарплатный фонд
        Optional<Double> result = list.stream()
                .map(x -> x * 1.1)
                .map(x -> x - 0.4 * x)
                .reduce((x, y) -> x + y);

        System.out.println(list);

        System.out.println(result.get());
    }
}
