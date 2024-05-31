public class Fibonacci {

    public static void main(String[] args) {
        //Фибоначчи
        //1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377
        //f(x) = f(x-1)+ f(x-2)
        long start = System.nanoTime();
        int first = fibonacciCommon(50);
        long finish = System.nanoTime();
        System.out.println(finish - start);
        System.out.println(first);

        start = System.nanoTime();
        int second = fibonacciRecursion(50);
        finish = System.nanoTime();
        System.out.println(finish - start);
        System.out.println(second);
    }

    public static int fibonacciCommon(int n) {
        int[] fib = new int[n + 1];
        fib[0] = 1;
        fib[1] = 1;

        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i -2];
        }

        return fib[fib.length - 1];
    } //O(n)

    public static int fibonacciRecursion(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    } //O(2^N)


}
