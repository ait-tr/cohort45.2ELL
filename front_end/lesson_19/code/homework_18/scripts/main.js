const buttonAll = document.querySelector("#all");
const buttonCompleted = document.querySelector("#completed");
const buttonUncompleted = document.querySelector("#uncompleted");

const buttonCreate = document.querySelector("#create");
const taskInput = document.querySelector(".task-input");
const list = document.querySelector(".list");


const arrElements = [];
let toDoFilter = [true, false];

function addElement(name) {

    const obj = {};

    //  let val = `list${Math.floor(Math.random() * 500)}`

    let val = `list${arrElements.length}`
    obj.key = val;
    obj.name = name;
    obj.value = false; // false == uncompleted

    arrElements.push(obj);// добавили один объект в м.
    //  alert(arrElements.length)
};

buttonCreate.addEventListener("click", function () { addElement(taskInput.value); displayList(); });
//addElement(taskInput.value));


buttonAll.addEventListener("click", function () { toDoFilter = [true, false]; displayList() });
buttonCompleted.addEventListener("click", function () { toDoFilter = [true]; displayList() });
buttonUncompleted.addEventListener("click", function () { toDoFilter = [false]; displayList() });

// функция  добавляет элементы li в документ html 
function displayList() {

    list.innerHTML = "";// очистить список

    arrElements.filter(element => (toDoFilter.includes(element.value))).forEach(element => {
        const newListItemElement = document.createElement('li');
        // проверяет значение элемента true или false 

        newListItemElement.textContent = element.name;
        newListItemElement.id = element.key;
        newListItemElement.classList.add("list-item");

        if (element.value) newListItemElement.classList.add("list-item_done");
        // применяет стиль с перечеркиванием к выполненному элементу

        newListItemElement.addEventListener('click', function () {
            changeStatus(newListItemElement.id);
            displayList();
            // применяет  функцию , которая меняет статус на противоположный
        })

        list.append(newListItemElement);
    });
};


function changeStatus(id) {
    //alert(id);
    arrElements.forEach(element => {
        if (element.key == id) { element.value = !element.value; }

    })
}
