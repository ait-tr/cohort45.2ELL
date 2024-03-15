import java.util.Scanner;

public class SecondScannerExample {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pension = s.nextInt();
        int obligation = s.nextInt();

        int result = pension + obligation;

        System.out.println(result);


        //В этом же приложении, где вы начали делать обменник валют,
        //1. Добавить 3 переменных double - курсами валют к заданным.
        //йена - евро 2,3
        //йена - доллару 4,1
        //йена - злотым 0,35

        //2. Создаем сканнер и считывем цифру - какую валюту будем менять
        //		1.	EURO
        //		2.	USD
        //		3.	TL

        //3. Считываем цифру - сколько денег меняем

        // ------------

        //4. Вывести на экран - сколько денег получим



    }
}
