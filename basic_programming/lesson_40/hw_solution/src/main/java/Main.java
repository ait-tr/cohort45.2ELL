public class Main {
    public static void main(String[] args) {
        // Создание нового пользователя
        User user = new User("user123", "password123", "user@example.com");

        // Вывод информации о пользователе
        System.out.println("Логин: " + user.getLogin());
        System.out.println("Email: " + user.getEmail());

        // Изменим логин и пароль
        try {
            user.setLogin("newUser");
            System.out.println("Новый логин: " + user.getLogin());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            user.setPassword("newPassword123");
            System.out.println("Новый пароль установлен.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Проверим, правильный ли пароль
        String passwordToCheck = "newPassword123";
        if (user.isValidPassword(passwordToCheck)) {
            System.out.println("Пароль верный.");
        } else {
            System.out.println("Пароль неверный.");
        }

        // Попробуем задать недостаточно короткий логин
        try {
            user.setLogin("ab");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Попробуем задать некорректный email
        try {
            user.setEmail("userexample.com");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Попробуем задать недостаточно длинный пароль
        try {
            user.setPassword("short");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
