package homework_24_05_17;

import java.time.LocalDate;
import java.util.Random;

public class Pensioner extends Person implements AbleToWork {

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
    public void goToWork() {
        Random random = new Random();
        boolean pension = random.nextBoolean();
        if (pension) {
            System.out.println("Вы не могли бы выполнить эту небольшую работу ?" +
                    "\nЯ вообще то на пенсии !");
        } else {
            System.out.println("Вы не могли бы выполнить эту небольшую работу ?" +
                    "\nХорошо, я немного поработаю....");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
