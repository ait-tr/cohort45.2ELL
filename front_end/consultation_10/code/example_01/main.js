const arrOfNumbers = [2, 4, 5, 10, 15];

console.log(...arrOfNumbers);

console.log(Math.min(...arrOfNumbers));

const arrOfNumbers2 = [0, 1, ...arrOfNumbers];

console.log(arrOfNumbers2);

const arrOfNumbersMod = [...arrOfNumbers];

arrOfNumbersMod.push('last element');

console.log(arrOfNumbers);
console.log(arrOfNumbersMod);



// const arrOfNumbers = [2, 4, 5, 10, 15];
// Из массива элементов, сделать новый массив такой же длины,
// где каждый элемент = квадрату элемента из начального массива
// В данном случае должно получится [4, 16, 25, 100, 225]