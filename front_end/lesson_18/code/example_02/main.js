console.log('Начало кода');
const randomJokePromise = fetch(
  'https://official-joke-api.appspot.com/random_joke'
);

console.log('Конец синхронного кода');

// const bodyOfRandomJoke = randomJokePromise.then(
//     (resultOfRequst) => {
//         return resultOfRequst.json();
//     }
// )

// bodyOfRandomJoke.then(
//     (body) => {
//         console.log(body)
//     }
// )

randomJokePromise
.then((resultOfRequst) => {
  return resultOfRequst.json();
})
.then(
    (body) => {
        doSomeWithResponseBody(body);
    }
)

// Можно сразу вот так, не присаивая промис в переменную
// fetch(
//     'https://official-joke-api.appspot.com/random_joke'
//   )
//   .then((resultOfRequst) => {
//     return resultOfRequst.json();
//   })
//   .then(
//       (body) => {
//           console.log(body)
//       }
//   )


function doSomeWithResponseBody(responseBody) {
    console.log(responseBody);
    const bodyElement = document.querySelector('body');
    const firstPartOfJokeElement = document.createElement('p');
    firstPartOfJokeElement.textContent = `${responseBody.setup} ${responseBody.punchline}`;
    bodyElement.append(firstPartOfJokeElement);
}