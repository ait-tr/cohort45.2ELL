import java.util.List;

public class Calculator {

    private final static double INTEREST_CALCULATION = 0.01;

    public Result calculateProfits(List<Deposit> list) {
        double sum = 0;
        double averageProfit = 0;
        double[] profits = new double[list.size()]; // массив для хранения прибыли
        int maxIndex = 0;
        int count = 0;
        for (int i = 0; i < profits.length; i++) {
            profits[i] += (list.get(i).getAmountOfMoney() *
                    Math.pow(1 + (list.get(i).getInterestRate() * INTEREST_CALCULATION),
                            list.get(i).getAmountOfYears())) - list.get(i).getAmountOfMoney();
            count++;
            sum += profits[i];
            averageProfit = sum / list.size();

            if (profits[i] > profits[maxIndex]) {
                maxIndex = i;
            }
        }
        return new Result(averageProfit, maxIndex + 1, count, profits);
    }
}
