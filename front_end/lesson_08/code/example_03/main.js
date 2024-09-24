// Операции / операторы

// / * + - 

const resA = 25 / "5";
console.log(resA);
const resB = 25 * "5";
console.log(resB);
const resC = 25 / "a";
console.log(resC);
const resD = 25 - "15";
console.log(resD);
const resF = 25 / 0;
console.log(resF);

// **
console.log(2**4);

// другое поведение у + если есть строка
const resE = 25 + 25 + "5";
console.log(resE);
const resG = null + "5";
console.log(resG);

// унарный +
const resH = 25 + 25 + +"5";
console.log(resH);




// < > <= >= == === != (все приводиться к числу при нестрогом сравнении, и потом сравнивается)
console.log("------- == === -------");
const varA = 25;
const varB = "25";
console.log(varA == varB);
console.log(varA === varB);

const varC = true;
const varD = "25";
console.log(varA == varB);


const varE = false;
const varF = "0";
console.log(varE == varF);

// undefined & null (особое поведение, равны сами себе только при нестрогом сравнении)

const varG = undefined;
const varH = "";
console.log(varG == varH);

// сравнение строк
const varK = "a";
const varL = "b";

console.log(varK > varL);

const varM = "a";
const varN = "aa";

console.log(varM > varN);

const varO = "a";
const varP = "A";

console.log(varO > varP);


// && || 

console.log("John" && null && 145);

console.log(false || null || 145);

