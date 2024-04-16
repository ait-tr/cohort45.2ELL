package homework_24_04_04;
/*
 Сделать метод, который принимает один параметр - целое число, и пишет на экран
"Делится на 2", если это число делится на 2. И пишет на экран "не делится на 2", если
оно не делится на 2
 */
public class Main02 {
    public static void printResult(int number) {
        if (number % 2 == 0) {
            System.out.println("Число:  " + number + "  делится на два! ");
        } else {
            System.out.println("Число:  " + number + "  не делится на два! ");
        }
    }

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 22;
        int num3 = 333;
        int num4 = 4444;
        int num5 = 55555;
        printResult(num1);
        printResult(num2);
        printResult(num3);
        printResult(num4);
        printResult(num5);
    }
}
