package homework_24_05_21;

import java.util.Scanner;

public class Main_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();                              //константная сложность O(1)
        for (int i = 0; i < n * n; i++) {
            System.out.println(1);                              //квадратичная временная сложность O(n^2)
        }
    }
}
                                            //Общая сложность - квадратичная временная сложность O(n^2)