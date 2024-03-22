import java.util.Scanner;

public class Divide {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        //if-else

        if (x % 2 == 0) {
            System.out.println("Четное число");
        }
        else {
            System.out.println("Нечетное число");
        }


        //if (x % 2 != 0) {
        //    System.out.println("Нечетное число");
        //}
    }
}
