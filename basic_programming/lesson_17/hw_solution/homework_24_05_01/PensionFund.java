package homework_24_05_01;

public class PensionFund {
    private static final double INTEREST_RATE = 0.7;

    public double calculatePension(Person person) {
        return person.calculateAverageSalary() * INTEREST_RATE;
    }
}
