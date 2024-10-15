
const obj = { a: 'a', '36.6': 36.6, 'John Doe': 'John Doe' };



const valueOfObject = (n) => {
    const res = Object.values(n);
    let resultString = '';
    resultString = res.join(', ');

    // resultString = res + ', ';

    // res.forEach(
    //     (x) => {
    //         resultString = resultString + x + ', ';
    //     }
    // );

    return resultString

}


console.log(valueOfObject(obj));
