import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SecondTask {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        //найдите те имена, которые имеют четное количество букв и выведите их длину
        strings.add("Гиляна");
        strings.add("Владимир");
        strings.add("Надежда");
        strings.add("Умут");

        List<Integer> result = strings.stream()
                .map(str -> str.length())
                .filter(integer -> integer % 2 == 0)
                .toList();

        System.out.println(result);

        //найдите те имена, которые имеют четное количество букв

        List<String> names = strings.stream()
                .filter(str -> str.length() % 2 == 0)
                .toList();

        System.out.println(names);

        //Есть список чисел (заполнить как угодно)
        //К каждому числу добавить 15
        //Оставить числа, большие 50
        //Найти сумму чисел

        //Есть список строк
        //отсеять строки, больше 15 символов
        //Найти самую большую строку





    }
}
