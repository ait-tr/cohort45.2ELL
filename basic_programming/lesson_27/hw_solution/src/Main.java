import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Температура внутри ТВЭЛ-ов ядерного реактора достигает от 600 и до 2500 градусов С.

public class Main {
    public static void main(String[] args) {

        List<Integer> temperatureValues = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int value = scanner.nextInt();
            if (value == -1) {
                break;
            }
            temperatureValues.add(value);
        }
        Printer.printTemperatureValues(temperatureValues);

        double averageValue = 0;
        double sum = 0;
        double previousValue = temperatureValues.get(temperatureValues.size() - 2);
        double lastValue = temperatureValues.get(temperatureValues.size() - 1);
        Printer.printPreviousValue(previousValue);
        Printer.printLastValue(lastValue);

        CalculatorUtils.calculateAbsoluteDifference(lastValue, previousValue);

        CalculatorUtils.calculateDifferenceValue(lastValue,
                CalculatorUtils.calculateAverageValue(temperatureValues, averageValue,
                        sum, temperatureValues.size()), previousValue);

        double averageOfTheLastTen = 0;
        double sumOfTheLastTen = 0;
        CalculatorUtils.calculateAverageOfTheLastTen(temperatureValues, averageOfTheLastTen,
                sumOfTheLastTen, temperatureValues.size(), 10);

        double averageTemperatureFromEveryHundredth = 0;
        double sumFromEveryHundredth = 0;
        CalculatorUtils.calculateAverageTemperatureFromEveryHundredth(temperatureValues,
                averageTemperatureFromEveryHundredth, sumFromEveryHundredth,
                temperatureValues.size(), 100);
    }
}
