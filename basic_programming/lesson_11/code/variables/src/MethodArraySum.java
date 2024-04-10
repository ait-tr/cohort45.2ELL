public class MethodArraySum {

    public static void main(String[] args) {
        int[] array = {4, 5, -6, 4};

        int result = sumOfAllElements(array);
        System.out.println(result);

        int[] array2 = {5, 6, 7, 2, 10};
        int result2 = sumOfAllElements(array2);
        System.out.println(result + result2);

    }

    public static int sumOfAllElements(int[] a) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return sum;
    }
}
