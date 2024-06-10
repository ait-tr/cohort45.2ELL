import java.util.List;

public class Printer {
    public static void printTemperatureValues(List<Integer> a) {
        System.out.println("Введённые вами числа :  " + a);
    }

    public static void printCalculateAverageValue(double b, double a) {
        System.out.println("Сумма :  " + b);
        System.out.println("Среднее значение температуры ядерного реактора за ВСЕ время :  "
                + a + "  градуса(ов) Цельсия");
    }

    public static void printCalculateAbsoluteDifference(double c) {
        System.out.println("Текущая введенная температура отличается от предыдущей на :  "
                + c + "  градуса(ов) Цельсия");
    }

    public static void printPreviousValue(double a) {
        System.out.println("Предпоследнее значение :  " + a + "  градуса(ов) Цельсия");
    }

    public static void printLastValue(double a) {
        System.out.println("Последнее значение :  " + a + "  градуса(ов) Цельсия");
    }

    public static void printCalculateDifferenceValue(double d, double e) {
        System.out.println("Разница между последним и средним значением   "
                + d + "  градуса(ов) Цельсия");
        System.out.println("Разница между последним и предпоследним значением   "
                + e + "  градуса(ов) Цельсия");
    }

    public static void printWarning() {
        System.out.println("Тревога, превышение температуры!!!");
    }

    public static void printCalculateAverageOfTheLastTen(double a) {
        System.out.println("Средняя температура за 10 последних измерений :  "
                + a + "  градуса(ов) Цельсия");
    }

    public static void printFirstCondition() {
        System.out.println("чтобы получиь корректнй ответ, введите не менее десяти значений!");
    }

    public static void printCalculateAverageTemperatureFromEveryHundredth(double a) {
        System.out.println("Средняя температура каждого 100-ого измерения :  "
                + a + "  градуса(ов) Цельсия");
    }

    public static void printSecondCondition() {
        System.out.println("чтобы получиь корректнй ответ, введите не менее ста значений!");
    }
}
