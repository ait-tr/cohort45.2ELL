console.log('Start');

const setTimeID = setTimeout(
    () => {
        console.log('timeout 5000a')
    },
    5000
);

console.log(setTimeID);

setTimeout(
    () => {
        console.log('timeout 5000b')
    },
    5000
);

clearTimeout(setTimeID);

console.log('Finish');


// function exapmple() {
//     console.log(1);
//     return undefined;
// }

// const resultExFunction = exapmple();
