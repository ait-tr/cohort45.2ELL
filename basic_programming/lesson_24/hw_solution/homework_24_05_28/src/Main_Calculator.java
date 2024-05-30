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
        System.out.println("Введите пример в формате: " +
                "\n\"число знак число\". " +
                "\nНапример:  " +
                "а) 4 + 4  " +
                "б) 23 * 78  " +
                "в) 12 / 45  " +
                "г) 3 - 7");
        String example = scanner.nextLine();
        String[] array = example.split(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        double a = Integer.parseInt(array[0]);
        double b = Integer.parseInt(array[array.length - 1]);
        double res;
        String sum = "+";
        String multiplication = "*";
        String division = "/";
        String subtracting = "-";

        if (array[1].equals(sum)) {
            res = a + b;
            System.out.println(" = " + res);
        } else if (array[1].equals(multiplication)) {
            res = a * b;
            System.out.println(" = " + res);
        }else if (array[1].equals(division)) {
            res = a / b;
            System.out.println(" = " + res);
        }else if (array[1].equals(subtracting)) {
            res = a - b;
            System.out.println(" = " + res);
        }
    }
}
