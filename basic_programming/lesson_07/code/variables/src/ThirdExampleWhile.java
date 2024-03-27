import java.util.Scanner;

public class ThirdExampleWhile {

    public static void main(String[] args) {
        //человек вводит число, а мы говорим, чему равняется сумма всех введеных чисел на текущий момент
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            int value = scanner.nextInt();
            sum = sum + value; //sum += value;
            System.out.println(sum);
        }
    }
}
