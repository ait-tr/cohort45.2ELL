public class FindTask {

    public static void main(String[] args) {
        int[] array = {56, 73, 7, 4, 34, 89, 101};
        int element = 1000;
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}
