// MAP

const arr123 = [5, 10, 30];

const multiple2 = (x) => {
  return x * 2;
};

const arr123modified = arr123.map(multiple2);
console.log(arr123modified);

const arrOfPeople = [
  { name: 'John', age: 12 },
  { name: 'Bred', age: 5 },
  { name: 'Patrick', age: 20 },
  { name: 'Cris', age: 40 },
];

const arrOfPeopleModified = arrOfPeople.map(addAnniversary);
console.log(arrOfPeopleModified);

// Способы обьявления функций

// function declaration
// function NameOfFunction() {
// }

// function expression
// const NameOfFunction = function() {
// }

// function expression with arrow function
// const NameOfFunction = () => {
// }

function addAnniversary(human) {
  const resultObj = {};
  resultObj.name = human.name;
  resultObj['age'] = human['age'];
  //let isAdult;
  // if(resultObj.age >= 18) {
  //     isAdult = true
  // } else {
  //     isAdult = false
  // }
  const isAdult = resultObj.age >= 18 ? true : false;
  resultObj['anniversary'] = isAdult;
  return resultObj;
}

// Классная работа
// С помощью map и callback функции (которая как аргумент в map) для нашего массива
// добавим всем +1 год в свойство age

// const arrOfPeople = [
//     { name: 'John', age: 12 },
//     { name: 'Bred', age: 5 },
//     { name: 'Patrick', age: 20 },
//     { name: 'Cris', age: 40 },
//   ];

const addAgeFunc = (human) => {
  const resultObj = { ...human };
  resultObj['age'] = human['age'] + 1;
  return resultObj;
};
const addAge = arrOfPeople.map(addAgeFunc);
console.log(addAge);

// spread
// const sourceArray = [1, 2, 3];
// const copyOfArray = [...sourceArray];

// const sourceObj = { name: 'John', age: 12 };
// const copyOfObj = {...sourceObj};

// FILTER
const arrayOfNumber = [18, 59, 1, 8, 17, 111];

// const filter18 = (num) => {
//   if (num >= 18) {
//     return true;
//   } else {
//     return false;
//   }
// };

// const filter18 = (num) => num >= 18 ? true: false;

// const filter18 = num => num >= 18;

const arrayOfNumber18Plus = arrayOfNumber.filter(num => num >= 18);
console.log(arrayOfNumber18Plus);


// Классная работа 2
// const arrOfPeople = [
//     { name: 'John', age: 12 },
//     { name: 'Bred', age: 5 },
//     { name: 'Patrick', age: 20 },
//     { name: 'Cris', age: 40 },
//   ];
// С помощью функции filter вернем массив который содержит только элементы
// у которых age >=18

const filet18PlusForObjects = (human) => {
    if (human.age >= 18) {
        return true
    } else {
        return false
    }
}

console.log(arrOfPeople.filter(filet18PlusForObjects));
