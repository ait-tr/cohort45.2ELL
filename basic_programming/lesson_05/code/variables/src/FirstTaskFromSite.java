import java.util.Scanner;

public class FirstTaskFromSite {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        //(Кратен 4 И НЕ Кратен 100) ИЛИ (Кратен 400)

        boolean multiplicityForFour = year % 4 == 0;
        boolean multiplicityForHundred = year % 100 == 0;
        boolean multiplicityForFourHundreds = year % 400 == 0;
        boolean result = multiplicityForFour && !multiplicityForHundred || multiplicityForFourHundreds;

        boolean secondResult = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);

        System.out.println(result);
        System.out.println(secondResult);


        //Напомним, что год является високосным, если его номер кратен 4, но не кратен 100,
        // а также если он кратен 400.)

        //(Кратен 4 И НЕ Кратен 100) ИЛИ (Кратен 400)
        //365,24

        //2000 - В
        //1996 - В
        //1992 - В
        //1988 - В
        //1984 - В
        //....
        //....
        //....
        //....
        //1904 -В
        //1900


    }
}
