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

// Complete the countTriplets function below.
function countTriplets(arr, r) {
    let potential = {};
    let counter = {};
    let count = 0;
    for (let i = 0; i < arr.length; i++){
        const a = arr[i];
        const key = Math.floor(a / r);
        if ((key in counter) && a % r == 0)
            count += counter[key];

        if ((key in potential) && a % r == 0) {
            const c = potential[key];
            const d = a in counter ? counter[a] + c : c;
            counter[a] = d;
        }

        const e = a in potential ? potential[a] + 1 : 1;
        potential[a] = e;
    }
    return count;
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const nr = readLine().replace(/\s+$/g, '').split(' ');

    const n = parseInt(nr[0], 10);

    const r = parseInt(nr[1], 10);

    const arr = readLine().replace(/\s+$/g, '').split(' ').map(arrTemp => parseInt(arrTemp, 10));

    const ans = countTriplets(arr, r);

    ws.write(ans + '\n');

    ws.end();
}
