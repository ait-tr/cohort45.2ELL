public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] array = new int[5];
        array[0] = 6;
        array[1] = 16;
        array[2] = 78;
        array[3] = 23;
        array[4] = 14;

        int result = calculator.sum(array);

        int secondResult = calculator.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        System.out.println(result);
        System.out.println(secondResult);
    }
}
