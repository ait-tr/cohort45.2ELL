package homework_24_04_25;

public class Pensioner extends Person {
    private static final double CONSTANT_VALUE_FOR_ALL_PENSIONERS = 2000;

    public Pensioner(String name, int age, int height, int amountOfChildren) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.amountOfChildren = amountOfChildren;
    }

    @Override
    double calculateAverageSalary() {
        double averageSalary = CalculatorUtils.averageOfThree(minSalary, maxSalary, CONSTANT_VALUE_FOR_ALL_PENSIONERS);
        return averageSalary;
    }
}
