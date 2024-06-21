<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>
## HashMap


## Обобщения или generics

Обобщения или generics (обобщенные типы и методы) позволяют нам уйти от жесткого определения используемых типов. Рассмотрим проблему, в которой они нам могут понадобиться.

Допустим, мы определяем класс для представления банковского счета. К примеру, он мог бы выглядеть следующим образом:

```
class Account{

    private int id;
    private int sum;
     
    Account(int id, int sum){
        this.id = id;
        this.sum = sum;
    }
     
    public int getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }

}
```

Класс Account имеет два поля: id - уникальный идентификатор счета и sum - сумма на счете.

В данном случае идентификатор задан как целочисленное значение, например, 1, 2, 3, 4 и так далее. Однако также нередко для идентификатора используются и строковые значения. И числовые, и строковые значения имеют свои плюсы и минусы. И на момент написания класса мы можем точно не знать, что лучше выбрать для хранения идентификатора - строки или числа. Либо, возможно, этот класс будет использоваться другими разработчиками, которые могут иметь свое мнение по данной проблеме. Например, в качестве типа id они захотят использовать какой-то свой класс.

И на первый взгляд мы можем решить данную проблему следующим образом: задать id как поле типа Object, который является универсальным и базовым суперклассом для всех остальных типов:

```
public class Program{

    public static void main(String[] args) {
          
        Account acc1 = new Account(2334, 5000); // id - число
        int acc1Id = (int)acc1.getId();
        System.out.println(acc1Id);
         
        Account acc2 = new Account("sid5523", 5000);    // id - строка
        System.out.println(acc2.getId());
    }

}
```

```
class Account{

    private Object id;
    private int sum;
     
    Account(Object id, int sum){
        this.id = id;
        this.sum = sum;
    }
     
    public Object getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }

}
```

В данном случае все замечательно работает. Однако тогда мы сталкиваемся с проблемой безопасности типов. Например, в следующем случае мы получим ошибку:

```
Account acc1 = new Account("2345", 5000);
int acc1Id = (int)acc1.getId(); // java.lang.ClassCastException
System.out.println(acc1Id);
```

Проблема может показаться искуственной, так как в данном случае мы видим, что в конструктор передается строка, поэтому мы вряд ли будем пытаться преобразовывать ее к типу int. Однако в процессе разработки мы можем не знать, какой именно тип представляет значение в id, и при попытке получить число в данном случае мы столкнемся с исключением java.lang.ClassCastException.

Писать для каждого отдельного типа свою версию класса Account тоже не является хорошим решением, так как в этом случае мы вынуждены повторяться.

Эти проблемы были призваны устранить обобщения или generics. Обобщения позволяют не указывать конкретный тип, который будет использоваться. Поэтому определим класс Account как обобщенный:

```
class Account<T>{

    private T id;
    private int sum;
     
    Account(T id, int sum){
        this.id = id;
        this.sum = sum;
    }
     
    public T getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }

}
```

С помощью буквы T в определении класса class Account<T> мы указываем, что данный тип T будет использоваться этим классом. Параметр T в угловых скобках называется универсальным параметром, так как вместо него можно подставить любой тип. При этом пока мы не знаем, какой именно это будет тип: String, int или какой-то другой. Причем буква T выбрана условно, это может и любая другая буква или набор символов.

После объявления класса мы можем применить универсальный параметр T: так далее в классе объявляется переменная этого типа, которой затем присваивается значение в конструкторе.

Метод getId() возвращает значение переменной id, но так как данная переменная представляет тип T, то данный метод также возвращает объект типа T: public T getId().

Используем данный класс:

```
public class Program{

    public static void main(String[] args) {
          
        Account<String> acc1 = new Account<String>("2345", 5000);
        String acc1Id = acc1.getId();
        System.out.println(acc1Id);
         
        Account<Integer> acc2 = new Account<Integer>(2345, 5000);
        Integer acc2Id = acc2.getId();
        System.out.println(acc2Id);
    }

}
```

```
class Account<T>{

    private T id;
    private int sum;
     
    Account(T id, int sum){
        this.id = id;
        this.sum = sum;
    }
     
    public T getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }

}
```

При определении переменной данного класса и создании объекта после имени класса в угловых скобках нужно указать, какой именно тип будет использоваться вместо универсального параметра. При этом надо учитывать, что они работают только с объектами, но не работают с примитивными типами. То есть мы можем написать Account<Integer>, но не можем использовать тип int или double, например, Account<int>. Вместо примитивных типов надо использовать классы-обертки: Integer вместо int, Double вместо double и т.д.

Например, первый объект будет использовать тип String, то есть вместо T будет подставляться String:

```
Account<String> acc1 = new Account<String>("2345", 5000);
```

В этом случае в качестве первого параметра в конструктор передается строка.

А второй объект использует тип int (Integer):

```
Account<Integer> acc2 = new Account<Integer>(2345, 5000);
```


</details>
