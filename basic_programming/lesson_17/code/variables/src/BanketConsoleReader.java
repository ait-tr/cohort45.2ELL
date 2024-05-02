import java.util.Scanner;

public class BanketConsoleReader extends BanketReader {

    @Override
    Person readLine() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Person person = new Person(name);
        return person;
    }

    @Override
    Person[] readAll(int countOfLines) {

        Person[] people = new Person[countOfLines];

        for (int i = 0; i < countOfLines; i++) {
            people[i] = readLine();
        }

        return people;
    }

}
