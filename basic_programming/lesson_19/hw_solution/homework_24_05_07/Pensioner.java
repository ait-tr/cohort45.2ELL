package homework_24_05_07;

import java.time.LocalDate;

public class Pensioner extends Person {
    private static final double CONSTANT_VALUE_FOR_ALL_PENSIONERS = 2000;

    public Pensioner(String name, int age, int height, int amountOfChildren, LocalDate birthDate) {
        super(name, age, height, amountOfChildren, birthDate);
    }

    @Override
    public int calculateExperience() {
        int experience;
        if (getAge() < 67) {
            experience = getAge() - ADULTHOOD;
        } else {
            experience = 49;
        }
        return experience;
    }

    @Override
    public double calculateAverageSalary() {
        double minSalary = getMinSalary();
        double maxSalary = getMaxSalary();
        return CalculatorUtils.averageOfThree(minSalary, maxSalary, CONSTANT_VALUE_FOR_ALL_PENSIONERS);
    }
}
