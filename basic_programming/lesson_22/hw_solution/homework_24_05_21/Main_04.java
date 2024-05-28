package homework_24_05_21;

public class Main_04 {
    public static void main(String[] args) {

        int n = 100;
//        for (int i = 0; i < n * n; i++) {             квадратичная временная сложность O(n^2)

//            for (int j = 0; j < n * n; j++) {         квадратичная временная сложность O(n^2) *
//                                                      квадратичная временная сложность O(n^2)
//                System.out.println(1);
//            }
//        }
        System.out.println("Если запустить эту программу она будет выполняться  "
                + n * n * n * n + "  раз!");
    }
}
                            //Общая сложность -  временная сложность в четвёртой степени O(n^4)
