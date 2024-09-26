// Циклы

const b = ["a", 2, 3, 4, 5, 6, 7, 8, 9, "end"];
let allElementsOfArray = '';

for (let i = 0; i < b.length; i++) {
    // console.log("Это проход цикла номер " + i);
    // console.log(b[i]);
    allElementsOfArray = allElementsOfArray + " " + b[i];
}
console.log(allElementsOfArray);


// Цыкл while

let j = 0; // делаем счетчик
while(j < b.length) {
    allElementsOfArray = allElementsOfArray + " " + b[j];
    j++;
}

const arrC = [];
// Заполнить массив числами от 5 до 9, должно получиться [5, 6, 7, 8, 9]
// использовать .push()
// использовать цикл

for(let i = 0; i < 5; i++) {
    arrC.push(i + 5);
}

let x = 5;
while(x < 10) {
    arrC.push(x);
    x++;
}

console.log(arrC);