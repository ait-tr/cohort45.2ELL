import java.util.Scanner;
/*
    2. Пользователь вводит два числа - начальное и конечное число.
        Выведите на экран все числа в этом промежутке,
        НО решить необходимо только с использование реккурсии
     */
public class RecursiveSearchTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи два числа - начальное и конечное : ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Числа в промежутке от " +
                "начального до коночного (включительно) : ");
        Search.recursion(a, b + 1);
    }
}
