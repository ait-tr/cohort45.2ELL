import java.util.Scanner;

public class HomeworkSecond {

    //1. Пользователь вводит три числа, программа выводит на экран:
    //1.1 Произведение всех чисел (*)
    //1.2 Сумма все чисел (+)
    // примечание: разрешено делать без использование допольнительных методов (все можно написать в main)
    //
    //2. Пользователь после ввода трех чисел (которые вы уже обработали сверху), вводит четвертое число
    //2.1 Если ввел 1, то выводим на экран произведение (*) трех чисел
    //2.2 Если пользователь ввел 2, то выводим сумму трех чисел (+)
    //2.3 Разделить логически на 1-2 дополнительных метода (разрешается использовать все типы методов)
    //
    //3. Разделить программу, написанную в пункте 2 еще больше. Добавить 1-2 метода, которые возвращают значение
    //(выбрать самостоятельно, что вы выдели)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int operation = scanner.nextInt();

        printAnswer(first, second, third, operation);
    }

    public static void printAnswer(int first, int second, int third, int operation) {
        if (operation == 1) {
            int multiply = multiply(first, second, third);
            System.out.println(multiply);
        }

        if (operation == 2) {
            int sum = sum(first, second, third);
            System.out.println(sum);
        }
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
}
