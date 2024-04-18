package homework_24_04_11;

import java.util.Scanner;

/*
1. Пользователь вводит три числа, программа выводит на экран:
1.1 Произведение всех чисел (*)
1.2 Сумма все чисел (+)
 примечание: разрешено делать без использование допольнительных методов (все можно написать в main)

2. Пользователь после ввода трех чисел (которые вы уже обработали сверху), вводит четвертое число
2.1 Если ввел 1, то выводим на экран произведение (*) трех чисел
2.2 Если пользователь ввел 2, то выводим сумму трех чисел (+)
2.3 Разделить логически на 1-2 дополнительных метода (разрешается использовать все типы методов)

3. Разделить программу, написанную в пункте 2 еще больше. Добавить 1-2 метода, которые возвращают значение
(выбрать самостоятельно, что вы выдели)
 */
public class Main02 {
    public static int add(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;
    }

    public static int multiply(int num1, int num2, int num3) {
        int multiplication = num1 * num2 * num3;
        return multiplication;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа :  ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println("Выберите что нужно сделать :\n1) умножить\n2) прибавить");
        int action = scanner.nextInt();
        if (action == 1) {
            System.out.println("Произведение чисел равно :  " + multiply(num1, num2, num3));
        } else if (action == 2) {
            System.out.println("Сумма чисел равна :  " + add(num1, num2, num3));
        }
    }
}
