import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Integer> numbers;

    private final static double TEN_PERCENT_MORE = 1.1;
    private final static double TWENTY_PERCENT_MORE = 1.2;
    private final static int LAST_TEN_DIMENSION = 10;
    private final static int EVERY_HUNDRED_DIMENSION = 100;

    public Calculator() {
        numbers = new ArrayList<>();
    }

    public Result addNumber(int number) {
        numbers.add(number);

        double sum = 0.0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        double average = calculateAverage();
        double averageOfTheLastTen = calculateAverageOfTheLastTen();
        double averageFromEveryHundredth = calculateAverageFromEveryHundredth();
        int difference = calculateDifference(number);
        boolean isAlarm = calculateAlarm(number, average);
        boolean isWarning = calculateWarning(number);


        Result result = new Result(average, difference, averageOfTheLastTen,
                averageFromEveryHundredth, isAlarm, isWarning);
        return result;
    }

    private double calculateAverage() {
        double sum = 0.0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum / numbers.size();
    }

    private double calculateAverageOfTheLastTen() {
        int sumOfLastTen = 0;
        double averageOfTheLastTen = 0.0;
        if (numbers.size() >= LAST_TEN_DIMENSION) {
            for (int i = numbers.size() - 1; i > numbers.size() - (LAST_TEN_DIMENSION - 1); i--) {
                sumOfLastTen += numbers.get(i);
                averageOfTheLastTen = (double) sumOfLastTen / LAST_TEN_DIMENSION;
            }
        }
        return averageOfTheLastTen;
    }

    private double calculateAverageFromEveryHundredth() {
        int sumOfEveryHundred = 0;
        double averageFromEveryHundredth = 0.0;
        if (numbers.size() >= EVERY_HUNDRED_DIMENSION) {
            int count = 0;
            for (int i = (EVERY_HUNDRED_DIMENSION - 1); i < numbers.size(); i += EVERY_HUNDRED_DIMENSION) {
                sumOfEveryHundred += numbers.get(i);
                count++;
                averageFromEveryHundredth = (double) sumOfEveryHundred / count;
            }
        }
        return averageFromEveryHundredth;

    }

    private int calculateDifference(int number) {
        int difference = 0;
        if (numbers.size() >= 2) {

            int lastValue = numbers.get(numbers.size() - 2);
            difference = Math.abs(number - lastValue);
        }
        return difference;
    }

    private boolean calculateAlarm(int number, double average) {
        if (numbers.size() >= 2) {
            int lastValue = numbers.get(numbers.size() - 2);
            boolean isAlarm = (number > average * TEN_PERCENT_MORE
                    && number > lastValue * TWENTY_PERCENT_MORE);
            return isAlarm;
        }
        return false;
    }

    private boolean calculateWarning(int number) {
        boolean isWarning = (number < 0);
        return isWarning;
    }
}
