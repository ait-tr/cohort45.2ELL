import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TaskSecond {

    public static void main(String[] args) {

        Person dmitry = new Person("Dmitry", "Irina", "Fiodor");
        Person sergey = new Person("Sergey", "Natalia", "Wladimir");
        Person polina = new Person("Polina", "Inna", "Anatoly");
        Person alexey = new Person("Alexey", "Elisaveta", "Wadim");
        Person victoria = new Person("Victoria", "Anastasia", "Wladislaw");
        Person alex = new Person();

        List<Person> people = new ArrayList<>();
        people.add(dmitry);
        people.add(sergey);
        people.add(polina);
        people.add(alexey);
        people.add(victoria);
        people.add(alex);

        System.out.println("\nСписок персон :");
        people.forEach(System.out::println);

        List<String> list = people.stream()
                .flatMap(name -> Stream.of(name.getMom(), name.getDad()))
                .filter(name -> name != null && name.length() > 6)
                .toList();
        System.out.println("\nСписок имён мам и пап, у которых имя длиннее 6 букв :");
        list.forEach(System.out::println);
    }
}
