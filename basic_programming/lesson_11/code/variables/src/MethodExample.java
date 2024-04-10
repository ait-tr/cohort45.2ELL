public class MethodExample {

    public static void main(String[] args) {
        sum(2, 3); //без возвращаемого значения
        int answer = sum2(2, 3); //c возвращаемым значением

        int first = 5;
        int second = 7;

        int sum = sum2(7, 5);

        System.out.println("Ответ равняется");
        System.out.println(answer);
        System.out.println("Ответ + 2 = ");
        System.out.println(answer + 2);
    }

    //метод, который ничего не возвращает, считает сумму двух чисел и выводит ее на экран
    public static void sum(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public static int sum2(int a, int b) {
        int c = a + b;
        return c;
    }
}
