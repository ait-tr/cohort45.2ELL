import java.util.Scanner;

public class MaxTask {

    public static void main(String[] args) {
        //! - НЕ !a - унарные
        //&& || - a && b - бинарные
        //тернарные - 3 переменных (операнды)


        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        int max = (first > second) ? first : second;

        //if (first > second) {
        //    max = first;
        //}
        //else {
        //    max = second;
        //}

        System.out.println(max);





    }
}
