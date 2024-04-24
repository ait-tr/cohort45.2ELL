package homework_24_04_18;

//Сделать класс-утилиту (на будущее, для последующих заданий)
//2 статических метода
//оба возвращают double
//Один принимает 2 дробных числа, второй принимает 3 дробных числа
//Оба метода считают среднее значение, один среди трех чисел, другой среди двух чисел
public class CalculatorUtils {
    public static double averageOfThree(double a, double b, double c) {
        double averageOfThreeNumbers = (a + b + c) / 3;
        return averageOfThreeNumbers;
    }

    public static double averageOfTwo(double a, double b) {
        double averageOfTwoNumbers = (a + b) / 2;
        return averageOfTwoNumbers;
    }
}
