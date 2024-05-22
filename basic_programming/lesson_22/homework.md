<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>



Домашнее задание:

Определите временную сложность данных алгоритмов и объясните свой выбор!

## 1

```java
public class Program {
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.print("Возраст: ");
        int age = in.nextInt();
        System.out.print("Введите рост: ");
        float height = in.nextFloat();
        System.out.printf("Имя: %s  Возраст: %d  Рост: %.2f \n", name, age, height);
        in.close();
    }
}
```

## 2

```java
        int num1 = 6;
        int num2 = 8;
        if (num1 > num2) {
            System.out.println("Первое число больше второго");
        } else if (num1 < num2) {
            System.out.println("Первое число меньше второго");
        } else {
            System.out.println("Числа равны");
        }
```

## 3

```java
        for (int i = 1; i < 9; i++) {
            System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
        }

        int j = 1;
        do {
            System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
            j++;
        } while (j < 9);

        int k = 1;
        while (k < 10) {
            System.out.printf("Квадрат числа %d равен %d \n", k, k * k);
            k++;
        }
```

### 4

```java
    public static void main(String[] args) {
        int n = 100;
        for (int i = 0; i < n * n; i++) {
            for (int j = 0; j < n * n; j++) {
                System.out.println(1);
            }
        }
    }
```

## 5

```java
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int i = 0; i < n * n; i++) {
        System.out.println(1);
    }
}
```

## 6

```java
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n * n * 0; i++) {
            System.out.println(1);
        }
    }
```

</details>

