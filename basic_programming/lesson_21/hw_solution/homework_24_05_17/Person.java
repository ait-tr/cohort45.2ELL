package homework_24_05_17;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Person {

    private String name;
    private String education;
    private int age;
    private int height;
    private int amountOfChildren;
    private double minSalary;
    private double maxSalary;
    private LocalDate birthDate;
    protected static final int ADULTHOOD = 18;

    public Person(String name, int age, int height, int amountOfChildren, double minSalary, double maxSalary, LocalDate birthDate) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.amountOfChildren = amountOfChildren;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.birthDate = birthDate;
    }

    public Person(String name, int age, int height, int amountOfChildren, LocalDate birthDate) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.amountOfChildren = amountOfChildren;
        this.birthDate = birthDate;
    }

    public Person(String name, String education, int age, LocalDate birthDate) {
        this.name = name;
        this.education = education;
        this.age = age;
        this.birthDate = birthDate;
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

    public void getSecondInfo() {
        System.out.println("Имя:  " + name);
        System.out.println("Овразование:  " + education);
        System.out.println("Дата рождения: " + birthDate);
        System.out.println("Возраст:  " + age + "  лет");

    }

    public abstract int calculateExperience();

    public abstract double calculateAverageSalary();

    public void toGreet() {
        System.out.println("Здравствуйте!\nМеня зовут "
                + name +
                "\nЯ вас категорически приветствую !");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (height != person.height) return false;
        if (amountOfChildren != person.amountOfChildren) return false;
        if (Double.compare(minSalary, person.minSalary) != 0) return false;
        if (Double.compare(maxSalary, person.maxSalary) != 0) return false;
        if (!Objects.equals(name, person.name)) return false;
        return Objects.equals(birthDate, person.birthDate);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + height;
        result = 31 * result + amountOfChildren;
        temp = Double.doubleToLongBits(minSalary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(maxSalary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Персональные данные :" +
                "\nИмя:   " + name +
                "\nВозраст:   " + age +
                "\nРост:   " + height +
                "\nКоличество детей:   " + amountOfChildren +
                "\nМинимальная зарплата:   " + minSalary +
                "\nМаксимальная зарплата:   " + maxSalary +
                "\nДата рождения:   " + birthDate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getAmountOfChildren() {
        return amountOfChildren;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setAmountOfChildren(int amountOfChildren) {
        this.amountOfChildren = amountOfChildren;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }
}
