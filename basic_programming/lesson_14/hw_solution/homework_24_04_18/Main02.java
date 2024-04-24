package homework_24_04_18;

public class Main02 {

    public static void main(String[] args) {
        double res = CalculatorUtils.averageOfTwo(2.2, 6.6);

        double res2 = CalculatorUtils.averageOfThree(4, 16, 64);
        System.out.println("Среднее значение из двух чисел :  " + res + "\nСреднее значение из трёх чисел :  " + res2);
    }
}
