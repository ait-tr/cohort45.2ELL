import java.util.Scanner;

public class ThirdMain {

    public static void main(String[] args) {

        if (0 == 1); {
            System.out.println(123);
        }



        //Считывать числа с консоли, пока человек не введет ноль
        Scanner scanner = new Scanner(System.in);
        int value;

        do {
            value = scanner.nextInt();
        } while (value != 0);




        //int value = scanner.nextInt();
        while (value != 0) {
            value = scanner.nextInt();
        }

        //while - цикл, который может выполниться даже 0 раз (может не выполниться)
        //do-while - цикл, который выполнится хотя бы 1 раз всегда

    }
}
