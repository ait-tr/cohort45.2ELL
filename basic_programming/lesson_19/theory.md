<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>
# «Что такое полиморфизм в Java»


# Чтение из файла и запись в файл

### Чтение из файла

Хотя мы можем создать обычный класс, который не является наследником, но фактически все классы наследуются от класса **Object**. Все остальные классы, даже те, которые мы добавляем в свой проект, являются неявно производными от класса Object. Поэтому все типы и классы могут реализовать те методы, которые определены в классе Object. Рассмотрим эти методы.

### toString

Метод `toString` служит для получения представления данного объекта в виде строки. При попытке вывести строковое представления какого-нибудь объекта, как правило, будет выводиться полное имя класса. Например:

```
public class Program{
      
    public static void main(String[] args) {
             
        Person tom = new Person("Tom");
        System.out.println(tom.toString()); // Будет выводить что-то наподобие Person@7960847b
    }
}
class Person {
     
    private String name;
     
    public Person(String name){
     
        this.name=name;
    }
}
```

Полученное мной значение (в данном случае `Person@7960847b`) вряд ли может служить хорошим строковым описанием объекта. Поэтому метод `toString()` нередко переопределяют. Например:

```
public class Program{
      
    public static void main(String[] args) {
             
        Person tom = new Person("Tom");
        System.out.println(tom.toString()); // Person Tom
    }
}
class Person {
     
    private String name;
    
    public Person(String name){
     
        this.name=name;
    }
     
    @Override
    public String toString(){
          
        return "Person " + name;
    }
}
```

### Метод hashCode

Метод **hashCode** позволяет задать некоторое числовое значение, которое будет соответствовать данному объекту или его хэш-код. По данному числу, например, можно сравнивать объекты.

Например, выведем представление вышеопределенного объекта:

```
Person tom = new Person("Tom");
System.out.println(tom.hashCode()); // 2036368507
```

Но мы можем задать свой алгоритм определения хэш-кода объекта:

```
class Person {
     
    private String name;
    
    public Person(String name){
     
        this.name=name;
    }
     
    @Override
    public int hashCode(){
 
        return 10 * name.hashCode() + 20456;
    }
}
```

### Получение типа объекта и метод getClass

Метод `getClass` позволяет получить тип данного объекта:

```
Person tom = new Person("Tom");
System.out.println(tom.getClass()); // class Person
```

### Метод equals

Метод equals сравнивает два объекта на равенство:

```
public class Program{
      
    public static void main(String[] args) {
             
        Person tom = new Person("Tom");
        Person bob = new Person("Bob");
        System.out.println(tom.equals(bob)); // false
         
        Person tom2 = new Person("Tom");
        System.out.println(tom.equals(tom2)); // true
    }
}
class Person {
     
    private String name;
     
    public Person(String name){
     
        this.name=name;
    }
     
    @Override
    public boolean equals(Object obj){
         
        if (!(obj instanceof Person)) return false;
 
        Person p = (Person)obj;
        return this.name.equals(p.name);
    }
}
```

Метод equals принимает в качестве параметра объект любого типа, который мы затем приводим к текущему, если они являются объектами одного класса.

Оператор **instanceof** позволяет выяснить, является ли переданный в качестве параметра объект объектом определенного класса, в данном случае класса Person. Если объекты принадлежат к разным классам, то их сравнение не имеет смысла, и возвращается значение false.

Затем сравниваем по именам. Если они совпадают, возвращаем true, что будет говорить, что объекты равны.





</details>
