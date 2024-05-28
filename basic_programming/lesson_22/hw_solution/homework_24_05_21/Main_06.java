package homework_24_05_21;

import java.util.Scanner;

public class Main_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();                                  //константная сложность O(1)
        for (int i = 0; i < n * n * 0; i++) {
            System.out.println(1);                                  //константная сложность O(1)
        }
        System.out.println("Число \"n\" равно  "+n);
        System.out.println("В данном случае цикл не выполнится ни разу, " +
                "\nпо сути код является бессмысленным! ");
    }
}
                                                //Общая сложность - константная сложность O(1)