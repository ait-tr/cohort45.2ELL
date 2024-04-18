package homework_24_04_11;

import java.util.Scanner;

/*
3. Разделить программу, написанную в пункте 2 еще больше. Добавить 1-2 метода, которые возвращают значение
(выбрать самостоятельно, что вы выдели)
 */
public class Main03 {
    public static int add(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;
    }

    public static int multiply(int num1, int num2, int num3) {
        int multiplication = num1 * num2 * num3;
        return multiplication;
    }

    public static void selectAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа :  ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Выберите что нужно сделать :\n1) умножить\n2) прибавить");
        int action = scanner.nextInt();
        if (action == 1) {
            System.out.println("Произведение чисел равно :  " + multiply(a, b, c));
        } else if (action == 2) {
            System.out.println("Сумма чисел равна :  " + add(a, b, c));
        }
    }

    public static void main(String[] args) {
        selectAction();
    }
}
