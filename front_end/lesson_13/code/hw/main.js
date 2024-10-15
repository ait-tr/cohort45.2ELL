// ## Задание.

// 1. Напишите фукнцию, которая будет принимать массив. Массив может содержать
// любые строки и числа. Функция должна вернуть объект, который содержит свойства,
// ключ и значение которых равны соответствующему элементу массива.
// Пример работы функции:
// ```
// ['a', 36.6, 'John Doe'] ==> { a: 'a', '36.6': 36.6, 'John Doe': 'John Doe' }
// ```

const arrayToObj = (arr) => {
  const resultObj = {};
  arr.forEach((element) => {
    resultObj[element] = element;
  });

  return resultObj;
};

const res1 = arrayToObj(['a', 36.6, 'John Doe']);
console.log(res1);

// 2. Напишите функцию, которая превратит массив который содержит элементы в виде массивов из двух элементов, в объект.
//    Первый элемент каждого внутреннего массива ключ, второй - значение. Например такой:

// ```
// [
//   [ 'height', 170 ],
//   [ 'weight', 80 ],
//   [ 'sport', 'regbi' ],
//   [ 'full name', 'John Doe' ],
//   [ 'sing', 'love' ],
//   [ 'speed', 90 ]
// ]
// ```

const arr2ToObj = (arr) => {
  resultObj = {};
  arr.forEach((element) => {
    resultObj[element[0]] = element[1];
  });
  return resultObj;
};

console.log(
  arr2ToObj([
    ['height', 170],
    ['weight', 80],
    ['sport', 'regbi'],
    ['full name', 'John Doe'],
    ['sing', 'love'],
    ['speed', 90],
  ])
);

// Object.keys(), Object.values(), Object.entries();

