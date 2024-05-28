package homework_24_05_17;

import java.time.LocalDate;
import java.util.Objects;

public class PensionFund {

    private String name;
    private int depositors;
    private LocalDate foundationDate;
    private static final double CONSTANT_PERCENT_FOR_PENSION = 0.7;

    public PensionFund() {
    }

    public PensionFund(String name, int depositors, LocalDate foundationDate) {
        this.name = name;
        this.depositors = depositors;
        this.foundationDate = foundationDate;
    }

    public double calculatePension(Person person) {
        return person.calculateAverageSalary() * CONSTANT_PERCENT_FOR_PENSION;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PensionFund that = (PensionFund) o;

        if (depositors != that.depositors) return false;
        if (!Objects.equals(name, that.name)) return false;
        return Objects.equals(foundationDate, that.foundationDate);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + depositors;
        result = 31 * result + (foundationDate != null ? foundationDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Пенсионный фонд" +
                "\nНазвание фонда:   " + name +
                "\nКоличество участников (застрахованных лиц):   " + depositors +
                "\nДата основания:   " + foundationDate;
    }

    public String getNameOfFund() {
        return name;
    }

    public void setNameOfFund(String nameOfFund) {
        this.name = nameOfFund;
    }

    public int getDepositors() {
        return depositors;
    }

    public void setDepositors(int depositors) {
        this.depositors = depositors;
    }

    public LocalDate getFoundationDate() {
        return foundationDate;
    }
}
