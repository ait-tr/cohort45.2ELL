package homework_24_04_09;
/*
Сделать метод, который принимает два целых числа и ВОЗВРАЩАЕТ их разность
 */
public class Main01 {
    public static int returnResult(int a, int b) {
        int res = a - b;
        return res;
    }

    public static void main(String[] args) {

        System.out.println(returnResult(100, 1000));
    }
}
