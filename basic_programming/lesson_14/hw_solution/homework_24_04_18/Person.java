package homework_24_04_18;

import java.time.LocalDate;

public class Person {
    String name;
    int age;
    String birthplace;  //  Место рождения.
    String residentialAddress;  //  Адрес проживания.
    int height;
    String eyeColor;  //  Цвет глаз.
    int amountOfChildren;
    String education;  //  Образование.
    LocalDate birthDate;

    //Число 18 из метода по расчету стажа вынести как КОНСТАНТУ
    static final int ADULTHOOD = 18;

    //1. Добавить конструктор, который заполняет все поля объекта
    public Person(String name, int age, int height, int amountOfChildren) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.amountOfChildren = amountOfChildren;
    }

    //2. Создать пустой конструктор
    public Person() {

    }

    //3. Сделать свой любой произвольный конструктор (*)
    public Person(String name, String birthplace, int age,
                  String residentialAddress, int height, String eyeColor,
                  String education) {
        this.name = name;
        this.birthplace = birthplace;
        this.age = age;
        this.residentialAddress = residentialAddress;
        this.height = height;
        this.eyeColor = eyeColor;
        this.education = education;
    }

    public void getInfo() {
        System.out.println("Имя  " + name);
        System.out.println("Дата рождения " + birthDate);
        System.out.println("Возраст  " + age + "  лет");
        System.out.println("Рост  " + height + "  в сантиметрах");
        System.out.println("Количество детей  " + amountOfChildren);

    }

    public void getInfoSecond() {
        System.out.println("Имя  " + name);
        System.out.println("Место рождения  " + birthplace);
        System.out.println("Дата рождения " + birthDate);
        System.out.println("Возраст  " + age + "  лет");
        System.out.println("Адрес проживания  " + residentialAddress);
        System.out.println("Рост  " + height + "  в сантиметрах");
        System.out.println("Цвет глаз  " + eyeColor);
        System.out.println("Образование  " + education);

    }

    public int calculateExperience() {
        int experience = age - ADULTHOOD;
        return experience;
    }

    public void toGreet() {
        System.out.println("Здравствуйте!\nМеня зовут "
                + name + ", мне " + age + " лет." +
                "\nЯ вас категорически приветствую !");
    }

}

