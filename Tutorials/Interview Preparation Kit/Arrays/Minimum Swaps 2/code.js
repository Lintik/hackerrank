'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', function() {
    inputString = inputString.replace(/\s*$/, '')
        .split('\n')
        .map(str => str.replace(/\s*$/, ''));

    main();
});

function readLine() {
    return inputString[currentLine++];
}

// Complete the minimumSwaps function below.
function minimumSwaps(arr) {
    let c = 0;
    let index = new Array(arr.length);

    for (let i = 0; i < arr.length; i++) {//create a dictionary that returns the index
        index[arr[i] - 1] = i;
    }

    for (let i = 0; i < arr.length - 1; i++) {
        if (arr[i] != i + 1) {
            c++;

            //swap arr
            let t_arr = arr[i];
            arr[i] = i + 1;
            arr[index[i]] = t_arr;

            //swap index
            let t = index[i];
            index[i] = i;
            index[t_arr - 1] = t;
        }
    }

    return c;
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const n = parseInt(readLine(), 10);

    const arr = readLine().split(' ').map(arrTemp => parseInt(arrTemp, 10));

    const res = minimumSwaps(arr);

    ws.write(res + '\n');

    ws.end();
}
