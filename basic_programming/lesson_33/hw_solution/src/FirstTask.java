import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class FirstTask {

    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(100));
        }
        System.out.println("Исходный массив :  " + integers);

        Optional<Integer> result = integers.stream()
                .map(x -> x + 15)
                .filter(x -> x > 50)
                .reduce(Integer::sum);
        System.out.println("Сумма чисел равна :  " + result.get());
    }
}
