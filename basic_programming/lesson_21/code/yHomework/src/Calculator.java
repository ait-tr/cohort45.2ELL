public class Calculator {

    private int[] array;

    public Calculator(int[] array) {
        this.array = array;
    }

    public int calculateSum() {
        int sum = 0;
        for (int j = 0; j < array.length; j++) {
            sum += array[j];
        }
        return sum;
    }

}
