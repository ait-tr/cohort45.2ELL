import java.util.Scanner;

public class Main {

    //if (условие) {
    //  какой-то код, который выполнится, если условие верно
    //}

    //Random

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        //boolean b = (a > 0);

        if (a > 0) {
            System.out.println("Положительное число!");
        } else if (a == 0) {
            System.out.println("Ноль");
        } else {
            System.out.println("Отрицательное число!");
        }



        //if (a < 0) {
        //    System.out.println("Отрицательное число!");
        //}
//
        //if (a == 0) {
        //    System.out.println("Ноль");
        //}

    }
}
