package homework_24_05_17;

import java.time.LocalDate;
import java.util.Random;

public class Pensioner extends Person implements Workable {

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
        return CalculatorUtils.average(minSalary, maxSalary, CONSTANT_VALUE_FOR_ALL_PENSIONERS);
    }

    @Override
    public void work() {
        Random random = new Random();
        int answer = random.nextInt(1, 3);
        if (answer == 1) {
            System.out.println("Я вообще то на пенсии !");
        } else {
            System.out.println("Хорошо, я немного поработаю....");
        }
    }

    @Override
    public String toString() {
        return "Пенсионер Персональные данные :" + super.toString();
    }
}
