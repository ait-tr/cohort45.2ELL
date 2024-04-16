package homework_24_04_04;
/*
3. Сделать метод, который принимает массив из целых чисел(!!!!)
и в нем находит максимальное значение.
Выводит его на экран
3.1. Сделать метод, который принимает массив из целых чисел(!!!!)
и в нем находит среднее значение.
Выводит его на экран
 */
public class Main03 {
    public static void findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное значение равно :  " + max);
    }

    public static void findAverage(int[] array) {
        double sum = 0;
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            average = sum / array.length;
        }
        System.out.println("Среднее значение равно : " + average);
    }

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99, 0};
        findMax(array);
        findAverage(array);
    }
}
