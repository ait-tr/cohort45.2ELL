public class Main {

    public static void main(String[] args) {
        int[] array = {3, 4, 78, 1, 45, 7};

        //сумма всех элементов
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println(sum);


        //самый большой элемент
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println(max);


        //самый маленький элемент
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println(min);


    }
}
