import java.util.ArrayList;
import java.util.List;

public class Task {

    public static void main(String[] args) {
        //есть список чисел, умножить каждое из них на 2
        //отсеять те, что меньше 100
        //поделить каждое из них на 5
        //добавить 4
        //отсеять те, что меньше 5
        //вывести на экран результат


        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(120);
        list.add(450);
        list.add(1200);
        list.add(10000);
        list.add(1_000_000);

        List<Integer> result = list.stream()
                .map(x -> x * 2)
                .filter(x -> x >= 100)
                .map(x -> x / 5)
                .map(x -> x + 4)
                .filter(x -> x >= 5)
                .toList();

        System.out.println(result);



    }
}
