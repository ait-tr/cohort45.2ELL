import java.util.Arrays;
import java.util.Scanner;

public class SecondSolvedHomework {
    //Задание 2.
    //1. Пользователь вводит строку вида: "число знак число". Например:
    //а) 4 + 4
    //б) 23 * 78
    //в) 12 / 45
    //г) 3 - 7
    //2. Рассчитайте значение числового выражения
    //3. Для помощи: можете воспользоваться методами Integer.parseInt, split, equals


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        String[] strings = expression.split(" ");
        int firstNumber = Integer.parseInt(strings[0]);
        int secondNumber = Integer.parseInt(strings[2]);

        switch (strings[1]) {
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "/":
                System.out.println(firstNumber / secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
        }


    }
}
