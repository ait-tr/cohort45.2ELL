import java.util.Scanner;

public class HomeworkSecond {

    public static void main(String[] args) {
        //    2. Задача "Школьники". Есть три школьника: Афанисий, Петро, Зигмунд.
        //    Афанасий медленно думает, Петро медленно думает и плохо говорит, Зигмунд медленно думает, плохо говорит
        //    и ничего не слышит. С консоли вводится имя школьника.
        //    Выведите на экран все качества человека, имя которого ввели. (switch)

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        name = name.toLowerCase();

        switch (name) {
            case "зигмунд":
                System.out.println("Ничего не слышит");
            case "петро":
                System.out.println("Плохо говорит");
            case "афанисий":
                System.out.println("Медленно думает");

        }
    }

}
