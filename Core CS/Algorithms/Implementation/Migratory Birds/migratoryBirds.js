'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', function(inputStdin) {
    inputString += inputStdin;
});

process.stdin.on('end', function() {
    inputString = inputString.split('\n');

    main();
});

function readLine() {
    return inputString[currentLine++];
}

function migratoryBirds(ar) {
    let r = Array(0, 0, 0, 0, 0);

    for (let i = 0;i < ar.length;i++){
        r[ar[i]-1]++;
    }
    
    let mx = 0;
    let mx_i = 0;
    for(let i = 0;i < 5;i++){
        if(r[i] > mx){
            mx = r[i];
            mx_i = i;
        }
    }
       
    return mx_i + 1;
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const arrCount = parseInt(readLine().trim(), 10);

    const arr = readLine().replace(/\s+$/g, '').split(' ').map(arrTemp => parseInt(arrTemp, 10));

    const result = migratoryBirds(arr);

    ws.write(result + '\n');

    ws.end();
}
