
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
        System.out.println("Введите сюда что-нибудь: ");
        String string = scanner.nextLine();
        String[] arr = string.split(" ");
        System.out.println(string);
        System.out.println();

        System.out.print("Строка из первых букв слов:  ");

        for (int i = 0; i < arr.length; i++) {
            char answer = arr[i].charAt(0);
            System.out.print(answer + "  ");
        }
        System.out.println("\nРазмер получившейся строки:  " + arr.length + "  символ(а, ов)");
        System.out.println("Первая буква строки:  " + arr[0].charAt(0));
        System.out.println("Последняя буква строки:  " + arr[arr.length - 1].charAt(0));
        System.out.println("________________________________");
        System.out.println();

        String poem = "Вот мысль, которой весь я предан,\n" +
                "Итог всего, что ум скопил.\n" +
                "Лишь тот, кем бой за жизнь изведан,\n" +
                "Жизнь и свободу заслужил.";
        System.out.println(poem);
        System.out.println();

        String[] array = poem.split(" ");

        System.out.print("Строка из первых букв слов:  ");

        for (int i = 0; i < array.length; i++) {
            char answer = array[i].charAt(0);
            System.out.print(answer + "  ");
        }
        System.out.println("\nРазмер получившейся строки:  " + array.length + "  символов");
        System.out.println("Первая буква строки:  " + array[0].charAt(0));
        System.out.println("Последняя буква строки:  " + array[array.length - 1].charAt(0));
    }
}
