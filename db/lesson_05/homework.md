## Задание

Часть 1. Создание и добавление данных
Используйте базу данных practice_db2.
Создайте коллекцию students.
Выполните следующие операции:
Добавьте студента Mike, возраст 22, город Paris.
Добавьте несколько студентов за одну операцию:
Emily, возраст 19, город London, хобби ["painting", "dancing"].
Tom, возраст 24, хобби ["basketball", "chess"].
Sarah, возраст 20, город Berlin.
Adam, возраст 22, хобби ["coding", "gaming"].
Sophia, возраст 25, город New York, хобби ["photography"].
Добавьте студента Lucas, возраст 21, который живёт в Amsterdam и интересуется ["cycling", "reading"].

Часть 2. Чтение данных
Прочитайте всех студентов из коллекции.
Прочитайте первых трёх студентов.
Прочитайте всех студентов, отсортированных по возрасту в порядке возрастания.
Прочитайте всех студентов, у которых возраст старше 20.
Прочитайте имена и города всех студентов, у которых есть хобби.

Часть 3. Обновление данных
Обновите город Tom на San Francisco.
Добавьте хобби ["guitar"] для Mike.
Обновите возраст всех студентов из города London, увеличив его на 1. ($inc)
Добавьте поле grade всем студентам.
Если возраст меньше 22, установите grade: "A".
Если возраст от 22 до 24, установите grade: "B".
Если возраст больше 24, установите grade: "C".

Часть 4. Удаление данных
Удалите всех студентов, у которых нет хобби.
Удалите студента с именем Adam.