import java.util.List;

public class CalculatorUtils {

    public static double calculateAverageValue(
            List<Integer> list, double a, double b, int c) {
        for (int i = 0; i < c; i++)
            b += list.get(i);
        a = b / c;
        Printer.printCalculateAverageValue(b, a);
        return a;
    }

    public static void calculateAbsoluteDifference(double a, double b) {
        double c = Math.abs(a - b);
        Printer.printCalculateAbsoluteDifference(c);
    }

    public static void calculateDifferenceValue(double a, double b, double c) {
        double d = a - b;
        double e = a - c;
        Printer.printCalculateDifferenceValue(d, e);
        if (d > ((b * 0.1) + b)
                && e > ((c * 0.2) + c))
            Printer.printWarning();
    }

    public static void calculateAverageOfTheLastTen(
            List<Integer> list, double a, double b, int c, int d) {
        if (c >= d) {
            int i;
            for (i = c - 1; i > c - (d + 1); i--)
                b += list.get(i);
            a = b / d;
            Printer.printCalculateAverageOfTheLastTen(a);
        } else {
            Printer.printFirstCondition();
        }
    }

    public static void calculateAverageTemperatureFromEveryHundredth(
            List<Integer> list, double a, double b, int c, int d) {
        if (c >= d) {
            int i;
            for (i = d - 1; i < c; i += d)
                b += list.get(i);
            a = b / ((c) / d);
            Printer.printCalculateAverageTemperatureFromEveryHundredth(a);
        } else {
            Printer.printSecondCondition();
        }
    }
}
