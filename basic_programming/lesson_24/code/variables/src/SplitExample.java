import java.util.Arrays;

public class SplitExample {

    public static void main(String[] args) {
        int[] a = {3 , 4, 5};

        System.out.println(Arrays.toString(a));

        String pushkin = "У Лукоморья дуб зеленый, златая цепь на дубе том";
        String[] array = pushkin.split("");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

