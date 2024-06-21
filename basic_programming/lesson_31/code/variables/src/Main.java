import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Object[] objects = new Object[5];
        objects[0] = "str";
        objects[1] = 1;
        objects[2] = new Scanner(System.in);
        objects[3] = new Exception();
        objects[4] = null;

        //Обощенные типы - generics (генерики)

        //1 - я могу положить вообще что угодно, нет никаких ограничений
        //2 - при получении объектов из такого массива я не знаю их тип

        Object object = objects[0];
        System.out.println(object);


    }
}
