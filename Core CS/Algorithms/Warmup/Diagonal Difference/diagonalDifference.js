'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');
const fs = require('fs');

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

function checkPositive(e){
    return e > 0;
}

function checkNegative(e){
    return e < 0;
}

function checkZero(e){
    return e == 0;
}

// Complete the plusMinus function below.
function plusMinus(arr) {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);
    ws.write((arr.filter(checkPositive).length / arr.length).toFixed(6) + '\n');
    ws.write((arr.filter(checkNegative).length / arr.length).toFixed(6) + '\n');
    ws.write((arr.filter(checkZero).length / arr.length).toFixed(6) + '\n');
}

function main() {
    const n = parseInt(readLine(), 10);

    const arr = readLine().split(' ').map(arrTemp => parseInt(arrTemp, 10));

    plusMinus(arr);
}
