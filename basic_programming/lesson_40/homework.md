<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>
**Задание:**

Вам дан класс `User`, который имеет следующие методы:

```java
public class User {
    private String login;
    private String password;
    private String email;

    public User(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setLogin(String login) {
        if (login.length() < 3) {
            throw new IllegalArgumentException("Логин должен быть не менее 3 символов!");
        }
        this.login = login;
    }

    public void setPassword(String password) {
        if (password.length() < 8) {
            throw new IllegalArgumentException("Пароль должен быть не менее 8 символов!");
        }
        this.password = password;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email должен содержать '@'!");
        }
        this.email = email;
    }

    public boolean isValidPassword(String password) {
        return this.password.equals(password);
    }
}
```

Ваша задача - написать тесты для каждого метода класса `User` с использованием библиотеки JUnit 5.

**Требования:**

1. Напишите тестовый класс `UserTest`, в котором будут тесты для каждого метода класса `User`.
2. Используйте аннотацию `@Test` для каждого тестового метода.
3. Используйте методы утверждений (`assertEquals`, `assertNotEquals`, `assertTrue`, `assertFalse`, `assertNull`, `assertNotNull`) для проверки правильности работы каждого метода.
4. Напишите тест для проверки исключения `IllegalArgumentException` в методах `setLogin`, `setPassword` и `setEmail`.
5. Напишите тест для проверки метода`isValidPassword`.

</details>

