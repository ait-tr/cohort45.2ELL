
// String(xxx);
// Number*(xxx);
// Boolean(xxx);


/* to string */
console.log('17 to string is ' + String(17));
console.log('-17.17 to string is ');
console.log('false to string is ');
console.log('null to string is ');
console.log('undefined to string is ');
console.log('0 to string is ' + String(0));

/* to number */
console.log("'17' to number is " + Number('17'));
console.log('true to number is ');
console.log('false to number is ');
console.log('null to number is ' + Number(null));
console.log('undefined to number is ');
console.log("'   20   ' to number is ");
console.log("'      ' to number is ");
console.log("'   30d   ' to number is ");

/* to boolean */
console.log('null to boolean is ');
console.log('undefined to boolean is ');
console.log('0 to boolean is ');
console.log('-0 to boolean is ' + Boolean(-0)); // false
console.log('NaN to boolean is ');
console.log("'' to boolean is ");
console.log("' ' to boolean is ");
console.log('17 to boolean is ');
console.log("'Hello' to boolean is ");


// task 2

const a = 17;
const b = 5;

a > b;
a <= b;
a == b;
a != b;

'a' < 'b';
'ab' > 'a';


'17' > 1;

17 === 1;
17 === 17;
console.log(17 === '17');
17 === true;
'0' === '';
true === false;
true === true;
null === undefined;
false === 0;

console.log(17 == '17');
'0' == '';
0 == '';
null == undefined;
false == 0;

undefined == null;
undefined == 0;
null == 0;
undefined < 0;
undefined > 0;
