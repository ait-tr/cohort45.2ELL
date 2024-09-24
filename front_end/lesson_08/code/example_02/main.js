// Coersion - преобразование данных из одного типа в другой

const a = "abc"; // string
const b = "145"; // string
console.log(typeof b);
const z = 145; // number
const b2 = ""; // string (значение пустая строка)
const c = undefined;
const d = null;
const f = true;
const e = false;

//  преобразование в число
console.log("====== to Number ======");
const bToNumber = Number(b);
console.log(bToNumber);
console.log(typeof bToNumber);

const aToNumber = Number(a);
console.log(aToNumber);
console.log(typeof aToNumber);

console.log(Number(b2));
console.log(Number(c));
console.log(Number(d));
console.log(Number(f)); 
console.log(Number(e));

// Преобразование в строку
console.log("====== to String ======");
console.log(String(z));
console.log(String(c));
console.log(String(d));
console.log(String(f)); 
console.log(String(e));


// Преобразование в булево значение
console.log("====== to Boolean ======");

console.log(Boolean(b)); // true
console.log(Boolean(z)); // true
console.log(Boolean(b2)); // false
console.log(Boolean(c)); // false
console.log(Boolean(d)); // false

