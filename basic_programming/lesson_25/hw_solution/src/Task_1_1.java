import java.util.Arrays;
import java.util.Scanner;
/*
   1.Пользователь вводит 10 чисел с консоли
   Соберите их в массив и отсортируйте (любым способом, кроме заложенных в джава)
   Бинарным поиском найдите число в этом массиве, которое пользователь введет 11ым
   Вывести результат (индекс) на экран

   Усложнения:
   1. Вводится не 10 чисел, а строка содержащая числа, записанные через пробелы
   2. Бинарный поиск обязательно должен быть реккурсивным
    */
public class Task_1_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи 10 любых целых чисел : ");

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(array));

        Sort.insertionSort(array);
        System.out.println(Arrays.toString(array));

        System.out.println("Введи любое число : ");
        int number = scanner.nextInt();

        int i = Search.binarySearch(array, number);
        System.out.println("Число " + number + " находится под " + i + "-м индексом");
    }
}
