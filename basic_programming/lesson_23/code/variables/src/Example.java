public class Example {

    public static void main(String[] args) {
        int[] array = {56, 73, 7, 7, 7, 7, 7};
        int number= 7;

        Calculator calculator = new Calculator();
        int result = calculator.findInArray(array, number);

        System.out.println(result);
    }
}
