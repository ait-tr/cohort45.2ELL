import java.util.Objects;

public class Deposit {
    private int amountOfMoney;
    private int amountOfYears;
    private double interestRate;

    public Deposit(int amountOfMoney, int amountOfYears, double interestRate) {
        this.amountOfMoney = amountOfMoney;
        this.amountOfYears = amountOfYears;
        this.interestRate = interestRate;
    }

    public Deposit() {
    }

    @Override
    public String toString() {
        return " Депозит :  " +
                "Сумма :  " + amountOfMoney + "  $  " +
                ",   Количество лет :  " + amountOfYears +
                ",   Процент по вкладку : " + interestRate + "\n";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deposit deposit = (Deposit) o;
        return amountOfMoney == deposit.amountOfMoney
                && amountOfYears == deposit.amountOfYears
                && Double.compare(interestRate, deposit.interestRate) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfMoney, amountOfYears, interestRate);
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public int getAmountOfYears() {
        return amountOfYears;
    }

    public void setAmountOfYears(int amountOfYears) {
        this.amountOfYears = amountOfYears;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}