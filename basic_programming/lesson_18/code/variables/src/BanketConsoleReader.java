import java.util.Scanner;

public class BanketConsoleReader extends BanketReader {

    private Scanner scanner;

    public BanketConsoleReader() {
        scanner = new Scanner(System.in);
    }

    @Override
    Person readLine() {
        String name = scanner.nextLine();
        Person person = new Person(name);
        return person;
    }

}
