// String[] arr = [5]; // Java

const arrA = [1, 3, 5, "abcd", true, null, undefined, [10, 100], {a: 67}]; // переменная называется arrA

const b = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

const firstElemOfB = b[6];
console.log(firstElemOfB);
console.log(b.length); // показывает длину массива


const resultOfPush = b.push("new last element"); // добавляет элемент в конец
console.log(b);
console.log(resultOfPush);
const resultOfPop = b.pop(); // удаляет последний элемент из массива и возвращает его
console.log(b);
console.log(resultOfPop);


b.unshift("new FIRST ELEMENT"); // добавляет элемент в начало массива
console.log(b);
b.shift(); // удаляет первый элемент из массива и возвращает его
console.log(b);

