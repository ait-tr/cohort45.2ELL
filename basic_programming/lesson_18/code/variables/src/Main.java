import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Требования:
//    1. Приложение должно уметь считывать людей построчно.
//    2. Данные о людях могут храниться либо в файле, либо передаваться через консоль
//    3. Весь код должен быть написать в ООП-стиле
//    4. Приложение в результате своей работы должно ответить:
//        а. Сколько людей всего
//        б. Имя первого и последнего человека, которые придут на банкет
//        в. Самое длинное имя человека, среди тех, кто будет на банкете
//
//1. Main - он запускает наше приложение
//2. BanketReader - отвечает за чтение (сканирование) информации = абстрактным
//    а. BanketConsoleReader = отвечает за чтение из консоли, наследник класса BanketReader
//    б. BanketFileReader = отвечает за чтение из файла, наследник класса BanketReader
//3. ResultPrinter = печатает результаты на экран
//4. Person - описывает конкретного человека

public class Main {

    public static void main(String[] args) throws IOException {
        Picker picker = new Picker();
        BanketReader banketReader = picker.pickReader(); //подбираю подходящий ридер для пользователя

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество посетителей:");
        int countOfPerson = scanner.nextInt();                                    //сколько будет людей на мероприятии
        Person[] people = banketReader.readAll(countOfPerson);            // просим его прочитать кол-во строчек, сколько ввели

        ResultPrinter resultPrinter = new ResultPrinter(); //создать объект класса принтер
        resultPrinter.printResult(people); //попросить его напечатать результаты на экран
    }
}
