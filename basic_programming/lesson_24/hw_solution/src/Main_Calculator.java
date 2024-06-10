import java.util.Scanner;

/*
1. Пользователь вводит строку вида: "число знак число". Например:
а) 4 + 4
б) 23 * 78
в) 12 / 45
г) 3 - 7
2. Рассчитайте значение числового выражения
3. Для помощи: можете воспользоваться методами Integer.parseInt, split, equals
 */
public class Main_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Printer.printExample();
        String example = scanner.nextLine();

        String[] array = example.split(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        double a = Integer.parseInt(array[0]);
        double b = Integer.parseInt(array[array.length - 1]);

        String sum = "+";
        String multiplication = "*";
        String division = "/";
        String subtracting = "-";

        if (array[1].equals(sum)) Printer.printAnswers(a + b);
        if (array[1].equals(multiplication)) Printer.printAnswers(a * b);
        if (array[1].equals(division)) Printer.printAnswers(a / b);
        if (array[1].equals(subtracting)) Printer.printAnswers(a - b);
    }
}
