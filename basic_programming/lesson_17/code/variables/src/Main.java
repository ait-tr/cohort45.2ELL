public class Main {

    public static void main(String[] args) {
        BanketConsoleReader banketConsoleReader = new BanketConsoleReader();

        Person[] people = banketConsoleReader.readAll(10);

        System.out.println(people[2]);
        System.out.println(people[8]);

    }
}
