import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        // 1. Задача "Времена года".
        //    Человек с консоли вводит время года - выведите на экран, в чем выходить на улицу.
        //    (в чем конкретно выходить - определите сами, главное - работа с swtich)
        //
        //    2. Задача "Школьники". Есть три школьника: Афанисий, Петро, Зигмунд.
        //    Афанасий медленно думает, Петро медленно думает и плохо говорит, Зигмунд медленно думает, плохо говорит
        //    и ничего не слышит. С консоли вводится имя школьника.
        //    Выведите на экран все качества человека, имя которого ввели. (switch)
        //
        //    3. Создайте расписание на 5 дней (что будет в расписании мне не важно).
        //    Вводится номер дня - программа в ответ выводит все действия на этот день
        //    Можно использовать и switch и if. Выбирайте самостоятельно

        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        season = season.toLowerCase();

        switch (season) {
            case "winter":
                System.out.println("1");
                break;
            case "spring":
                System.out.println("2");
                break;
            case "summer":
                System.out.println("3");
                break;
            case "autumn":
                System.out.println("4");
                break;
            default:
                System.out.println("Неправильно введено");
        }

    }

}
