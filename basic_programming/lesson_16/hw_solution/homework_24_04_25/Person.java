package homework_24_04_25;
// 1.  Сделать класс Person абстрактным
// 1.1 Сделать метод расчёта средней зарплаты(СЗП) абстрактным
// 2.  Создать класс пенсионер, унаследовать от класса Person
// 2.1 СЗП расчитывается из 3 показателей : минимальной , максимальной и
//     константного значения для всех пенсионеров 2000 Euro
// 3.  Создать класс рабочий, унаследовать от класса Person
// 3.1 СЗП расчитывается из 2 показателей : минимальной и максимальной

import java.time.LocalDate;

public abstract class Person {
    String name;
    int age;
    String birthplace;
    String residentialAddress;
    int height;
    String eyeColor;
    int amountOfChildren;
    String education;
    double minSalary;
    double maxSalary;
    LocalDate birthDate;

    static final int ADULTHOOD = 18;

    public Person(String name, int age, int height, int amountOfChildren) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.amountOfChildren = amountOfChildren;
    }

    public Person() {

    }

    public void getInfo() {
        System.out.println("Имя:  " + name);
        System.out.println("Дата рождения: " + birthDate);
        System.out.println("Возраст:  " + age + "  лет");
        System.out.println("Рост:  " + height + "  в сантиметрах");
        System.out.println("Количество детей:  " + amountOfChildren);
    }

    public int calculateExperience() {
        return age - ADULTHOOD;
    }

    abstract double calculateAverageSalary();

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
