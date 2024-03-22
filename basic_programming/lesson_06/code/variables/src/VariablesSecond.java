public class VariablesSecond {

    public static void main(String[] args) {
        int a = 5;

        a = a + 5;
        a = a - 5;
        a = a / 2;
        a = a * 2;
        a = a % 2;

        a += 5;
        a -= 5;
        a /= 2;
        a *= 2;
        a %= 2;

        //Не работает
        int b = 5;
        a = b + 5;
        a += 5; //a = a + 5;

        System.out.println(a);

        a = a + 1;
        a += 1;
        a++; //просто плюс 1 к переменной а (инкрементация) - инкремент
        a--; //просто минус 1 к переменной а (декрементации) - декремент


        System.out.println(a);


    }
}
