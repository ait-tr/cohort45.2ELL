const resultOfFunctionDeclaration = countSymbolsFD("Hello!!!");
console.log(resultOfFunctionDeclaration);

const countSymbols = (text) => {
    const resultOfFunc = (typeof text === "string") ? text.length : 'Не строка';
    return resultOfFunc;
}

function countSymbolsFD(text) {
    const resultOfFunc = (typeof text === "string") ? text.length : 'Не строка';
    return resultOfFunc;
}

const resultOfArrowFunction = countSymbols("Hello!");
console.log(resultOfArrowFunction);

