const buttonAll = document.querySelector("#all");
//const buttonCompleted = document.querySelector("#completed");
//const buttonUncompleted = document.querySelector("#uncompleted");
const buttonCreate = document.querySelector("#create");
const taskInput = document.querySelector(".task-input");
const list = document.querySelector(".list");

let arrElements = [];
// let toDoFilter = [false,true];

fetch('https://jsonplaceholder.typicode.com/todos')
.then((response) => {return response.json()})
.then((body) => {
    const transformedTasks = body.slice(0, 15).map(transformTask);
    arrElements = [...arrElements, ...transformedTasks];
    displayList("all");
});

function transformTask(task) {
    const transformedTask = {};
    transformedTask.name = task.title;
    transformedTask.value = task.completed;
    return transformedTask;
    // тело функции могло быть таким:
    // return {
    //     name: task.title,
    //     value: task.completed
    // }
}


const buttonStatus = document.querySelector(".status");
buttonStatus.addEventListener("click",displayFilteredTasks);

function displayFilteredTasks (evt){
evt.target.id
console.log(evt.target);
}


function addElement(name) {
    const obj = {};
    // let val = `list${Math.floor(Math.random() * 500)}`
   // let val = `list${arrElements.length}`;
    //let val = 1;
   // obj.key = val;
    obj.name = name;
    obj.value = false; // false == uncompleted
    arrElements.push(obj);// добавили один объект в м.
    //  alert(arrElements.length)
};

buttonCreate.addEventListener("click", function () {
    addElement(taskInput.value);
    displayList("all");
});


const oneButtonAll = [ "Все", "Выполненные ", "Невыполненные"];
let currIndex = 0;
let index = 1;

buttonAll.addEventListener("click",function (){ 
    currIndex = index;
    index = (index + 1) % oneButtonAll.length;
    buttonAll.textContent = oneButtonAll[index];  //  текст кнопки на текущий элемент массива
    if ( currIndex == 0){displayList("all") }
    if ( currIndex == 1){displayList("completed") }
    if ( currIndex == 2){displayList("uncompleted") }
})

//buttonAll.addEventListener("click", function () { displayList("all") });
//buttonCompleted.addEventListener("click", function () { displayList("completed") });
//buttonUncompleted.addEventListener("click", function () { displayList("uncompleted") });

function displayList(filterParam) {
    list.innerHTML = "";// очистить список

    const elementsToShow = arrElements.filter(element => {
        if (filterParam === "all") {
            return true;
        } else if (filterParam == "completed") {
            return element.value;
        } else if (filterParam == "uncompleted") {
            return !element.value;
        }
    })
    elementsToShow.forEach(element => {
        const newListItemElement = document.createElement("li");
        newListItemElement.textContent = element.name;
       // newListItemElement.id = element.key;
        newListItemElement.classList.add("list-item");
        if (element.value) {
            newListItemElement.classList.add("list-item_done");
        }
        // применяет стиль с перечеркиванием к выполненному элементу

        newListItemElement.addEventListener("click", function () {
           element.value = !element.value;
            displayList("all");
            // применяет  функцию , которая меняет статус на противоположный

        })
        list.append(newListItemElement);
    })
}

