import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TaskFourth {

    public static void main(String[] args) {
        Person daniil = new Person("Даниил");
        Person artur = new Person("Артур");
        Person vladimir = new Person("Владимир");
        Person alexander = new Person("Александр");
        Person anton = new Person("Антон");

        Book book1 = new Book("Преступление и наказание", daniil);
        Book book2 = new Book("Дубровский", artur);
        Book book3 = new Book("Отцы и дети", vladimir);
        Book book4 = new Book("Евгений Онегин", alexander);
        Book book5 = new Book("Война и Мир", anton);
        Book book6 = new Book("Пиковая дама", daniil);

        //из списка книг создать мапу, в которой ключ - название книги, а значение - человек, который ее читает

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        Map<String, String> map = books.stream()
                //.collect(Collectors.toList())
                .collect(Collectors.toMap(b -> b.getName(), b -> b.getPerson().getName()));

        System.out.println(map);

        String name = map.get("Война и Мир");
        System.out.println(name);



    }
}
