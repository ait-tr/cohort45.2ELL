
import java.util.Scanner;

/*
Пользователь вводит строку через консоль
    1.разделить строку на слова
    2. Из каждого слова возьмите первую букву и составьте из них строку,
        в которой содержались бы все первые буквы слов
    3. Напишите на экран размер получившейся строки
    4. а также первую и последнюю буквы слова
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Printer.EnterPrint();
        String string = scanner.nextLine();

        String[] strings = string.split(" ");

        Printer.StringsPrint(string);
        Printer.StringPrint();

        for (int i = 0; i < strings.length; i++) {
            char answer = strings[i].charAt(0);
            Printer.AnswerPrint(answer);
        }
        Printer.ResultPrint(strings.length, strings[0].charAt(0),
                strings[strings.length - 1].charAt(0));

        String poem = "Вот мысль, которой весь я предан,\n" +
                "Итог всего, что ум скопил.\n" +
                "Лишь тот, кем бой за жизнь изведан,\n" +
                "Жизнь и свободу заслужил.";

        Printer.StringsPrint(poem);

        String[] array = poem.split(" ");

        Printer.StringPrint();

        for (int i = 0; i < array.length; i++) {
            char answer = array[i].charAt(0);
            Printer.AnswerPrint(answer);
        }
        Printer.ResultPrint(array.length, array[0].charAt(0),
                array[array.length - 1].charAt(0));
    }

}
