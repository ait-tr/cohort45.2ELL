import java.util.Scanner;

public class SwitchMain {

    public static void main(String[] args) {

        //January
        //February
        //March
        //April
        //May
        //June
        //July
        //August
        //September
        //October
        //November
        //December

        Scanner scanner = new Scanner(System.in);
        //int month = scanner.nextInt();
        String month = scanner.nextLine();
        month = month.toLowerCase();
        System.out.println(month);

        switch (month) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                System.out.println(31);
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                System.out.println(30);
                break;
            case "february":
                System.out.println(28);
        }

        switch (month) {
            case "january",
                    "march",
                    "may",
                    "july",
                    "august",
                    "october",
                    "december" -> System.out.println(31);
            case "april",
                    "june",
                    "september",
                    "november" -> System.out.println(30);
            case "february" -> System.out.println(28);
        }

        //switch


        //if (month == 1) {
        //    System.out.println(31);
        //}
//
        //if (month == 2) {
        //    System.out.println(28);
        //}
//
        //if (month == 3) {
        //    System.out.println(31);
        //}
//
        //if (month == 4) {
        //    System.out.println(30);
        //}
//
        //if (month == 5) {
        //    System.out.println(31);
        //}
//
        //if (month == 6) {
        //    System.out.println(30);
        //}
    }

}
