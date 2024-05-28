import java.util.Arrays;
import java.util.Random;

/*
 Домашнее задание 24.05.23
    (Постарайтесь написать код не подглядывая в классную работу)
    1. Необходимо сгенерировать 100 чисел и положить их в массив
    2. Самостоятельно отсортировать этот массив:
    2.1 Один раз сортировкой пузырьком
    2.2 Один раз - сортировкой выбором
    Доп. задание:
    3.1. Посчитать количество операций в обоих сортировках
    3.2. Самостоятельно понять, как "засекать" время в java
    и узнать время выполнения обоих сортировок
 */
public class Main_Bubble_Sort {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(array));

        int counter = 0;
        long nanoTime = System.nanoTime();

        for (int j = 0; j < array.length - 1; j++) {
            for (int k = 0; k < array.length - 1; k++) {
                counter++;
                if (array[k] > array[k + 1]) {
                    int temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                }
            }
        }

        nanoTime = System.nanoTime() - nanoTime;

        System.out.println(Arrays.toString(array));
        System.out.println("Количество операций равно :  " + counter);
        System.out.println("Время выполнения сортировки равно :  "
                + nanoTime + "  наносекунд  или  "
                + nanoTime * 0.000000001 + "  секунд");
    }
}
