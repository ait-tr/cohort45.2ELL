import java.time.LocalDate;

public class MainSecond {

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Павел";
        person.age = 50;
        person.birthDate = LocalDate.of(1970, 4, 24);
        person.height = 178;
        person.numberOfChildren = 3;

        person.greetings();
        person.info();

        int experience = person.getExperience();
        System.out.println(experience);
    }
}
