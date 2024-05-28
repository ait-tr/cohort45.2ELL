package homework_24_05_21;

import java.util.Scanner;

public class Main_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();                                                     //константная сложность O(1)
        System.out.print("Возраст: ");
        int age = in.nextInt();                                                         //константная сложность O(1)
        System.out.print("Введите рост: ");
        float height = in.nextFloat();                                                   //константная сложность O(1)
        System.out.printf("Имя: %s  Возраст: %d  Рост: %.2f \n", name, age, height);
        in.close();                                                                      //константная сложность O(1)
    }
}
                                                                        //Общая сложность - константная сложность O(1)