public class SecondMain {

    public static void main(String[] args) {
        //Вывести числа 997, 987, 977, 967, 957 ..... 37, 27, 17, 7
        //напиши переменную 997, и циклом отнимай 10, пока не будет меньше 0
        int counter = 997;

        while (counter > 0) {
            System.out.println(counter);
            counter -= 10; //counter = counter - 10;
        }

    }
}
