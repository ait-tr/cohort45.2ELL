import java.io.FileNotFoundException;
import java.util.Scanner;

public class Picker {

    public BanketReader pickReader() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите, откуда получать данные: 1 - файл, 2 - консоль");
        int switcher = scanner.nextInt();//считываем, откуда будем брать данные. 1 - файл. 2 - консоль
        scanner.nextLine();

        BanketReader banketReader = null;                       //объявление "коробки" для хранения ридера

        if (switcher == 1) {      //выбор нужного ридера
            System.out.println("Введите имя файла: ");
            String str = scanner.nextLine();
            banketReader = new BanketFileReader(str);
        }

        if (switcher == 2) {                                   //выбор нужного ридера
            banketReader = new BanketConsoleReader();
        }

        return banketReader;
    }
}
