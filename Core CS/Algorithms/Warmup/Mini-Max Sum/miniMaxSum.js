'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.replace(/\s*$/, '')
        .split('\n')
        
        .map(str => str.replace(/\s*$/, ''));

    main();
});

function readLine() {
    return inputString[currentLine++];
}

// Complete the miniMaxSum function below.
function miniMaxSum(arr) {
    let ma = 1
    let mi = 1000000000
    let s = 0
    for(let i = 0;i < 5;i++){
        s += arr[i]
        if(arr[i] > ma) 
            ma = arr[i]
        if(arr[i] < mi) 
            mi = arr[i]
    }
    console.log(String(s - ma) + " " + String(s - mi))
}

function main() {
    const arr = readLine().split(' ').map(arrTemp => parseInt(arrTemp, 10));

    miniMaxSum(arr);
}
