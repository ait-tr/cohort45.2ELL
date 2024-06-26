
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MainDaysOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> weekDays = new TreeSet<>();
        weekDays.add("понедельник");
        weekDays.add("вторник");
        weekDays.add("среда");
        weekDays.add("четверг");
        weekDays.add("пятница");
        weekDays.add("суббота");
        weekDays.add("воскресенье");

        System.out.print("Введите день недели: ");
        String day = scanner.nextLine().toLowerCase();

        if (weekDays.contains(day)) {
            if (day.equals("суббота") || day.equals("воскресенье")) {
                System.out.println("Выходной день");
            } else {
                System.out.println("Рабочий день");
            }
        } else {
            System.out.println("Ошибка");
        }
    }
}
