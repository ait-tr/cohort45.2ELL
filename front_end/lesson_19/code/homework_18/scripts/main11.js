const buttonAll = document.querySelector("#all");
const buttonCompleted = document.querySelector("#completed");
const buttonUncompleted = document.querySelector("#uncompleted");
const buttonCreate = document.querySelector("#create");
const taskInput = document.querySelector(".task-input");
const list = document.querySelector(".list");
const arrElements = [];


function addElement(name) {
    const obj = {};
    //  let val = `list${Math.floor(Math.random() * 500)}`
    let val = `list${arrElements.length}`
    obj.key = val;
    obj.name = name;
    obj.value = false; // false == uncompleted
    arrElements.push(obj);
  
};

buttonCreate.addEventListener("click", function () { addElement(taskInput.value); displayList("all"); });
buttonAll.addEventListener("click", function () { displayList("all") });
buttonCompleted.addEventListener("click", function () { displayList("completed") });
buttonUncompleted.addEventListener("click", function () { displayList("uncompleted") });


function displayList(filterParam) {
    list.innerHTML = "";

    arrElements.forEach(element => {
        const newListItemElement = document.createElement("li");
        newListItemElement.textContent = element.name;
        newListItemElement.id = element.key;
        newListItemElement.classList.add("list-item");

        if (element.value) {
            newListItemElement.classList.add("list-item_done");
            // применяет стиль с перечеркиванием к выполненному элементу
        }
        
        newListItemElement.addEventListener("click", function () {
            changeStatus(newListItemElement.id);
            displayList("all");
            // применяет  функцию , которая меняет статус на противоположный
        })

        if (((filterParam == "completed")||(filterParam == "all")) && (element.value)) {
            list.append(newListItemElement);
        }
        if (((filterParam == "uncompleted")||(filterParam == "all")) && (!element.value)) {
            list.append(newListItemElement);
        }
 
    });
function changeStatus(id) {
    //alert(id);
    arrElements.forEach(element => {
        if (element.key == id) { element.value = !element.value; }
    })
}}

