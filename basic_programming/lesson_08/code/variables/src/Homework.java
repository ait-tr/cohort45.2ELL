import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        //    1) В консоль вводится число, если оно больше 1000, то выводите сообщение "Я богат",
        //     если больше 10000, то "я ультра богат"
        //
        //    2) К первой задаче добавляем: "Если введено больше 100 000, то пишем на экран
        //     "я могу купить, все что хочу"

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x >= 1_000 && x < 10_000) {
            System.out.println("я богат");
        }

        if (x >= 10_000 && x < 100_000) {
            System.out.println("Я ультра богат");
        }

        if (x >= 100_000) {
            System.out.println("я могу купить, все что хочу");
        }
    }
}
