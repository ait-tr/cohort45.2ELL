package homework_24_05_07;

import java.time.LocalDate;
import java.util.Objects;

public class PensionFund {
    private String nameOfFund = "Deutsche-Rentenversicherung";
    private int depositors = 23_000_000;
    private LocalDate foundationDate = LocalDate.of(2005, 10, 1);

    private static final double INTEREST_RATE = 0.7;

    public double calculatePension(Person person) {
        return person.calculateAverageSalary() * INTEREST_RATE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PensionFund that = (PensionFund) o;

        if (depositors != that.depositors) return false;
        if (!Objects.equals(nameOfFund, that.nameOfFund)) return false;
        return Objects.equals(foundationDate, that.foundationDate);
    }

    @Override
    public int hashCode() {
        int result = nameOfFund != null ? nameOfFund.hashCode() : 0;
        result = 31 * result + depositors;
        result = 31 * result + (foundationDate != null ? foundationDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Пенсионный фонд" +
                "\nНазвание фонда:   " + nameOfFund +
                "\nКоличество участников (застрахованных лиц):   " + depositors +
                "\nДата основания:   " + foundationDate ;
    }
}
