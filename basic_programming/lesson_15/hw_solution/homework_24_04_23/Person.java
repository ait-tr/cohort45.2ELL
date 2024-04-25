package homework_24_04_23;

//1. Инкапсуляцию (расставить private, где надо),
// сделать сеттеры и геттеры, где надо
//закрыть доступ к методам (если такие есть),
// которые не должны быть видны внешним потребителям

//2. Добавить два поля - минимальную зарплату и максимальную зарплату

//3. Добавить метод внутрь человека,
// который использует написанную вами утилиту для того,
//чтобы найти среднюю зарплату человека

import java.time.LocalDate;

public class Person {
    private String name;
    private int age;
    private String birthplace;
    private String residentialAddress;
    private int height;
    private String eyeColor;
    private int amountOfChildren;
    private String education;
    private double minSalary;
    private double maxSalary;
    LocalDate birthDate;


    private static final int ADULTHOOD = 18;


    public Person(String name, int age, int height, int amountOfChildren) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.amountOfChildren = amountOfChildren;
    }

    public Person() {

    }

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
        System.out.println("Имя:  " + name);
        System.out.println("Дата рождения: " + birthDate);
        System.out.println("Возраст:  " + age + "  лет");
        System.out.println("Рост:  " + height + "  в сантиметрах");
        System.out.println("Количество детей:  " + amountOfChildren);

    }

    public void getInfoSecond() {
        System.out.println("Имя:  " + name);
        System.out.println("Место рождения:  " + birthplace);
        System.out.println("Дата рождения:  " + birthDate);
        System.out.println("Возраст:  " + age + "  лет");
        System.out.println("Адрес проживания:  " + residentialAddress);
        System.out.println("Рост:  " + height + "  в сантиметрах");
        System.out.println("Цвет глаз:  " + eyeColor);
        System.out.println("Образование:  " + education);

    }

    public int calculateExperience() {
        int experience = age - ADULTHOOD;
        return experience;
    }

    public double calculateAverageSalary() {
        double averageSalary = CalculatorUtils.averageOfTwo(minSalary, maxSalary);
        return averageSalary;
    }

    public void toGreet() {
        System.out.println("Здравствуйте!\nМеня зовут "
                + name + ", мне " + age + " лет." +
                "\nЯ вас категорически приветствую !");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public String getResidentialAddress() {
        return residentialAddress;
    }

    public int getHeight() {
        return height;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public int getAmountOfChildren() {
        return amountOfChildren;
    }

    public String getEducation() {
        return education;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setAmountOfChildren(int amountOfChildren) {
        this.amountOfChildren = amountOfChildren;
    }

    public void setEducation(String education) {
        this.education = education;
    }

}

