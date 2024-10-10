// *** Изменение существующего элемента (на странице)

// 1. Находим элемент
const h1Element = document.querySelector('.header');
console.log(h1Element);
// 2.a. Меняем текст внутри элемента
h1Element.textContent = 'Document Object Model';
// 2.b. Меняем набор классов (стилизацию)
h1Element.classList.add('red');
h1Element.classList.remove('blue');
// toggle - если клас есть удаляет, если нет добавляет
h1Element.classList.toggle('black');

// *** Удаление элементов со страницы

// 1. Находим элемент 
const linkToDeleteElement = document.querySelector('.link');
// console.log(linkToDeleteElement);
linkToDeleteElement.remove();


// *** Добавление новых элементов на страницу
// 1. Создаем новый элемент по тэгу
const newParagraphElement = document.createElement('p');
// 2.a. Меняем текст внутри элемента
newParagraphElement.textContent = 'Текст внутри параграфа';
// 3. Выбрать место куда и вставить новый элемент
// 3.1 Выбираем элемент относительного которого мы будем выбирать место вставки
const bodyElement = document.querySelector('body');
// 3.2 Выбираем метод которым будем вставлять в зависимости от желаемого места вставки
// перед закрывающим тэгом - append 
bodyElement.append(newParagraphElement);
// после открывающего тэга - prepend
// перед открывающим тэгом - before
// после закрывающего тэга - after


// *** Калькулятор ***
// Находим все элементы
const buttonElement = document.querySelector('button');
const resultElement = document.querySelector('.result');
// модификация querySelectorAll чтобы найти множество элементов
const inputElements = document.querySelectorAll('input');
// inputElements[0];
// inputElements[1];

//
buttonElement.addEventListener('click', buttonClickHandler);

function buttonClickHandler(){
   
    let s1 = inputElements[0].value;
    let s2 = inputElements[1].value;
    let summ = +s1 + +s2;
    resultElement.textContent = summ;
}
