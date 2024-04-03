import java.util.Arrays;
import java.util.Random;

public class FirstTask {

    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[1_000_000];

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 100);
            System.out.println(array[i]);
        }

        //1-ый
        //i-ый, j-ый



        //System.out.println(Arrays.toString(array));
    }
}
