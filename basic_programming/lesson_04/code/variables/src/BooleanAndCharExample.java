public class SecondMain {

    public static void main(String[] args) {
        //UpperCaseCamel - классы
        //lowerCaseCamel - переменные
        
        //ctrl + c - копировать
        //ctrl + v - вставить
        //ctrl + d - дублирование строки
        //ctrl + f - поиск
        //ctrl + shift + f - поиск по всему проекту
        //ctrl + r - замена
        //ctrl + z - откатиться назад
        
        byte c = 127; //максимум 127
        short d = 32000; //чуть больше 32 тысяч
        int a = 1_000_000; //целые числа до 2 млрд.
        long b = 1_000_000_000_000L; //большие целые числа

        float g = 3.5F; //дробное число, но не настолько точно
        double e = 4.5; //дробное число

        //одна буква
        char adcd = 'a'; //97

        System.out.println(adcd);

        System.out.println('a' + 0);
        System.out.println('а' + 0);
        System.out.println('B' + 0);

        //булево значение
        boolean example = true;
        boolean secondExample = false;

        boolean isOneMoreThanZero = (1 > 0);
        boolean abc = (1 == 0);

        System.out.println(isOneMoreThanZero);
        System.out.println(abc);

        System.out.println("Привет, мир");

        //С помощью булевой алгебры узнать, больше значение символа 'А' по сравнению с символом 'z'

        char symbol = '\'';

        System.out.println(symbol);



    }
}
