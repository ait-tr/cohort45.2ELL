public class Main {

    public static void main(String[] args) {
        String s = "Привет, мир!";
        String a = "Привет, мир!";

        boolean result = a.equals(s);
        System.out.println(result);

        //immutable
        s = s.toUpperCase(); //все буквы заглавные
        s = s.toLowerCase(); //все буквы строчные

        s = s.replace("привет", "Пока"); //заменить часть строки на другие символы

        char answer = s.charAt(3); //получить символ по индексу.
        System.out.println(answer);

        System.out.println(s);

        String string = "ABCD";

        string = string
                .toLowerCase()
                .toUpperCase()
                .replace("A", "B")
                .replace("D", "C");

        int size = string.length(); //размер
        System.out.println(size);

        for (int i = 0; i < string.length(); i++) {
            char symbol = string.charAt(i);
            System.out.println(symbol);
        }

        String a1 = "Boris";
        String a2 = "Boriz";

        String a3 = "Boriss";
        String a4 = "Boris";

        System.out.println(a1.compareTo(a2));
        System.out.println(a2.compareTo(a1));
        System.out.println(a3.compareTo(a4)); //сравнение

        System.out.println(a4.concat(a3));
        System.out.println(a4 + a3);

        boolean contain = a4.contains("oris"); //проверка вхождения последовательности в строку

        System.out.println(contain);

        System.out.println(a3.contains(a4));

        boolean starts = a4.startsWith("B"); //начинается с
        boolean ends = a4.endsWith("z"); //заканчивается на

        System.out.println(starts);
        System.out.println(ends);

        char symbol = a4.charAt(0); //получение по индексу
        int index = a4.indexOf("B"); //получения индекса по символу
        System.out.println(index);

        System.out.println(a4.isEmpty());

        String repeat = a4.repeat(5); //повторить строку
        System.out.println(repeat);

        String substring = a4.substring(1, 2); //с первого по второй невключительно
        System.out.println(substring);
        substring = a4.substring(1);  //с первого и до конца
        System.out.println(substring);

        String string1 = "   abc   ";
        System.out.println(string1.trim());


        System.out.println(string);
    }

}
