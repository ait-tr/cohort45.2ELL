<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>
# «Что такое полиморфизм в Java»


# Чтение из файла и запись в файл

### Чтение из файла

Чтение строк из файла в Java можно выполнить с помощью класса BufferedReader, который позволяет читать текстовые данные из потока ввода. Для чтения строк из файла сначала необходимо открыть файл для чтения, а затем читать строки по одной до тех пор, пока не достигнут конец файла.

Ниже приведен пример кода, который демонстрирует, как считывать строки из файла в Java с помощью BufferedReader:

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

```
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("Text.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while (true) {
            String line = bufferedReader.readLine();

            if (line == null) {
                break;
            }

            System.out.println(line);
        }
    }
}
```

В этом примере мы создаем объект BufferedReader с помощью конструктора new BufferedReader(new FileReader("Text.txt")), где Text.txt - это имя файла, который мы хотим прочитать.
Затем мы читаем строки из файла, вызывая метод readLine() объекта BufferedReader. Метод readLine() возвращает очередную строку текста из файла или null, если достигнут конец файла.

### Запись в файл

```
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("Text.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (int i = 0; i < 100; i++) {
            bufferedWriter.write("111111111");
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
    }
}
```

</details>
