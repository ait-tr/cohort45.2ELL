import java.util.Arrays;
import java.util.Random;

public class OldHomework {

    public static void main(String[] args) {
        // Домашнее задание:
        // (Постарайтесь написать код не подглядывая в классную работу)
        //
        // 1. Необходимо сгенерировать 100 чисел и положить их в массив
        // 2. Самостоятельно отсортировать этот массив:
        // 2.1 Один раз сортировкой пузырьком
        // 2.2 Один раз - сортировкой выбором
        //
        // //Доп. задание:
        //
        // //3.1. Посчитать количество операций в обоих сортировках
        // //3.2. Самостоятельно понять, как "засекать" время в java и узнать время выполнения обоих сортировок

        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(0, 100);
        }

        Sorting sorting = new Sorting();
        long start = System.nanoTime();
        array = sorting.selectionSort(array);
        long finish = System.nanoTime();

        System.out.println(finish - start);
        System.out.println(Arrays.toString(array));
    }
}
