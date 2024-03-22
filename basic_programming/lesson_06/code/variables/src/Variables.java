public class Variables {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        System.out.println(a); //5
        a = 50;
        System.out.println(a); //50
        a = 30;
        System.out.println(a); //30
        b = b + a; //b = 0 + 30;
        a = a + 5;
        System.out.println(a); //35


        b = b - b; //b = 30 - 30 = 0;
        a = a + b; //a = 35 + 0; a = 35;
        System.out.println(a);

    }
}
