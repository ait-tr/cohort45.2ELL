package homework_24_05_01;


import java.time.LocalDate;

public abstract class Person {
    private String name;
    private int age;
    private int height;
    private int amountOfChildren;
    private double minSalary;
    private double maxSalary;
    private LocalDate birthDate;
    protected static final int ADULTHOOD = 18;


    public Person(String name, int age, int height, int amountOfChildren, LocalDate birthDate) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.amountOfChildren = amountOfChildren;
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

    public abstract int calculateExperience();

    public abstract double calculateAverageSalary();

    public void toGreet() {
        System.out.println("Здравствуйте!\nМеня зовут "
                + name +
                "\nЯ вас категорически приветствую !");
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
