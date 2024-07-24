<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

Конспект по использованию библиотеки JUnit 5
=============================================

### Введение

JUnit 5 - это одна из наиболее популярных библиотек для тестирования Java-приложений. Эта библиотека позволяет писать и запускать тесты для проверки работоспособности ваших программ.

### Начало работы

Для начала работы необходимо скачать и подключить к проекту библиотеку JUnit 5. Если вы используете Maven или Gradle, добавить следующие зависимости в ваш файл конфигурации:

**Maven**

```xml
<dependency>
  <groupId>org.junit.jupiter</groupId>
  <artifactId>junit-jupiter-engine</artifactId>
  <version>5.9.2</version>
  <scope>test</scope>
</dependency>
```

### Основные аннотации JUnit 5

- `@Test`: помечает метод как тестовый
- `@BeforeAll`: помечает метод, который будет выполнен один раз перед всеми тестами в данном классе
- `@AfterAll`: помечает метод, который будет выполнен один раз после всех тестов в данном классе
- `@BeforeEach`: помечает метод, который будет выполнен перед каждым тестом
- `@AfterEach`: помечает метод, который будет выполнен после каждого теста
- `@Disabled`: отключает выполнение теста или группы тестов

### Примеры использования

```java
import org.junit.jupiter.api.*;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    public static void init() {
        calculator = new Calculator();
    }

    @AfterAll
    public static void destroy() {
        calculator = null;
    }

    @Test
    public void sum() {
        int a = 2;
        int b = 3;
        int expected = 5;
        int actual = calculator.sum(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @Disabled("Этот тест еще не готов")
    public void multiply() {
        int a = 2;
        int b = 3;
        int expected = 6;
        int actual = calculator.multiply(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divide() {
        int a = 4;
        int b = 2;
        int expected = 2;
        int actual = calculator.divide(a, b);
        Assertions.assertEquals(expected, actual);
    }
}
```

### Типы утверждений

- `assertEquals(expected, actual)`: проверяет равенство двух значений
- `assertNotEquals(expected, actual)`: проверяет неравенство двух значений
- `assertTrue(condition)`: проверяет истинность условия
- `assertFalse(condition)`: проверяет ложность условия
- `assertNull(object)`: проверяет, что объект равен null
- `assertNotNull(object)`: проверяет, что объект не равен null

### Исключения в тестах

Чтобы проверить, что метод выбрасывает определенное исключение, используйте `Assertions.assertThrows()`:

```java
@Test
public void divideByZero() {
    int a = 4;
    int b = 0;
    Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(a, b));
}
```


</details>
