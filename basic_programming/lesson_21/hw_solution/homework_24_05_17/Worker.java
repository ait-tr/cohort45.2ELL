package homework_24_05_17;

import java.time.LocalDate;

public class Worker extends Person implements AbleToWork {

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
        return CalculatorUtils.average(minSalary, maxSalary);
    }

    @Override
    public void goToWork() {
        System.out.println("Я счастливо шагаю на работу !");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
