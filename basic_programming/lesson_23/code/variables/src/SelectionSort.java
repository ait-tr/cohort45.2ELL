import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {56, 73, 7, 4, 34, 89, 101};


        for (int j = 0; j < array.length; j++) {
            int min = array[j];
            int index = j;

            for (int i = j; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                    index = i;
                }
            }
            int temp = array[j];
            array[j] = array[index];
            array[index] = temp;
        }

        //Домашнее задание
        //Постарайтесь написать код не подглядывая в классную работу (по возможности)

        //Сгенерировать 100 чисел и положить их в массив.
        //Самостоятельно отсортировать этот массив - один раз сортировкой пузырьком
        //Один раз - сортировкой выбором

        //Доп. задание:

        //1. Посчитать количество операций в обоих сортировках
        //2. Самостоятельно понять, как "засекать" время в java и узнать время выполнения обоих сортировок



        //328
        //324


        System.out.println(Arrays.toString(array));




    }
}
