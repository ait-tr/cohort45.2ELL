//Пользователем вводится строка,
//возьмите первый и последний символы строки. Конкатенируйте их (сложите)
//повторите полученную строку 5 раз
//Если в строке есть буква "a" замените ее на буквы "b"
//оставьте только последние 5 символов
//Выведите на экран символ под номером 2

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        int size = string.length();
        String first = string.substring(0, 1);
        String last = string.substring(size - 1, size);

        System.out.println(first);
        System.out.println(last);

        String result = first + last;
        System.out.println(result);

        result = result.repeat(5);
        System.out.println(result);

        result = result.replace("a", "b");
        System.out.println(result);

        result = result.substring(result.length() - 5);
        System.out.println(result);

        char symbol = result.charAt(2);
        System.out.println(symbol);
    }



    //1.
    //Пользователь вводит строку
    //Разделите строку на слова
    //В каждом слове оставьте только первую букву
    //Сложите все первые буквы слов в одно слово
    //Напишите на экран размер получившейся строки, а также первую и последнюю буквы слова

    //2.
    //Пользователь вводит строку вида:
    //число знак число
    //Выведите ответ на выражение
    //4 + 4
    //23 * 78
    //12 / 45
    //3 - 7

    //Integer.parseInt, split, equals


}
