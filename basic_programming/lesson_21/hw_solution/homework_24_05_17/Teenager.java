package homework_24_05_17;

import java.time.LocalDate;

public class Teenager extends Person {

    public Teenager(String name, String education, int age, LocalDate birthDate) {
        super(name, education, age, birthDate);
    }

    @Override
    public int calculateExperience() {
        return 0;
    }

    @Override
    public double calculateAverageSalary() {
        return 0;
    }

    @Override
    public String toString() {
        return "Подросток Персональные данные :" + super.toString();
    }
}
