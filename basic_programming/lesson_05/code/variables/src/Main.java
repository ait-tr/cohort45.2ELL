public class Main {

    public static void main(String[] args) {
        int speed = 5;

        boolean b = true;
        boolean c = false;

        //System.out.println(b);
        //System.out.println(c);

        boolean d = (speed > 0); //true

        boolean e = (5 == 0); //false

        boolean f = (0 == 0); //true

        int donuts = 50;
        int cola = 50;
        int persons = 12;

        boolean eat = (donuts / persons) >= 2;
        boolean drink = (cola / persons) >= 1;


        System.out.println("Еда " + eat);
        System.out.println("Напитки " + drink);

        boolean amIGoodMan = eat && drink; //еда И напитки
        boolean amISoGoodMan = eat || drink; //или еда ИЛИ напитки
        boolean areYouUpset = !amISoGoodMan; //НЕ


        System.out.println("Можно ли мне доверить организацию вечеринки " + amIGoodMan);
        System.out.println("Будете ли вы довольны " + amISoGoodMan);
        System.out.println("Были ли вы расстроены " + areYouUpset);

        boolean answer = (0 == 0);

        System.out.println(answer);
        System.out.println(!answer);


        //булеан - не только значение, но и выражение
        //true,
        // (a > 5),
        // f >= 2,
        // e < 5 + d


    }

}
