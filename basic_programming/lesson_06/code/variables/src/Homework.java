import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        System.out.println("Приветствуем в CurrencyConverter!");
        System.out.println();
        System.out.println("Выберите исходную валюту:");
        System.out.println("1. EURO");
        System.out.println("2. USD");
        System.out.println("3. TL");

        double yenToEuro = 2.3;
        double yenToUSD = 4.8;
        double yenToLira = 0.23;

        Scanner scanner = new Scanner(System.in);
        int currency = scanner.nextInt();

        System.out.println("Введите, сколько денег хотите поменять:");
        int amount = scanner.nextInt();


        //3 задачи
        //1) В консоль вводится число, если оно больше 1000, то выводите сообщение "Я богат",
        // если больше 10000, то "я ультра богат"

        //2) К задаче номер 1 добавляем: "Если введено больше 10 000, то пишем на экран
        // "я могу купить, все что хочу"


        //3) Доделать конвертер валют. Теперь, после ввода валюты и количества денег, вы должны
        //посчитать, сколько денег получит человек в выбранной валюте.
        //Используйте условные операторы для выбора нужных переменных











    }
}
