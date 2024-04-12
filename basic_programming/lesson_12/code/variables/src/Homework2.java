import java.util.Random;

public class Homework2 {

    //    2. Создать массив размером в 100 элементов, заполнить его случайными значениями (random).
    //    Найти максимум и минимум массива и вывести их на экран.
    //
    //    3. Создать массив, заполнить его любым образом. Найти количество элементов в массиве, которые больше, чем их соседи слева.
    //    Сосед слева - элемент, который располагается ДО текущего элемента
    //    Пример : [1, 5, 3, 7, 11] - Ответ: 3

    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        int max = Integer.MIN_VALUE; //нужно будет поправить
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}
