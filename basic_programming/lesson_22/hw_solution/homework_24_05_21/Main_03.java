package homework_24_05_21;

public class Main_03 {
    public static void main(String[] args) {
        for (int i = 1; i < 9; i++) {
            System.out.printf("Квадрат числа %d равен %d \n", i, i * i);    //константная сложность O(1)
        }

        int j = 1;
        do {
            System.out.printf("Квадрат числа %d равен %d \n", j, j * j);    //константная сложность O(1)
            j++;
        } while (j < 9);

        int k = 1;
        while (k < 10) {
            System.out.printf("Квадрат числа %d равен %d \n", k, k * k);    //константная сложность O(1)
            k++;
        }
    }
}
                                                        //Общая сложность - константная сложность O(1)