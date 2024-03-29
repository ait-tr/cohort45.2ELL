<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>
# Тип boolean. Логические операции

## boolean

boolean - Тип данных boolean в программировании представляет собой один из самых основных типов. В Java, как и во многих других языках программирования, boolean используется для представления логических значений, которые могут быть либо true (истина), либо false (ложь). Этот тип данных имеет ключевое значение для управления потоком выполнения программы через логические выражения и условные конструкции.

boolean b = true;  

### Логические высказывания

Логические высказывания являются фундаментальным элементом в логике и программировании. Они используются для представления утверждений, которые могут быть либо истинными (true или 1), либо ложными (false или 0). Рассмотрим различные типы логических высказываний и операторов на примерах:

###### Примеры высказываний:

"Сейчас лето" — это логическое высказывание, которое может быть истинным или ложным в зависимости от текущего времени года.

"Сейчас вечер" — еще одно логическое высказывание, истинность которого зависит от текущего времени суток.

### Конъюнкция (И):

Обозначается как "И" или "∧".

Высказывание "Сейчас лето И сейчас день" истинно только в том случае, если истинны оба составляющих его высказывания — то есть если сейчас действительно лето и сейчас день.

### Дизъюнкция (ИЛИ):

Обозначается как "ИЛИ" или "∨".

Высказывание "Сейчас лето ИЛИ сейчас вечер" истинно, если хотя бы одно из составляющих его высказываний истинно. То есть, если сейчас лето или вечер (или оба утверждения истинны), то всё высказывание считается истинным.

### Отрицание (НЕ):

Обозначается как "НЕ" или "¬".

Высказывание "Сейчас НЕ лето" истинно, если исходное высказывание "Сейчас лето" ложно. Отрицание инвертирует истинностное значение высказывания.

Эти основные логические операторы и высказывания используются для построения более сложных логических структур в математике, философии и программировании. Они позволяют формализовать и анализировать утверждения, условия и аргументы.

## Логические выражения в Java

Логические выражения в Java играют ключевую роль в управлении потоком выполнения программ и принятии решений. Они часто включают в себя операторы сравнения и логические операторы.

### Операторы сравнения:

Применяются к числовым типам данных и символам для оценки отношений между ними.

> (Больше) Проверяет, что левый операнд больше правого.
< (Меньше) Проверяет, что левый операнд меньше правого.
== (Равно) Проверяет равенство двух операндов.
>= (Больше или равно) Проверяет, что левый операнд больше или равен правому.
<= (Меньше или равно) Проверяет, что левый операнд меньше или равен правому.
!= (Не равно) Проверяет, что два операнда не равны.

#### Логические операторы:

Используются для соединения или инвертирования логических выражений.

&& (И) Логическое "И", возвращает true, если оба операнда истинны.
|| (ИЛИ) Логическое "ИЛИ", возвращает true, если хотя бы один из операндов истинен.
! (НЕ) Логическое "НЕ", инвертирует значение операнда.

boolean a, b, c;
int x = 5;

// Пример использования оператора сравнения
a = x > 6;     // a будет false, потому что 5 не больше 6
b = x < 6;     // b будет true, потому что 5 меньше 6
c = !(a || b);  // c будет false, потому что 'a' false, 'b' true, a | b дает true, и ! инвертирует это в false






</details>
