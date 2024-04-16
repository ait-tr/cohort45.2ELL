package homework_24_04_11;

import java.util.Scanner;

/*
1. Пользователь вводит три числа, программа выводит на экран:
1.1 Произведение всех чисел (*)
1.2 Сумма все чисел (+)
 примечание: разрешено делать без использование допольнительных методов (все можно написать в main)
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа :  ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int sum = num1 + num2 + num3;
        int productOfNumbers = num1 * num2 * num3;
        System.out.println("Сумма чисел равна :  " + sum + "\nПроизведение чисел равно :  " + productOfNumbers);
    }
}
