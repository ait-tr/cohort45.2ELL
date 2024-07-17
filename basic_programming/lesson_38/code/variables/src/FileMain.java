package hello;

import java.io.*;

public class FileMain {

    public static void main(String[] args) {

        //блок try
        //блок try-catch
        try {
            File file = new File("hello1.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = bufferedReader.readLine();
            System.out.println(str);
            System.out.println("Файл успешно прочитался");
            System.out.println(1 / 0);
        }
        catch (IOException e) {
            System.out.println("Сейчас мы закроемся и умрем");
            throw new RuntimeException("Причина ошибки - мы упражняемся", e);
        }
        finally {
            System.out.println("Тут отработал блок finally");
        }


        System.out.println("Программа все равно работает");

    }
}
