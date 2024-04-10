public class ArraySecondExample {

    public static void main(String[] args) {
        int[] array = {4, 5, -5, 6, -2};

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.println(i);
                System.out.println(array[i]);
                System.out.println("------------------");
            }
        }
    }
}
