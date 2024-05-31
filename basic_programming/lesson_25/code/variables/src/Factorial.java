public class Factorial {

    public static void main(String[] args) {
        long start = System.nanoTime();
        int first = factorialCommon(25);
        long finish = System.nanoTime();
        System.out.println(finish - start);
        System.out.println(first);

        start = System.nanoTime();
        int second = factorialRecursion(25);
        finish = System.nanoTime();
        System.out.println(finish - start);
        System.out.println(second);
    }

    //4! = 1 * 2 * 3 * 4;
    //5! = 1 * 2 * 3 * 4 * 5;
    //5! = 5 * 4!;

    //f(n) = n * f(n-1)

    //1! = 1 * 0!;
    //1 = 1 * 0!;

    //1! = 1
    //0! =

    public static int factorialCommon(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    //f(n) = n * f(n-1)
    //f(1) = 1
    //f(0) = 1
    public static int factorialRecursion(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        return n * factorialRecursion(n - 1);
    }

    //Фибоначчи
    //1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377




}
