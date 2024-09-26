// Math

const randNumber = Math.random(); // возвращает случайное число от 0 до 1
console.log(randNumber);

const roundedNumber = Math.round(4.67);
console.log(roundedNumber);

const roundedNumberFloor = Math.floor(4.99);
console.log(roundedNumberFloor);

const roundedNumberCeil = Math.ceil(4.01);
console.log(roundedNumberCeil);

// Вывести в консоль случайное число от 1 до 10

console.log("Случайное число 0 до 10 = " + Math.round(Math.random() * 10));


// возведение в степень с помощью Math
const pow = Math.pow(2, 3); // 2**3
console.log(pow);


// min & max

const maxNumber = Math.max(1297, 4096, 2, 8, -4);
console.log(maxNumber);


// Класная работа 4
// Создадим пустой массив
// Заполним случайными числами от 0 до 10
// Длина массива 15

const arrX = [];
for(let i = 0; i < 15; i++) {
    arrX.push(Math.round(Math.random() * 10));
}
console.log(arrX);


