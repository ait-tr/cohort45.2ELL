public class Homework {

    //    1) Необходимо вывести на экран сообщение "Я знаю циклы" - 25 раз
    //
    //    2) Вывести числа от 0 до 1000, кратные 5
    //
    //    3) Вывести на экран все степени двойки в диапазоне от 1 до 100 000
    //    Пример: 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048 и так до 100 000
    //
    //    3.1) Все то же самое, что и в 3 задаче, но вывести необходимо только те числа, которые заканчиваются на 8

    public static void main(String[] args) {
        int counter = 0;
        while (counter < 25) {
            System.out.println("Я знаю циклы");
            counter++;
        }

        int counterSecond = 0;
        while (counterSecond <= 1000) {
            System.out.println(counterSecond);
            counterSecond += 5;
        }

        int counterThird = 1;
        while (counterThird < 100000) {
            if (counterThird % 10 == 8) {
                System.out.println(counterThird);
            }
            counterThird *= 2;
        }
    }

}
