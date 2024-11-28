# SQL (Structured Query Language) – Язык Структурированных Запросов

SQL используется для работы с базами данных: создания, модификации, удаления данных и их структур.

**СУБД (система управления базами данных)** — программный инструмент для управления базами данных. Пример: PostgreSQL.

**BEKEEPER** — программа для работы с базами данных, которая позволяет визуализировать их содержимое и выполнять запросы.

Базы данных состоят из **таблиц**, каждая из которых хранит данные, связанные общей темой или проектом.

---

### Основные операции в SQL

#### **Создание пользователя**
```sql
CREATE USER dima WITH PASSWORD '1234';
```
Создание пользователя с паролем.

#### **Создание базы данных**
```sql
CREATE DATABASE students_group OWNER dima;
```
Создание базы данных и назначение владельца.

#### **Создание таблицы**
```sql
CREATE TABLE student (
	id serial PRIMARY KEY,
	name varchar(80),
	age int,
	city varchar(80),
	hobby varchar(80)
);
```
Создание таблицы `student` с заданными столбцами.

#### **Добавление данных в таблицу**
```sql
INSERT INTO
  student (name, age, city, hobby)
VALUES
  ('Victoria', 45, 'Frankfurt am Main', 'knitting'),
  ('Umut', 28, 'Dubai', 'videography'),
  ('Ruslana', 18, 'Helsinki', 'hobby horsing');
```
Добавление записей в таблицу по определенным полям.

---

### Запросы к данным

#### **Вывод всех данных**
```sql
SELECT * FROM student;
```
Вывод всех данных из таблицы.

#### **Выбор определенных полей**
```sql
SELECT name, hobby FROM student;
```
Вывод данных только по полям `name` и `hobby`.

#### **Фильтрация данных**
```sql
SELECT
  *
FROM
  student
WHERE
  hobby = 'knitting';
```
Поиск данных по условию (в данном случае — хобби).

#### **Сортировка данных**
```sql
SELECT
  *
FROM
  student
ORDER BY
	name ASC;
```
Сортировка данных по алфавиту. Используйте `DESC` для обратного порядка.

---

### Удаление данных и объектов

#### **Удаление данных из таблицы**
```sql
DELETE FROM student;
```
Удаление всех записей из таблицы.

#### **Удаление данных по условию**
```sql
DELETE FROM
  student
WHERE
  name = 'Dima';
```
Удаление записей, где `name = 'Dima'`.

#### **Удаление данных по составному условию**
```sql
DELETE FROM
  student
WHERE
  hobby = 'videography'
  AND city = 'Leipzig';
```
Удаление записей по нескольким условиям.

#### **Удаление таблицы**
```sql
DROP TABLE student;
```
Удаление таблицы.

#### **Удаление базы данных**
```sql
DROP DATABASE db_name;
```
Удаление базы данных. Для этого требуется сначала отключиться от нее.

---

### Обновление данных

#### **Обновление записи**
```sql
UPDATE
  student
SET
  hobby = 'painting'
WHERE
  id = 3;
```
Обновление данных в таблице для записи с `id = 3`.

---

### Примеры работы с таблицей

- **Добавление записей**
  ```sql
  INSERT INTO student (name, age, city, hobby)
  VALUES ('John', 30, 'New York', 'reading');
  ```

- **Фильтрация по возрасту**
  ```sql
  SELECT * FROM student WHERE age > 25;
  ```

- **Сортировка по возрасту**
  ```sql
  SELECT * FROM student ORDER BY age DESC;
  ```

SQL предоставляет гибкий и мощный инструментарий для управления данными в таблицах и базах данных.
