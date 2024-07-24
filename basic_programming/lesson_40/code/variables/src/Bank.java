public class Bank {

    public double saveDeposit(double amount, int year, double rate) {
        if (amount < 0 || year < 0 || rate < 0) {
            throw new RuntimeException();
        }

        for (int i = 0; i < year; i++) {
            amount *= rate;
        }

        return amount;
    }
}
