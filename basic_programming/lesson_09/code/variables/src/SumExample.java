public class SumExample {

    public static void main(String[] args) {
        //сумма элементов в массиве
        double[] doubles = new double[5];
        doubles[0] = 1.2;
        doubles[1] = 5.6;
        doubles[2] = 3.4;
        doubles[3] = 7.8;
        doubles[4] = 9.8;

        double sum = 0.0;

        for (int i = 0; i < doubles.length; i++) {
            sum += doubles[i]; //sum = sum + doubles[i];
        }

        System.out.println(sum);
    }
}
