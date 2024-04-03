import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int[] array = new int[10]; //массив из целых чисел размером в 10 элементов

        array[0] = 44;
        array[9] = 33;
        array[4] = 34;
        array[7] = array[0] + array[9];
        array[8]++;

        //array++; //неправильно
        //array[5] = array; //неправильно

        a = 44;

        System.out.println(a);
        System.out.println(Arrays.toString(array));
    }
}
