console.log('Start');
// const userName = prompt('Введите ваше имя:');
const inputNameElement = document.querySelector('#user-name');
const buttonElement = document.querySelector('button');


inputNameElement.addEventListener('change', () => {
// console.log('Инпут изменен');
const userName = inputNameElement.value;
console.log(`Привет, ${userName}`);
})

buttonElement.addEventListener('click', () => {
    console.log('Click');
})


console.log('Старт цикла')
for (let i = 0; i < 8000000000; i++) {
}
console.log('Конец цикла');

console.log(`Конец выполнения кода`);
