<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>


## Интерфейс Set

Интерфейс Set расширяет интерфейс Collection и представляет набор уникальных элементов. Set не добавляет новых методов, только вносит изменения в унаследованные. В частности, метод add() добавляет элемент в коллекцию и возвращает true, если в коллекции еще нет такого элемента.

## HashSet

Класс HashSet представляет хеш-таблицу. Он наследует свой функционал от класса AbstractSet, а также реализует интерфейс Set.

Хеш-таблица представляет такую структуру данных, в которой все объекты имеют уникальный ключ или хеш-код. Данный ключ позволяет уникально идентифицировать объект в таблице.

Для создания объекта HashSet можно воспользоваться одним из следующих конструкторов:

```
HashSet(): создает пустой список

HashSet(Collection<? extends E> col): создает хеш-таблицу, в которую добавляет все элементы коллекции col

HashSet(int capacity): параметр capacity указывает начальную емкость таблицы, которая по умолчанию равна 16

HashSet(int capacity, float koef): параметр koef или коэффициент заполнения, значение которого должно быть в пределах от 0.0 до 1.0, указывает, насколько должна быть заполнена емкость объектами прежде чем произойдет ее расширение. Например, коэффициент 0.75 указывает, что при заполнении емкости на 3/4 произойдет ее расширение.
```

## TreeSet

Класс TreeSet в Java обеспечивает реализацию интерфейса Set, который использует древо для хранения. Объекты хранятся в отсортированном и возрастающем порядке.

Время доступа и поиска довольно быстрое, что делает TreeSet отличным выбором при хранении большого количества отсортированной информации, которая должна быть найдена быстро.

</details>