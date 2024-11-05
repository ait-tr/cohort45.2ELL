### Async-Await:


`async` и `await` - это синтаксический сахар в JavaScript, предназначенный для более удобной работы с асинхронным кодом, основанным на промисах.


```javascript
async function fetchData() {
  try {
    const response = await fetch('https://api.example.com/data');
    if (!response.ok) {
      throw new Error('Network response was not ok');
    }
    const data = await response.json();
    console.log(data);
  } catch (error) {
    console.error('Error:', error);
  } finally {
    console.log('Request completed.');
  }
}


// Вызов асинхронной функции
fetchData();
```


### Продолжение Работы с Fetch:


Использование `async` и `await` с `fetch` делает код более легким для чтения и управления.


```javascript
async function fetchData() {
  try {
    const response = await fetch('https://api.example.com/data');
    if (!response.ok) {
      throw new Error('Network response was not ok');
    }
    const data = await response.json();
    console.log(data);
  } catch (error) {
    console.error('Error:', error);
  } finally {
    console.log('Request completed.');
  }
}


fetchData();
```


### Try, Catch, Finally:


`try`, `catch` и `finally` используются для обработки ошибок в JavaScript.


- **`try`:** Блок, в котором выполняется потенциально вызывающий ошибку код.
- **`catch`:** Блок, в котором обрабатываются ошибки, возникшие в блоке `try`.
- **`finally`:** Блок, который выполняется всегда, независимо от того, была ошибка или нет.


```javascript
try {
  // Код, который может вызвать ошибку
  throw new Error('This is an error.');
} catch (error) {
  // Обработка ошибки
  console.error('Caught an error:', error.message);
} finally {
  // Блок, который выполняется всегда
  console.log('This block always runs.');
}
```


В приведенном примере, если код в блоке `try` вызывает ошибку, управление переходит в блок `catch`, где происходит обработка ошибки. Блок `finally` всегда выполняется независимо от наличия ошибок.