// Напишем функцию, которая принимает как аргумент массив из чисел
// (мы знаем точно что аргументом будет массив из чисел)
// Функция возвращает нам массив такой же длины, где каждый элемент массива возведен в квадрат
// Функция должна быть стрелочной

const functionPow = x => x**2;

const ArrayFunc = (arr) => {
  const element = [];
  for (let index = 0; index < arr.length; index++) {
    element.push(functionPow(arr[index]));
    // element[index] = arr[index] * arr[index];
    // element.push(arr[index] * arr[index])
  }
  return element;
};

// const ArrayFunc = (arr) => {
//   const element = [];
//   for (let index = 0; index < arr.length; index++) {
//     element[index] = arr[index] * arr[index];
//     // element.push(arr[index] * arr[index])
//   }
//   return element;
// };

console.log(ArrayFunc([1, 2, 3, 4, 5, 6, 7, 8, 9]));

