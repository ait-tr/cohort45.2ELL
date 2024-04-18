package homework_24_04_16;

import java.time.LocalDate;

public class Person {
    String name;
    int age;
    int height;
    int amountOfChildren;
    LocalDate birthDate;

    public void getInfo() {
        System.out.println("Имя  " + name);
        System.out.println("Возраст  " + age + "  лет");
        System.out.println("Рост  " + height + "  в сантиметрах");
        System.out.println("Количество детей  " + amountOfChildren);
        System.out.println("Дата рождения " + birthDate);
    }

    public int calculateExperience() {
        int experience = age - 18;
        return experience;
    }

    public void toGreet() {
        System.out.println("Здравствуйте!\nМеня зовут "
                + name + ", мне " + age + " лет." +
                "\nЯ вас категорически приветствую !");
    }
}

