public class HomeworkThird {

    //3. Сделать метод, который принимает массив из целых чисел(!!!!) и в нем находит максимальное значение. Выводит его на экран
    //3.1. Сделать метод, который принимает массив из целых чисел(!!!!) и в нем находит среднее арифметическое
    // значение. Выводит его на экран

    public static void main(String[] args) {
        int[] array = {1, 5, -1, 5, 78};
        findMax(array);
        findAverage(array);
    }

    public static void findMax(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println(max);
    }

    public static void findAverage(int[] array) {
        double sum = 0.0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println(sum / array.length);
    }

}
