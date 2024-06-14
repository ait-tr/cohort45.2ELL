import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task {

    public static void main(String[] args) {
        //Пользователь вводит имена людей, если такой человек уже был введен - напишите на экран "повторный ввод"
        //если такого человека не было написано ранее, выведите "ОК"

        Set<String> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String string = scanner.nextLine();

            if (set.contains(string)) {
                System.out.println("повторный ввод");
            }
            else {
                set.add(string);
                System.out.println("ОК");
            }

        }


        //Вводится 5 чисел. Напишите "Yes", если они не все равны между собой.
        //Нужно использовать set и нельзя писать в if условие (1 == 2 и 2 == 3 и 3 == 4), contains тоже нельзя

        //Вводится день недели. Напишите тип это дня (выходной или рабочий). Используйте для этого set.
        //Если такого дня не существует - напишите "Ошибка".

    }
}
