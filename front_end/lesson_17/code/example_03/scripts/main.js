const divElement = document.querySelector('#int');
let i = 0;
console.log('Start');

const intervalId = setInterval(() => {
  console.log(new Date());
}, 2000);

setTimeout(() => {
  clearInterval(intervalId);
}, 10000);


const timeIntervalID = setInterval(() => {
  if (i >= 3) {
    clearInterval(timeIntervalID);
  }
  divElement.textContent = i;
  i++;
}, 1000);


// неверное решение
// setInterval(() => {
//     if (i <= 3) {
//         divElement.textContent = i;
//         i++;
//     }
//   }, 1000);