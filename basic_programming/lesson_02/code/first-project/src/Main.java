public class Main {

    public static void main(String[] args) {
        System.out.println("2 + 2");
        System.out.println(2 + 2);
        System.out.println(2 * 3);
        System.out.println(2 - 1);
        System.out.println("Деление 5 на 2 будет ниже:");
        System.out.println(5 / 2); //это не простое деление, а целочисленное
        System.out.println(3 / 2);
        System.out.println(1 / 3);
        System.out.println(7 / 3); //2.33333333333 //2

        //бегун пробежал 360 км, один круг вокруг Гамбурга занимает 100км
        //сколько целых кругов бегун намотал вокруг Гамбурга
        System.out.println(360 / 100);

        System.out.println(360 % 100); //остаток от деления 360 на 100
        System.out.println(3 % 2); //остаток от деления 3 на 2


        //ДРОБНЫЕ ЧИСЛА
        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println(1.5);
        System.out.println(2.3 + 4.5);

        System.out.println("Пример");
        System.out.println(15.0 / 2.0); //7.5
        System.out.println(15.0 / 2);//7.5
        System.out.println(15 / 2.0);//7.5
        System.out.println(15 / 2); //7

        System.out.println(15 * 4 / 2 - 10);
        System.out.println(15 - 10 / 2); //ответ 10, потому что деление первее
        System.out.println((15 - 10) / 2); //ответ 2, потому что сначала действие в скобках
        System.out.println(15-10/2);

        //Вывести на экран результат такого выражения
        //15 делим на 2 (целочисленное деление), умножаем на 8, добавляем (+) 4 и вычитаем 7
        //в личные сообщение в зуме прислать ответ
        //в личные сообщение в зуме прислать код
        System.out.println(15 / 2 * 8 + 4 - 7);

        //проблема 1
        System.out.println(2_000_000_000 + 2_000_000_000); //~ -2 млрд. до ~2 млрд.

        //проблема 2
        System.out.println(1 - 0.9); //0.1
        System.out.println(1 - 0.8); //0.2
        System.out.println(1 - 0.7); //0.3
        System.out.println(1 - 0.5); //0.5
        System.out.println(2 - 0.9); //1.1

        System.out.println(1.0 / 3.0);


    }

}




