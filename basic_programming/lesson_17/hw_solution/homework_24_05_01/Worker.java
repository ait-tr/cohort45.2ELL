package homework_24_05_01;

public class Worker extends Person {
    int age = getAge();

    public Worker(String name, int age, int height, int amountOfChildren) {
        super(name, age, height, amountOfChildren);
    }

    @Override
    public int calculateExperience() {
        return age - ADULTHOOD;
    }

    @Override
    public double calculateAverageSalary() {
        double minSalary = getMinSalary();
        double maxSalary = getMaxSalary();
        return CalculatorUtils.averageOfTwo(minSalary, maxSalary);
    }
}
