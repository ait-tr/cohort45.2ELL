import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class FunctionMain {

    public static void main(String[] args) {
        Button a = () -> System.out.println(1);

        Predicate<Integer> predicate = (x) -> (x > 10);
        boolean bool = predicate.test(15);
        System.out.println(bool);
        System.out.println(predicate.test(5));




        Function<String, Integer> function = (str) -> str.length() + 10;
        int result = function.apply("ПРИВЕТ");
        System.out.println(result);


        List<String> list = new ArrayList<>();
        Consumer<String> consumer = list::add;  //method reference - ссылка на метод (str) -> list.add(str)
        consumer.accept("345678");


        Supplier<Person> supplier = () -> new Person();
        Person person = supplier.get();
        System.out.println(person);


        UnaryOperator<Integer> unaryOperator = (y) -> y + 5;
        result = unaryOperator.apply(5);
        System.out.println(result);


        BinaryOperator<Integer> binaryOperator = (x, y) -> x / 2 + y / 3;
        result = binaryOperator.apply(4, 3);
        System.out.println(result);




    }
}
