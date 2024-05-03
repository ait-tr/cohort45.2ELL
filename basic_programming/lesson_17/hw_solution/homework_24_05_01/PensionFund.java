package homework_24_05_01;

import java.time.LocalDate;

public class PensionFund {
    private String nameOfFund = "Deutsche-Rentenversicherung";
    private int depositors = 23_000_000;
    LocalDate foundationDate = LocalDate.of(2005, 10, 1);

    public double calculatePension(Person person) {
        return person.calculateAverageSalary() * 0.7;
    }
}
