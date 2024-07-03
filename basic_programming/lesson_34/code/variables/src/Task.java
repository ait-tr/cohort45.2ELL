import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Task {

    public static void main(String[] args) {
        Person daniil = new Person(null);
        Person artur = new Person("Артур");
        Person vladimir = new Person("Владимир");
        Person alexander = new Person("Александр");
        Person anton = new Person("Антон");

        List<Person> personList = new ArrayList<>();
        personList.add(artur);
        personList.add(daniil);
        personList.add(vladimir);
        personList.add(alexander);
        personList.add(anton);

        List<Book> bookList = personList.stream()
                .map(person -> new Book("", person))
                .toList();

        System.out.println(bookList);


        Book book1 = new Book("Преступление и наказание", daniil);
        Book book2 = new Book("Дубровский", artur);
        Book book3 = new Book("Отцы и дети", vladimir);
        Book book4 = new Book("Евгений Онегин", alexander);
        Book book5 = new Book("Война и Мир", anton);
        Book book6 = new Book("Пиковая дама", null);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        List<String> bookNames = books.stream()
                .map(book -> book.getName())
                .toList();

        List<String> names = books.stream()
                .map(Book::getPerson)
                .filter(Objects::nonNull)
                .map(Person::getName)
                .filter(Objects::nonNull)
                .filter(name -> name.startsWith("А"))
                .toList();



        System.out.println(names);








        //есть список из книг, у каждой книги есть запись о том, кто ее взял
        //нужно вывести список людей, которые взяли книги, при этом их имена должны начинаться на букву А

    }
}
