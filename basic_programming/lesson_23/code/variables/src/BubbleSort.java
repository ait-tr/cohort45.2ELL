import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {56, 73, 7, 4, 34, 89, 10};

        System.out.println(Arrays.toString(array));

        //O(1)


        for (int j = 0; j < array.length - 1; j++) { //O(n)
            boolean isChanged = false;
            for (int i = 0; i < array.length - 1 - j; i++) { //O(n)
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isChanged = true;
                }
            }
            if (!isChanged) {
                break;
            }
        }

        //O(n^2)
        //quick-sort O(log n * n)



        System.out.println(Arrays.toString(array));

    }
}
