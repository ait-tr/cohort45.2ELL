import java.util.Arrays;
import java.util.Scanner;

public class ScannerArrayExample {

    public static void main(String[] args) {
        //создать массив длиной 7 элементов,
        //ввести 7 элементов с консоли
        //сохранить их в массив
        //просто вывести массив на экран

        int[] array = new int[7];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            int currentElement = array[i];

            if (currentElement % 2 == 0) {  //  i % 2 == 0
                System.out.println(currentElement);
            }
        }


        //1. Вывести элементы с нечетным индексом

        //2. Найти максимум и минимум массива размером в 100 элементов,
        // заполненного случайными значениями (random)

        //3. Найти количество элементов в массиве, которые больше, чем их соседи слева.
        //Сосед слева - элемент, который располагается ДО текущего элемента
        // [1, 5, 3, 7, 11] - Ответ: 3
        //Заполнить массив можно как угодно, главное - алгоритм

    }
}
