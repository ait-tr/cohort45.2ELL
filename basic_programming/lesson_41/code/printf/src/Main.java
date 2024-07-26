import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String name = scanner.nextLine();
        //int age = scanner.nextInt();

        //%s - строка
        //%d - целое число
        //%f - дробное
        //%b - булево

        double a = 5.43678964;

        String str = String.format("%.3f", a);
        System.out.println(str);


        //System.out.printf("Привет, %s! Тебе %d лет!", name, age);



        System.out.printf("%.3f", a);
    }
}
