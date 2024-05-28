package homework_24_05_17;

import java.time.LocalDate;
import java.util.Objects;

public class Teenager extends Person {

    private String sport;

    public Teenager(String name, String education, int age, LocalDate birthDate, String sport) {
        super(name, education, age, birthDate);
        this.sport = sport;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teenager teenager = (Teenager) o;
        return Objects.equals(sport, teenager.sport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sport);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
}
