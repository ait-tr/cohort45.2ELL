import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Person ivan = new Person("Ivan", "Ivanov", 24,
                LocalDate.of(2000, 1, 1), Role.ADMIN);
        Printer.printFirstInfo(String.valueOf(ivan), Role.ADMIN);
        System.out.println(ivan.validateUser("https://www.amazon.de/login", Role.ADMIN));
        Printer.printUnderlining();

        Person peter = new Person("Peter", "Petrov", 23,
                LocalDate.of(2001, 1, 1), Role.USER);
        Printer.printFirstInfo(String.valueOf(peter), Role.USER);
        System.out.println(peter.validateUser("https://web-for-user/login/zugang-password", Role.USER));
        Printer.printUnderlining();

        Person iosif = new Person("Iosif", "Iosifov", 22,
                LocalDate.of(2002, 1, 1), Role.USER);
        Printer.printFirstInfo(String.valueOf(iosif), Role.USER);
        System.out.println(iosif.validateUser("https://app.klarna.com/login", Role.USER));
        Printer.printUnderlining();

        Person sidor = new Person("Sidor", "Sidorov", 16,
                LocalDate.of(2008, 1, 1), Role.TEEN);
        Printer.printFirstInfo(String.valueOf(sidor), Role.TEEN);
        System.out.println(sidor.validateUser("https://web-for-teen/commerzbank.de/start", Role.TEEN));
        Printer.printUnderlining();

        Person natasha = new Person("Natasha", "Sidorova", 15,
                LocalDate.of(2009, 1, 1), Role.TEEN);
        Printer.printFirstInfo(String.valueOf(natasha), Role.TEEN);
        System.out.println(natasha.validateUser("https://www.commerzbank.de/start/login", Role.TEEN));
        Printer.printUnderlining();
    }
}
