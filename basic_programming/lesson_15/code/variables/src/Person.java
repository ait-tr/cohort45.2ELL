import java.time.LocalDate;

public class Person {

    String name;
    int age;

    int height;

    int numberOfChildren;

    LocalDate birthDate;

    String[] childrenNames;

    public void info() {
        System.out.println("--------");
        System.out.println("Мое имя " + name);
        System.out.println("Мой возраст " + age);
        System.out.println("Моя дата рождения " + birthDate);
        System.out.println("--------");
    }

    public void greetings() {
        System.out.println("Привет, меня зовут " +name);
    }

    public int getExperience() {
        int experience = age - 18;
        return experience;
    }


}
