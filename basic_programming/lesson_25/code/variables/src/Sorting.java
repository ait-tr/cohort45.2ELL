public class Sorting {

    public int[] bubbleSort(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

        return array;
    }

    public int[] selectionSort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            int min = array[j];
            int minIndex = j;
            for (int i = j; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                    minIndex = i;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[j];
            array[j] = temp;
        }

        return array;
    }


}
