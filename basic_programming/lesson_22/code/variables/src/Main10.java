import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();  //O(1)

        for (int i = 0; i < number * number; i++) { //O(n^2)
            System.out.println(number);
        }

        //O(N^2)
    }
}
