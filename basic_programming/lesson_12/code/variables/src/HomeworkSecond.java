public class HomeworkSecond {


    //    //2. Сделать метод, который принимает один параметр - целое число, и пишет на экран
    //    //"Делится на 2", если это число делится на 2. И пишет на экран "не делится на 2", если
    //    //оно не делится на 2
    public static void main(String[] args) {
        int a = 5;
        checkNumber(a);
    }

    public static void checkNumber(int number) {
        if (number % 2 == 0) {
            System.out.println("Делится");
        }
        else {
            System.out.println("Не делится");
        }
    }

}
