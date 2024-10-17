// array sort
const arrExapmle = [3, 1, 9, 27, 27, 11];
console.log(arrExapmle);

const arrExampleSorted = arrExapmle.sort((a, b) => {
  return a - b;
  // if(a < b) {
  //     return -1000
  // } else if (a = b) {
  //     return 0
  // } else {
  //     return 100500
  // }
});

console.log(arrExampleSorted);
console.log(arrExapmle);

// предварительное копирование

//[...arrExapmle]
//someFunction(...arrExapmle)

// const copyOfarrExapmle = [...arrExapmle];
// const arrExampleSortedAlt = copyOfarrExapmle.sort((a, b) => a - b);
const arrExampleSortedAlt = [...arrExapmle].sort((a, b) => a - b);

const people = [
  { name: 'Alice', age: 23 },
  { name: 'Bob', age: 45 },
  { name: 'Charlie', age: 30 },
  { name: 'David', age: 54 },
  { name: 'Eva', age: 29 },
  { name: 'Frank', age: 37 },
  { name: 'Grace', age: 40 },
  { name: 'Hannah', age: 22 },
  { name: 'Ian', age: 34 },
  { name: 'Julia', age: 31 },
  { name: 'Kevin', age: 26 },
  { name: 'Laura', age: 44 },
  { name: 'Michael', age: 52 },
  { name: 'Nina', age: 27 },
  { name: 'Oscar', age: 35 },
];

console.log([...people].sort((a, b) => a.age - b.age));

// Классная работа
// Отсортировать по алфавиту

console.log([...people].sort((a, b) => a.name - b.name));

const peopleExtended = [
  { name: 'Alice', age: 23, isActive: true },
  { name: 'Bob', age: 45, isActive: false },
  { name: 'Charlie', age: 30, isActive: true },
  { name: 'David', age: 54, isActive: false },
  { name: 'Eva', age: 29, isActive: true },
  { name: 'Frank', age: 37, isActive: false },
  { name: 'Grace', age: 40, isActive: true },
  { name: 'Hannah', age: 22, isActive: false },
  { name: 'Ian', age: 34, isActive: true },
  { name: 'Julia', age: 31, isActive: false },
  { name: 'Kevin', age: 26, isActive: true },
  { name: 'Laura', age: 44, isActive: false },
  { name: 'Michael', age: 52, isActive: true },
  { name: 'Nina', age: 27, isActive: false },
  { name: 'Oscar', age: 35, isActive: true },
];

console.log([...peopleExtended].sort((a, b) => b.isActive - a.isActive));

// array slice
const firstFivePeople = peopleExtended.slice(0, 5);
console.log(firstFivePeople);

