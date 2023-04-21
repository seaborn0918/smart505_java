let input = prompt('입력 >>');
let inputArr = [...input];

function replace(inputArr) {

    for (let i = 0; i < inputArr.length; i++) {
        if (inputArr[i] === 'q') {
            inputArr[i] = 'e';
        }
    }
    inputArr.join();
    console.log(inputArr.join());
}