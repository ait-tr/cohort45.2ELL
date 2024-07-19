import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PersonMain {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("24.04.2001", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        Person person = new Person("Даниил", localDate);
        System.out.println(person);
    }
}
