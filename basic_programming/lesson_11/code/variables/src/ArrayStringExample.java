import java.util.Arrays;

public class ArrayStringExample {

    public static void main(String[] args) {
        int[] a = new int[10];

        a[2] = 3;

        boolean[] b = new boolean[20];
        double[] c = new double[5];

        String[] strings = new String[3];
        strings[0] = null;
        strings[1] = "Привет";
        strings[2] = null;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));

        System.out.println(Arrays.toString(strings));
    }

}
