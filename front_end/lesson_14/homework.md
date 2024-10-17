## Домашнее задание.
Все таски будут касаться вот этого массива игроков-объектов:

```
let players = [
{name: "Alex", height: 190, weight: 85, sport: "rugby"},
{name: "Boris", height: 180, weight: 75, sport: "football"},
{name: "Vladimir", height: 175, weight: 70, sport: "hockey"},
{name: "George", height: 185, weight: 80, sport: "rugby"},
{name: "Dmitry", height: 170, weight: 65, sport: "hockey"},
{name: "Eugene", height: 195, weight: 90, sport: "football"},
{name: "Zachary", height: 188, weight: 82, sport: "rugby"},
{name: "Ivan", height: 182, weight: 77, sport: "football"},
{name: "Kirill", height: 178, weight: 73, sport: "hockey"},
{name: "Leonid", height: 192, weight: 87, sport: "rugby"},
{name: "Michael", height: 176, weight: 71, sport: "hockey"},
{name: "Nicholas", height: 198, weight: 93, sport: "football"},
{name: "Oleg", height: 186, weight: 79, sport: "rugby"},
{name: "Paul", height: 174, weight: 69, sport: "hockey"},
{name: "Roman", height: 184, weight: 78, sport: "football"}
];
```

1. Написать функцию, которая будет принимать 2 аргумента. Первый аргумент - массив, где элементы это обьекты, описывающие
неких людей. У каждого обьекта обязательно есть свойство "name". Наших массив players как пример подходит. Второй аргумент - это строка. Входящая строка должна состоять только из одной буквы.

Функция должна вернуть массив из обьектов, отфильтрованных так, чтобы были только обьекты где имя начинается на букву, которая переданна вторым аргументом.

2. Есть массив обьектов ссылок со свойствами text и href. Тут нам нужна страничка. Нужно выввести на страничку все ссылки из массива в виде списка ul.  Пример массива ссылок:

```
const links = [
    {
      text: "Главная",
      href: "/",
    },
    {
      text: "О нас",
      href: "/about/",
    },
    {
      text: "Цены",
      href: "/price/",
    },
    {
      text: "Контакты",
      href: "/contacts/",
    },
  ];
```
