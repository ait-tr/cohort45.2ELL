import java.util.Scanner;

public class NightClubSecurity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст:");
        int age = scanner.nextInt();
        System.out.println("Можете ли вы документально его подтвердить?");
        boolean hasPassport = scanner.nextBoolean();

        boolean securityResult = hasPassport && (age >= 18) && (age < 95) || age == 12345678;
        //И - умножить
        //Или - сложить

        System.out.println("Результат проверки: " + securityResult);

        //Если вместо возраста будет введен специальный код 12345678, то тогда пускай без проверки

        //добавить ко всем уже готовым ограничениям, еще одно - человек должен быть моложе 95 лет
        //И

        //Допольнительно, для тех, кто уже сделал:
        //Возраст не должен быть равен 21 и 22 (владельцу кажется, что часто когда обманывают, используют этот возраст)

    }
}
