// async function getTodos() {
// }


// Аналог вот этого кода:
// fetch('https://jsonplaceholder.typicode.com/todos')
// .then((response) => {return response.json()})
// .then((data) => {
//     console.log(data)
// });

const getTodos = async () => {
    try {
        const response = await fetch('https://jsonplaceholde.typicode.com/todos');
        const data = await response.json();
        console.log(data);
    } catch {
        console.log('Произошла непредвиденная ошибка')
    } finally {
        console.log('Этот код сработает в любом случае')
    }
}
getTodos();


console.log('Асинхронную функцию запустили, и пошли дальше');

