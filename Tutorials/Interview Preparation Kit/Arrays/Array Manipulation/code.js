'use strict';

const fs = require('fs');

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

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);
    const nm = readLine().split(' ');
    const n = parseInt(nm[0], 10);
    const m = parseInt(nm[1], 10);
    let x = 0;
    let max = 0;

    let a = Array.from(Array(n+1), () => 0)

    for (let i = 0; i < m; i++){
        let queries = readLine().split(' ').map(queriesTemp => parseInt(queriesTemp, 10));
        a[queries[0]] += queries[2];
        if (queries[0] + 1 <= n)
            a[queries[0] + 1] -= queries[2];
    }

    for (let i = 1; i <= n; i++) {
        x = x + a[i];
        if (max < x)
            max = x;
    }

    ws.write(max + "\n");

    ws.end();
}
