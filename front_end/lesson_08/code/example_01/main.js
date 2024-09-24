/* console.log("Hello world"); */


// Типы данных в JS
// 1. Number
// 2. Boolean
// 3. String
// 4. Undefined
// 5. Null
// 6. BigInt
// 7. Symbol

// 8. Object


// Обьявление переменных

let a = "a";
console.log(typeof a);
a = 5;
console.log(typeof a);

const b = "abc";
//b = 565;

const c = a;
console.log("c = " + c);
a = 10;
console.log("c = " + c);

// Ссылочный тип данных

const objA = {a: 1};
const objB = objA;
objA.a = 5;
console.log(objB);


// Значения в переменных
let x = null;
console.log(typeof x); // typeof null возвращает object
x = 10; // x - number

let y = 11;
// let z = Number("5"); // практически не используется для создания

var z = 10; // устаревшый способ

// Названия переменных
// a-Z
// 0-9
// _
// $
// нельзя начинать с цифры
// camelCase2
// нельзя использовать зарезервированный слова (for, class...)
