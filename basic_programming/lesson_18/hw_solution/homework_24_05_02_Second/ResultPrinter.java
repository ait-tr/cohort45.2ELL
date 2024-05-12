package homework_24_05_02_Second;

import java.util.Arrays;

public class ResultPrinter {

    public void printEvenTxt() {
        System.out.print("       Чётные числа:   ");
    }

    public void printEvenNumber(int evenNumbers) {
        System.out.print(evenNumbers + "  ");
    }

    public void printResult(int sum, int minNumber, int maxNumber, int count, int[] returnedArr) {

        System.out.print("\n              Сумма:   " + sum);
        System.out.print("\n  Минимальное число:   " + minNumber);
        System.out.print("\n Максимальное число:   " + maxNumber);
        System.out.println();
        System.out.println("Количество чисел больше соседа слева и меньше соседа справа:  " + count);
        System.out.println("Возвращённый массив:   " + Arrays.toString(returnedArr));
    }
}
