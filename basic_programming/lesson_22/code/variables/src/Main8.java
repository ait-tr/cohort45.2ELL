import java.util.Scanner;

public class Main8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();  //O(1)
        for (int i = 0; i < number; i++) {                                      //O(1)
            for (int j = 0; j < number; j++) {
                System.out.println("i = " + i + " j= " + j);
            }
        }
        //кол-во операций y = x^2 + 2
        //O(n^2) - квадратичная временная сложность
    }
}
