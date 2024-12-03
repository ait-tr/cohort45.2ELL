### Типы связей между таблицами в PostgreSQL

В PostgreSQL можно выделить три основных типа связей между таблицами:

1. **One-to-One (Один к одному):**
   - Каждая запись в одной таблице соответствует ровно одной записи в другой таблице.
   - Используется редко и в основном для разбиения таблиц с большим количеством столбцов на меньшие по функциональному признаку.

2. **One-to-Many (Один ко многим):**
   - Одна запись в одной таблице может соответствовать нескольким записям в другой таблице.
   - Это наиболее распространенный тип связи, используется, например, для связи авторов и их книг.
   - Эту связь также можно рассматривать как **Many-to-One (Многие к одному)** в зависимости от направления просмотра.

3. **Many-to-Many (Многие ко многим):**
   - Несколько записей в одной таблице могут соответствовать нескольким записям в другой таблице.
   - Для реализации этого типа связи используется промежуточная таблица (например, `book_genre`), содержащая внешние ключи на обе таблицы.

---

### Пример создания связанных таблиц

#### Схема базы данных:

- **`author`**: содержит информацию об авторах.
- **`book`**: содержит книги, связанные с авторами через внешний ключ `author_id`.
- **`genre`**: содержит жанры книг.
- **`book_genre`**: промежуточная таблица для реализации связи "Многие ко многим" между книгами и жанрами.

```sql
CREATE TABLE author (
  id serial PRIMARY KEY,
  name VARCHAR(80) NOT NULL,
  country VARCHAR(80)
);

CREATE TABLE book (
  id serial PRIMARY KEY,
  title VARCHAR(100),
  year INT,
  author_id INT REFERENCES author (id)
);

CREATE TABLE genre (
  id serial PRIMARY KEY,
  title VARCHAR(80) NOT NULL
);

CREATE TABLE book_genre (
  book_id INT REFERENCES book (id),
  genre_id INT REFERENCES genre (id)
);
```

---

### Добавление данных в таблицы

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
  (1, 2), (1, 3), (1, 4),
  (2, 1), (2, 3), (2, 4),
  (3, 1), (4, 1), (5, 1);
```

---

### Получение связанных данных

Для объединения данных из нескольких таблиц используются **JOIN**-запросы.

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

---

