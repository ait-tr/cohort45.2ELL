package homework_24_04_23;

//Сделать класс-утилиту (на будущее, для последующих заданий)
//2 статических метода
//оба возвращают double
//Один принимает 2 дробных числа, второй принимает 3 дробных числа
//Оба метода считают среднее значение, один среди трех чисел, другой среди двух чисел
public class CalculatorUtils {
    public static double averageOfThree(double a, double b, double c) {
        return  (a + b + c) / 3.0;

    }

    public static double averageOfTwo(double a, double b) {
        return  (a + b) / 2.0;
        //double averageOfTwoNumbers = (a + b) / 2.0;
        //return averageOfTwoNumbers;
    }
}
