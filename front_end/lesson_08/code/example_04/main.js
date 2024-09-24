// условный оператор
const age = 5;

if (age < 12) {
  console.log('Вы ребенок');
} else if (age < 18) {
  console.log('Вы подросток');
} else {
  console.log('Вы взрослый');
}

if (age > 6) {
  console.log('Вы большой ребенок');
}

// swich
const day = 'Monday';

switch (day) {
  case 'Monday':
    console.log('Первый день недели');
    break;
  case 'Tuesday':
    console.log('Второй день недели');
    break;
  default:
    console.log('3 и дальше');
}

// тернарный оператор
const result = age < 18 ? 'Вы еще не взрослый' : 'Вы уже взрослый';

// с помощью if:
let resultWithIf;
if (age < 18) {
  resultWithIf = 'Вы еще не взрослый';
} else {
  resultWithIf = 'Вы уже взрослый';
}
