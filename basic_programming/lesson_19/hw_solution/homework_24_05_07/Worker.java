package homework_24_05_07;

import java.time.LocalDate;
import java.util.Objects;

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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (getAge() != person.getAge()) return false;
        if (getHeight() != person.getHeight()) return false;
        if (getAmountOfChildren() != person.getAmountOfChildren()) return false;
        if (Double.compare(getMinSalary(), person.getMinSalary()) != 0) return false;
        if (Double.compare(getMaxSalary(), person.getMaxSalary()) != 0) return false;
        if (!Objects.equals(getName(), person.getName())) return false;
        return Objects.equals(getBirthDate(), person.getBirthDate());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getAge();
        result = 31 * result + getHeight();
        result = 31 * result + getAmountOfChildren();
        temp = Double.doubleToLongBits(getMinSalary());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getMaxSalary());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getBirthDate() != null ? getBirthDate().hashCode() : 0);
        return result;
    }
}
