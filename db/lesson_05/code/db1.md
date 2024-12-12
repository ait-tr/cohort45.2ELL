# Теория по SQL на основе примеров

### Удаление таблиц
```sql
DROP TABLE book_genre;
DROP TABLE book;
DROP TABLE author;
DROP TABLE genre;
```
Эта команда удаляет существующие таблицы и их данные.

---

### Создание таблиц и заполнение данных
```sql
CREATE TABLE
  author (
    id serial PRIMARY KEY,
    name VARCHAR(80) NOT NULL,
    country varchar(80)
  );

CREATE TABLE
  book (
    id serial PRIMARY KEY,
    title VARCHAR(100),
    year INT,
    author_id INT REFERENCES author (id)
  );

CREATE TABLE
  genre (id serial PRIMARY KEY, title varchar(80) NOT NULL);

CREATE TABLE
  book_genre (
    book_id INT REFERENCES book (id),
    genre_id INT REFERENCES genre (id)
  );
```
- **PRIMARY KEY** – уникальный идентификатор строки.
- **REFERENCES** – устанавливает связь между таблицами.

---

### Вставка данных
```sql
INSERT INTO author (name, country)
VALUES
  ('J.K. Rouling', 'Great Britain'),
  ('M. Lermontov', 'Russia'),
  ('J. London', 'USA');

INSERT INTO book (title, year, author_id)
VALUES
  ('Harry Potter and Chamber of Secrets', 2001, 1),
  ('White Fang', 1906, 3),
  ('The Sea Wolf', 1904, 3),
  ('Martin Eden', 1909, 3),
  ('A Hero of Our Time', 1840, 2);

INSERT INTO genre (title)
VALUES
  ('drama'),
  ('fantasy'),
  ('adventure'),
  ('kids');

INSERT INTO book_genre (book_id, genre_id)
VALUES
  (1, 2),
  (1, 3),
  (1, 4),
  (2, 1),
  (2, 3),
  (2, 4),
  (3, 1),
  (4, 1),
  (5, 1);
```
- **INSERT INTO** – добавляет строки в таблицу.

---

### Запрос данных с JOIN
```sql
SELECT
  author.name AS author_name,
  book.title AS book_title,
  book.year,
  genre.title AS genre_title
FROM
  author
  JOIN book ON author.id = book.author_id
  JOIN book_genre ON book.id = book_genre.book_id
  JOIN genre ON book_genre.genre_id = genre.id;
```
- **JOIN** – объединяет таблицы по условиям.

---

### Агрегатные функции и группировка
```sql
SELECT
  author.name AS author_name,
  book.title AS book_title,
  book.year AS publishing_year,
  STRING_AGG(genre.title, ', ') AS genres
FROM
  author
  JOIN book ON author.id = book.author_id
  JOIN book_genre ON book.id = book_genre.book_id
  JOIN genre ON book_genre.genre_id = genre.id
GROUP BY
  author.name,
  book.title,
  book.year;
```
- **STRING_AGG(field, delimiter)** – объединяет значения из группы в строку с указанным разделителем.
- **GROUP BY** – группирует данные.

---

### Фильтрация данных
```sql
SELECT
  *
FROM
  fellowship
WHERE
  name LIKE '%n';
```
- **LIKE '%n'** – выбирает строки, заканчивающиеся на `n`.

```sql
SELECT
  *
FROM
  fellowship
WHERE
  race IN ('hobbit', 'human');
```
- **IN** – выбирает строки, если поле содержит одно из значений.

---

### Агрегаты и группировка
```sql
SELECT
  race,
  min(age) AS min_age
FROM
  fellowship
GROUP BY
  race;
```
- **MIN()** – минимальное значение.

```sql
SELECT
  race,
  min(age) AS min_age,
  COUNT(id)
FROM
  fellowship
GROUP BY
  race
HAVING COUNT(id) > 1;
```
- **HAVING** – фильтрует группы по условиям.

---

### Удаление с каскадным удалением
```sql
CREATE TABLE
  item (
    id SERIAL PRIMARY KEY,
    title VARCHAR(50),
    fellowship_id INT REFERENCES fellowship (id) ON DELETE CASCADE
  );

INSERT INTO item (title, fellowship_id)
VALUES
  ('The Ring of Power', 1),
  ('Powerful Sword', 2),
  ('Magic Staff', 3);

DELETE FROM fellowship
WHERE id = 2;
```
- **ON DELETE CASCADE** – автоматически удаляет записи, связанные с удалённой строкой.

---

### Ограничения на данные
```sql
CREATE TABLE
  item (
    id SERIAL PRIMARY KEY,
    title VARCHAR(50) NOT NULL UNIQUE,
    power INT CHECK (power > 200),
    fellowship_id INT REFERENCES fellowship (id) ON DELETE CASCADE
  );

INSERT INTO item (fellowship_id, title, power)
VALUES
  (1, 'ring', 1000),
  (3, 'magic staff', 201);
```
- **NOT NULL** – поле не может быть пустым.
- **UNIQUE** – значение должно быть уникальным.
- **CHECK()** – проверяет условие для поля.

---

### Часто используемые функции
- **COUNT()** – количество строк.
- **MIN()** – минимальное значение.
- **MAX()** – максимальное значение.
- **SUM()** – сумма значений.
- **AVG()** – среднее значение.
- **ROUND()** – округление.
