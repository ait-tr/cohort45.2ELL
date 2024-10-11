// 1. Напишите фукнцию, которая будет принимать массив. Массив может содержать
// любые строки и числа. Функция должна вернуть объект, который содержит свойства,
//   ключ и значение которых равны соответствующему элементу массива.
//   Пример работы функции:
//
// ['a', 36.6, 'John Doe'] ==> { a: 'a', '36.6': 36.6, 'John Doe': 'John Doe' }
//

const arrToObject = (array) => {
  const resultObject = {};
  // for (let i = 0; i < arr.length; i++) {
  //     resultObject[arr[i]] = arr[i];
  // }
  array.forEach((e) => {
    resultObject[e] = e;
  });
  return resultObject;
};

console.log(arrToObject(['a', 36.6, 'John Doe']));
console.log(arrToObject(['a', 'name', 5, 10]));

// 2. Напишите функцию, которая превратит массив который содержит элементы в виде массивов из двух элементов, в объект.
//    Первый элемент каждого внутреннего массива ключ, второй - значение. Например такой:

// [
//   [ 'height', 170 ],
//   [ 'weight', 80 ],
//   [ 'sport', 'regbi' ],
//   [ 'full name', 'John Doe' ],
//   [ 'sing', 'love' ],
//   [ 'speed', 90 ]
// ]

// {
//   'height': 170,
//   'weight', 80,
//   ...
// }

const arrayToObj = (array) => {
  const resultObject = {};
  array.forEach((elem) => {
    resultObject[elem[0]] = elem[1];
  });
  return resultObject;
};

console.log(
  arrayToObj([
    ['height', 170],
    ['weight', 80],
    ['sport', 'regbi'],
    ['full name', 'John Doe'],
    ['sing', 'love'],
    ['speed', 90],
  ])
);


const exampleArray = [


    ['height', [6, 10]], 
    ['weight', 80],
    ['sport', 'regbi'],
    ['full name', 'John Doe'],
    ['sing', 'love'],
    ['speed', 90],


  ]

  console.log(exampleArray[0][1][0]);