public class CreditCalculator {

    public double calculate(BankOperation bankOperation, int years) {
        double creditRate = bankOperation.calculateCreditRate();
        double amount = bankOperation.getAmount();
        for (int i = 0; i < years; i++) {
            amount *= creditRate;
        }

        return amount;
    }


}
