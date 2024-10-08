const JohnyDepp = {
    name: 'John',
    surname: 'Depp',
    age: 61,
    hobbies: ['cricket', 'golf', 'quadrober', 'actor', 'singing'],
    films: {
        1999: ['Pirates-1', 'Edward Scissorhands', 'Sleepy Hollow'],
        2003: ['Pirates-3', 'Pitates-4'],
        2001: ['Pirates-2', 'Cocaine']
    },
    singing: function() {
        console.log('I am singing')
    },
}

const arrayExample = [1, 5, 10];

// Функция которая принимает аргумент и выводит его в консоль
const funcWhatToDoWithElement = (n) => {
    console.log(n);
}

// for (let i = 0; i < arrayExample.length; i++) {
//     funcWhatToDoWithElement(arrayExample[i])
// }

// Метод массива forEach сам организовует цикл, и для каждого
// элемента массива запускает колбэк функцию передавая ей как аргумент элемент массива
arrayExample.forEach(funcWhatToDoWithElement);


// Классная работа
// Выведем в консоль все ключи обьекта JohnyDepp
// Используя при этом методы .forEach() & .keys()

const keysOfJohny = Object.keys(JohnyDepp);
console.log(keysOfJohny);

keysOfJohny.forEach(funcWhatToDoWithElement);

// Вывести в консоль хобби Джонни использую forEach
JohnyDepp['hobbies'].forEach(funcWhatToDoWithElement);

// пример еще один вызова метода forEach
[1, 4, 8].forEach(funcWhatToDoWithElement);
