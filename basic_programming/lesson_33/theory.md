<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>
## HashMap
## Введение в Stream API


Начиная с JDK 8 в Java появился новый API - Stream API. Его задача - упростить работу с наборами данных, в частности, упростить операции фильтрации, сортировки и другие манипуляции с данными. Вся основная функциональность данного API сосредоточена в пакете java.util.stream.

Ключевым понятием в Stream API является поток данных. Вообще сам термин "поток" довольно перегружен в программировании в целом и в Java в частности, чаще используется выражение "стрим". Применительно к Stream API поток представляет канал передачи данных из источника данных. Причем в качестве источника могут выступать как файлы, так и массивы и коллекции.

Одной из отличительных черт Stream API является применение лямбда-выражений, которые позволяют значительно сократить запись выполняемых действий.

Рассмотрим простейший пример. Допустим, у нас есть задача: найти в массиве количество всех чисел, которые больше 0. До JDK 8 мы бы могли написать что-то наподобие следующего:

```
int[] numbers = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
int count=0;
for(int i:numbers){

    if(i > 0) count++;

}
System.out.println(count);
```

Теперь применим Stream API:

```
import java.util.stream.*;
//.......................
long count = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).filter(w -> w > 0).count();
System.out.println(count);
```

Теперь вместо цикла и кучи условных конструкций, которые мы бы использовали до JDK 8, мы можем записать цепочку методов, которые будут выполнять те же действия.

При работе со Stream API важно понимать, что все операции с потоками бывают либо терминальными (terminal), либо промежуточными (intermediate). Промежуточные операции возвращают трансформированный поток. Например, выше в примере метод filter принимал поток чисел и возвращал уже преобразованный поток, в котором только числа больше 0. К возвращенному потоку также можно применить ряд промежуточных операций.

Конечные или терминальные операции возвращают конкретный результат. Например, в примере выше метод count() представляет терминальную операцию и возвращает число. После этого никаких промежуточных операций естественно применять нельзя.

Все потоки производят вычисления, в том числе в промежуточных операциях, только тогда, когда к ним применяется терминальная операция. То есть в данном случае применяется отложенное выполнение.

#### Примеры операций:

long count(): возвращает количество элементов в потоке. Терминальная операция.

Stream<T> filter(Predicate<? super T> predicate): фильтрует элементы в соответствии с условием в предикате. Промежуточная операция

<R> Stream<R> map(Function<? super T,? extends R> mapper): преобразует элементы типа T в элементы типа R и возвращает поток с элементами R. Промежуточная операция

### Выводы:

Несмотря на то, что все эти операции позволяют взаимодействовать с потоком как неким набором данных наподобие коллекции, важно понимать отличие коллекций от потоков:

Потоки не хранят элементы. Элементы, используемые в потоках, могут храниться в коллекции, либо при необходимости могут быть напрямую сгенерированы.

Операции с потоками не изменяют источника данных. Операции с потоками лишь возвращают новый поток с результатами этих операций.

Для потоков характерно отложенное выполнение. То есть выполнение всех операций с потоком происходит лишь тогда, когда выполняется терминальная операция и возвращается конкретный результат, а не новый поток.


</details>
