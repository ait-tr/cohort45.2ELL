package homework_24_05_01;

import java.time.LocalDate;

public class Worker extends Person {

    public Worker(String name, int age, int height, int amountOfChildren, LocalDate birthDate) {
        super(name, age, height, amountOfChildren, birthDate);
    }

    @Override
    public int calculateExperience() {
        return getAge() - ADULTHOOD;
    }

    @Override
    public double calculateAverageSalary() {
        double minSalary = getMinSalary();
        double maxSalary = getMaxSalary();
        return CalculatorUtils.averageOfTwo(minSalary, maxSalary);
    }
}
