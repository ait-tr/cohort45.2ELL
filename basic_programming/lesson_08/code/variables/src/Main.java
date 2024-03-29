public class Main {

    public static void main(String[] args) {

        //Вывести все четные числа от 0 до 1000
        //Вывести числа 997, 987, 977, 967, 957 ..... 37, 27, 17, 7
        //Считывать числа с консоли, пока человек не введет ноль

        int counter = 1;

        //while (counter <= 1000) {
        //    if (counter % 2 == 0) {
        //        System.out.println(counter);
        //    }
        //    counter++;
        //}

        while (counter <= 1000) {
            System.out.println(counter);
            counter += 2; //counter = counter + 2;
        }

    }

    //a % 2 == 0

}
