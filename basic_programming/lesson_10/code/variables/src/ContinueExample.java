public class ContinueExample {

    //Найтите первое число, которое делится на 156 в промежутке от 10 000 до 10 000

    public static void main(String[] args) {
        //break - полностью прерывает цикл или switch
        //continue - прерывает одну итерацию цикла

        for (int i = 10_000; i < 100_000; i++) {
            if (i % 156 == 0) {
                System.out.println(i);
                break;
            }
        }

        //вывести четные числа от 0 до 1000

        for (int i = 0; i < 1000; i++) {
            if (i % 2 != 0) {
                continue;
            }

            System.out.println(i);
        }
    }

}
