import java.util.Arrays;
import java.util.Objects;

public class Result {

    private double averageProfit;
    private int maxIndex;
    private int count;
    private double[] profits;

    public Result() {
    }

    public Result(double averageProfit, int maxIndex, int count, double[] profits) {
        this.averageProfit = averageProfit;
        this.maxIndex = maxIndex;
        this.count = count;
        this.profits = profits;

    }

    @Override
    public String toString() {
        return "Результат : " + "\nКоличество вкладов :  " + count +
                ",\nЧистый доход :  " + Arrays.toString(profits) +
                "\nСредняя прибыль: " + averageProfit + "  $" +
                "\nВклад с наибольшей прибылью:  " + maxIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return Double.compare(averageProfit, result.averageProfit) == 0
                && maxIndex == result.maxIndex
                && count == result.count
                && Objects.deepEquals(profits, result.profits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(averageProfit, maxIndex, count, Arrays.hashCode(profits));
    }

    public double getAverageProfit() {
        return averageProfit;
    }

    public void setAverageProfit(double averageProfit) {
        this.averageProfit = averageProfit;
    }

    public int getMaxIndex() {
        return maxIndex;
    }

    public void setMaxIndex(int maxIndex) {
        this.maxIndex = maxIndex;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double[] getProfits() {
        return profits;
    }

    public void setProfits(double[] profits) {
        this.profits = profits;
    }
}